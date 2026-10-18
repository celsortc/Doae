/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.doae.servico;

import br.com.doae.modelo.Item;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author celso
 */
public class ControleEstoque {

    private final Map<Item, Integer> saldos = new HashMap<>();

    public void registrarEntrada(Item item, int quantidade) {
        if (item == null) {
            throw new IllegalArgumentException("Selecione um item.");
        }
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }
        //Caso o item não exista ainda, ele define 0 para o estoque atual
        int saldoAtual = saldos.getOrDefault(item, 0);
        //Atualiza o saldo + quantidade cadastrada
        saldos.put(item, saldoAtual + quantidade);
        System.out.println(saldoAtual+ ""+ (saldoAtual + quantidade));
    }

    public Map<Item, Integer> listarSaldos() {
        return Map.copyOf(saldos);
    }

}
