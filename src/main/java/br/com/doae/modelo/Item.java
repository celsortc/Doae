package br.com.doae.modelo;

import java.util.Objects;

public class Item {

    private Integer id;
    private String nome;
    private String descricao;
    private String unidadeMedida;

    public Item(String nome,
            String descricao,
            String unidadeMedida) {

        this.nome = nome;
        this.descricao = descricao;
        this.unidadeMedida = unidadeMedida;
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

    public String getDescricao() {
        return descricao;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    @Override
    public boolean equals(Object outro) {
        if (this == outro) {
            return true;
        }
        if (!(outro instanceof Item item)) {
            return false;
        }
        return id != null && id.equals(item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return nome + " (" + unidadeMedida + ")";
    }

}
