package br.com.doae.servico;

import br.com.doae.modelo.Doador;
import java.util.ArrayList;
import java.util.List;

public class CadastroDoadores {

    private final List<Doador> doadores = new ArrayList<>();

    public Doador cadastrar(String nome, String contato) {

        Doador doador = new Doador(nome, contato);
        doadores.add(doador);
        return doador;
    }

    public List<Doador> listar() {
        return List.copyOf(doadores);
    }

}
