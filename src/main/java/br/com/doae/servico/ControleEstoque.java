/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.doae.servico;

import br.com.doae.modelo.Item;
import br.com.doae.modelo.Movimentacao;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import br.com.doae.modelo.Doador;
import br.com.doae.modelo.TipoMovimentacao;
import java.time.LocalDateTime;

/**
 *
 * @author celso
 */
public class ControleEstoque {

    private final Map<Item, Integer> saldos = new HashMap<>();
    private final List<Movimentacao> movimentacoes = new ArrayList<>();

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

        //Caso o item não exista ainda, ele define 0 para o estoque atual
        int saldoAtual = saldos.getOrDefault(item, 0);
        //Atualiza o saldo + quantidade cadastrada
        saldos.put(item, saldoAtual + quantidade);

        movimentacoes.add(movimentacao);

    }

    public void registrarSaida(Item item,
            int quantidade,
            String observacao) {

        int saldoAtual = saldos.getOrDefault(item, 0);

        if (item == null) {
            throw new IllegalArgumentException("Selecione um item.");
        }

        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }
        if(saldoAtual - quantidade < 0) {
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


        saldos.put(item, saldoAtual - quantidade);
        movimentacoes.add(movimentacao);

    }

    public Map<Item, Integer> listarSaldos() {
        return Map.copyOf(saldos);
    }

    public List<Movimentacao> listarMovimentacoes() {
        return List.copyOf(movimentacoes);
    }

}
