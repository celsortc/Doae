package br.com.doae.servico;

import br.com.doae.modelo.Doador;
import br.com.doae.persistencia.DoadorRepositorio;
import java.util.List;

public class CadastroDoadores {

    private final DoadorRepositorio repositorio = new DoadorRepositorio();

    public Doador cadastrar(String nome, String contato) {

        Doador doador = new Doador(nome, contato);
        repositorio.salvar(doador);
        return doador;
    }

    public List<Doador> listar() {
        return repositorio.listarTodos();
    }

    public void excluir(Doador doador) {

        if (doador == null || doador.getId() == null) {
            throw new IllegalArgumentException("Selecione um doador para excluir.");
        }

        // Doador com doações registradas não pode sumir: o histórico depende dele.
        if (repositorio.possuiMovimentacoes(doador.getId())) {
            throw new IllegalArgumentException(
                    "Este doador possui doações no histórico e não pode ser excluído.");
        }

        repositorio.excluir(doador.getId());
    }

}
