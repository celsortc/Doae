package br.com.doae.modelo;

public class Doador {

    private final String nome;
    private final String contato;

    public Doador(String nome, String contato) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Informe o nome do doador.");
        }

        this.nome = nome.trim();
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public String getContato() {
        return contato;
    }

    @Override
    public String toString() {
        return nome;
    }
}
