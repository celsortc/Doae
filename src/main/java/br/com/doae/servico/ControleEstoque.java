package br.com.doae.servico;

import br.com.doae.modelo.Item;
import br.com.doae.modelo.Movimentacao;
import java.util.Map;
import java.util.List;
import br.com.doae.modelo.Doador;
import br.com.doae.modelo.TipoMovimentacao;
import java.time.LocalDateTime;
import br.com.doae.persistencia.MovimentacaoRepositorio;

/**
 *
 * @author celso
 */
public class ControleEstoque {

    private final MovimentacaoRepositorio repositorio = new MovimentacaoRepositorio();

    public void registrarEntrada(Item item,
            int quantidade,
            Doador doador,
            boolean anonima,
            String observacao) {

        if (item == null) {
            throw new IllegalArgumentException("Selecione um item.");
        }

        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }

        //impede anonima com doador identificado
        if (anonima && doador != null) {
            throw new IllegalArgumentException("Uma entrada anônima não deve ter doador identificado.");
        }
        //impede sem marcar anonimo e sem doador selecionado
        if (!anonima && doador == null) {
            throw new IllegalArgumentException(
                    "Selecione um doador ou marque Doação anônima."
            );
        }

        Movimentacao movimentacao = new Movimentacao(
                TipoMovimentacao.ENTRADA,
                item,
                quantidade,
                LocalDateTime.now(),
                observacao,
                doador,
                anonima
        );

        repositorio.inserir(movimentacao);

    }

    public void registrarSaida(Item item,
            int quantidade,
            String observacao) {

        int saldoAtual = repositorio.listarSaldos().getOrDefault(item, 0);

        if (item == null) {
            throw new IllegalArgumentException("Selecione um item.");
        }

        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }
        if (saldoAtual - quantidade < 0) {
            throw new IllegalArgumentException("Sem estoque suficiente");
        }

        Movimentacao movimentacao = new Movimentacao(
                TipoMovimentacao.SAIDA,
                item,
                quantidade,
                LocalDateTime.now(),
                observacao,
                null,
                false
        );

        repositorio.inserir(movimentacao);

    }

    public Map<Item, Integer> listarSaldos() {
        return repositorio.listarSaldos();
    }

    public List<Movimentacao> listarMovimentacoes() {
        return repositorio.listarTodas();

    }

}
