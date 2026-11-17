package br.com.doae.persistencia;

import br.com.doae.modelo.Item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ItemRepositorio {

    public void salvar(Item item) {
        String sql = "INSERT INTO itens (nome, descricao, unidade_medida) VALUES (?, ?, ?)";

        try (Connection conexao = Conexao.abrir();
                PreparedStatement comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            //Seta string pra proteção do banco
            comando.setString(1, item.getNome());
            comando.setString(2, item.getDescricao());
            comando.setString(3, item.getUnidadeMedida());
            comando.executeUpdate();

            try (ResultSet chaves = comando.getGeneratedKeys()) {
                if (chaves.next()) {
                    item.setId(chaves.getInt(1));
                }
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Erro ao salvar o item no banco.", e);
        }
    }

    public List<Item> listarTodos() {
        String sql = "SELECT id, nome, descricao, unidade_medida FROM itens ORDER BY nome";
        List<Item> itens = new ArrayList<>();

        try (Connection conexao = Conexao.abrir();
                PreparedStatement comando = conexao.prepareStatement(sql);
                ResultSet resultado = comando.executeQuery()) {

            while (resultado.next()) {
                Item item = new Item(
                        resultado.getString("nome"),
                        resultado.getString("descricao"),
                        resultado.getString("unidade_medida"));
                item.setId(resultado.getInt("id"));
                itens.add(item);
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Erro ao listar os itens do banco.", e);
        }
        return itens;
    }

    // Diz se o item já aparece em alguma entrada ou saída do histórico.
    public boolean possuiMovimentacoes(int id) {
        String sql = "SELECT 1 FROM movimentacoes WHERE item_id = ? LIMIT 1";

        try (Connection conexao = Conexao.abrir();
                PreparedStatement comando = conexao.prepareStatement(sql)) {

            comando.setInt(1, id);

            try (ResultSet resultado = comando.executeQuery()) {
                return resultado.next();
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Erro ao verificar as movimentações do item.", e);
        }
    }

    public void atualizar(Item item) {
        String sql = "UPDATE itens SET nome = ?, descricao = ?, unidade_medida = ? WHERE id = ?";

        try (Connection conexao = Conexao.abrir();
                PreparedStatement comando = conexao.prepareStatement(sql)) {

            comando.setString(1, item.getNome());
            comando.setString(2, item.getDescricao());
            comando.setString(3, item.getUnidadeMedida());
            comando.setInt(4, item.getId());
            comando.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalStateException("Erro ao atualizar o item no banco.", e);
        }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM itens WHERE id = ?";

        try (Connection conexao = Conexao.abrir();
                PreparedStatement comando = conexao.prepareStatement(sql)) {

            comando.setInt(1, id);
            comando.executeUpdate();

        } catch (SQLException e) {
            throw new IllegalStateException("Erro ao excluir o item do banco.", e);
        }
    }
}