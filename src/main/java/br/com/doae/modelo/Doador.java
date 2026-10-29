package br.com.doae.modelo;

import java.util.Objects;

public class Doador {

    private Integer id;
    private final String nome;
    private final String contato;

    public Doador(String nome, String contato) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Informe o nome do doador.");
        }

        this.nome = nome.trim();
        this.contato = contato;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getContato() {
        return contato;
    }

    @Override
    public boolean equals(Object outro) {
        if (this == outro) {
            return true;
        }
        if (!(outro instanceof Doador doador)) {
            return false;
        }
        return id != null && id.equals(doador.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return nome;
    }
}
