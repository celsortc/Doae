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
}