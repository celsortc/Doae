package br.com.doae.modelo;

import java.time.LocalDateTime;

public class Movimentacao {

    private TipoMovimentacao tipo;
    private Item item;
    private int quantidade;
    private LocalDateTime dataHora;
    private String observacao;
    private Doador doador;
    private boolean anonima;

    //Construtor
    public Movimentacao(TipoMovimentacao tipo,
            Item item,
            int quantidade,
            LocalDateTime dataHora,
            String observacao,
            Doador doador,
            boolean anonima) {

        this.tipo = tipo;
        this.item = item;
        this.quantidade = quantidade;
        this.dataHora = dataHora;
        this.observacao = observacao;
        this.doador = doador;
        this.anonima = anonima;
    }

    //getters and setters
    public TipoMovimentacao getTipo() {
        return tipo;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getObservacao() {
        return observacao;
    }

    public Doador getDoador() {
        return doador;
    }

    public boolean isAnonima() {
        return anonima;
    }
}
