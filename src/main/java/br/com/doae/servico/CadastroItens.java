package br.com.doae.servico;

import br.com.doae.modelo.Item;
import br.com.doae.persistencia.ItemRepositorio;
import java.util.List;

public class CadastroItens {

    private final ItemRepositorio repositorio = new ItemRepositorio();

    public Item cadastrar(String nome, String descricao, String unidadeMedida) {

        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Informe o nome do item.");
        }

        if (unidadeMedida == null || unidadeMedida.isBlank()) {
            throw new IllegalArgumentException("Informe a unidade de medida.");
        }

        Item item = new Item(nome, descricao, unidadeMedida);
        repositorio.salvar(item);
        return item;
    }

    public List<Item> listar() {
        return repositorio.listarTodos();
    }

}
