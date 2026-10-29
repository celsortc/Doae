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

}
