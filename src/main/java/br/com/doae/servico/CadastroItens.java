package br.com.doae.servico;

import br.com.doae.modelo.Item;
import br.com.doae.persistencia.ItemRepositorio;
import java.util.List;

public class CadastroItens {

    private final ItemRepositorio repositorio = new ItemRepositorio();

    private void validar(String nome, String unidadeMedida) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Informe o nome do item.");
        }

        if (unidadeMedida == null || unidadeMedida.isBlank()) {
            throw new IllegalArgumentException("Informe a unidade de medida.");
        }
    }

    public Item cadastrar(String nome, String descricao, String unidadeMedida) {

        validar(nome, unidadeMedida);

        Item item = new Item(nome, descricao, unidadeMedida);
        repositorio.salvar(item);
        return item;
    }

    public List<Item> listar() {
        return repositorio.listarTodos();
    }

    public void atualizar(Item original, String nome, String descricao, String unidadeMedida) {

        if (original == null || original.getId() == null) {
            throw new IllegalArgumentException("Selecione um item para editar.");
        }
        validar(nome, unidadeMedida);
        // Trocar a unidade mudaria o significado das movimentações antigas.
        if (!unidadeMedida.equals(original.getUnidadeMedida())
                && repositorio.possuiMovimentacoes(original.getId())) {
            throw new IllegalArgumentException(
                    "A unidade não pode ser alterada: este item possui movimentações no histórico.");
        }

        Item atualizado = new Item(nome, descricao, unidadeMedida);
        atualizado.setId(original.getId());
        repositorio.atualizar(atualizado);
    }

    public void excluir(Item item) {

        if (item == null || item.getId() == null) {
            throw new IllegalArgumentException("Selecione um item para excluir.");
        }

        // Item com histórico não pode sumir: o estoque e o histórico dependem dele.
        if (repositorio.possuiMovimentacoes(item.getId())) {
            throw new IllegalArgumentException(
                    "Este item possui movimentações no histórico e não pode ser excluído.");
        }

        repositorio.excluir(item.getId());
    }

}
