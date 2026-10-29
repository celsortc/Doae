package br.com.doae.persistencia;

import br.com.doae.modelo.Doador;
import br.com.doae.modelo.Item;
import br.com.doae.modelo.Movimentacao;
import br.com.doae.modelo.TipoMovimentacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MovimentacaoRepositorio {

    public void inserir(Movimentacao movimentacao) {
        String sql = "INSERT INTO movimentacoes "
                + "(item_id, doador_id, tipo, quantidade, anonima, data_hora, observacao) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conexao = Conexao.abrir();
                PreparedStatement comando = conexao.prepareStatement(sql)) {

            comando.setInt(1, movimentacao.getItem().getId());

            if (movimentacao.getDoador() != null) {
                comando.setInt(2, movimentacao.getDoador().getId());
            } else {
                comando.setNull(2, Types.INTEGER);
            }

            comando.setString(3, movimentacao.getTipo().name());
            comando.setInt(4, movimentacao.getQuantidade());
            comando.setBoolean(5, movimentacao.isAnonima());
            comando.setTimestamp(6, Timestamp.valueOf(movimentacao.getDataHora()));
            comando.setString(7, movimentacao.getObservacao());
            comando.executeUpdate();

        } catch (SQLException e) {
            throw new IllegalStateException("Erro ao registrar a movimentação no banco.", e);
        }
    }

    public List<Movimentacao> listarTodas() {
        String sql = "SELECT m.tipo, m.quantidade, m.anonima, m.data_hora, m.observacao, "
                + "i.id AS item_id, i.nome AS item_nome, i.descricao, i.unidade_medida, "
                + "d.id AS doador_id, d.nome AS doador_nome, d.contato "
                + "FROM movimentacoes m "
                + "JOIN itens i ON i.id = m.item_id "
                + "LEFT JOIN doadores d ON d.id = m.doador_id "
                + "ORDER BY m.data_hora, m.id";
        List<Movimentacao> movimentacoes = new ArrayList<>();

        try (Connection conexao = Conexao.abrir();
                PreparedStatement comando = conexao.prepareStatement(sql);
                ResultSet resultado = comando.executeQuery()) {

            while (resultado.next()) {
                Item item = new Item(
                        resultado.getString("item_nome"),
                        resultado.getString("descricao"),
                        resultado.getString("unidade_medida"));
                item.setId(resultado.getInt("item_id"));

                Doador doador = null;
                int doadorId = resultado.getInt("doador_id");
                if (!resultado.wasNull()) {
                    doador = new Doador(resultado.getString("doador_nome"), resultado.getString("contato"));
                    doador.setId(doadorId);
                }

                movimentacoes.add(new Movimentacao(
                        TipoMovimentacao.valueOf(resultado.getString("tipo")),
                        item,
                        resultado.getInt("quantidade"),
                        resultado.getTimestamp("data_hora").toLocalDateTime(),
                        resultado.getString("observacao"),
                        doador,
                        resultado.getBoolean("anonima")));
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Erro ao listar as movimentações do banco.", e);
        }
        return movimentacoes;
    }

    public Map<Item, Integer> listarSaldos() {
        String sql = "SELECT i.id, i.nome, i.descricao, i.unidade_medida, "
                + "SUM(CASE WHEN m.tipo = 'ENTRADA' THEN m.quantidade ELSE -m.quantidade END) AS saldo "
                + "FROM movimentacoes m "
                + "JOIN itens i ON i.id = m.item_id "
                + "GROUP BY i.id, i.nome, i.descricao, i.unidade_medida "
                + "ORDER BY i.nome";
        Map<Item, Integer> saldos = new LinkedHashMap<>();

        try (Connection conexao = Conexao.abrir();
                PreparedStatement comando = conexao.prepareStatement(sql);
                ResultSet resultado = comando.executeQuery()) {

            while (resultado.next()) {
                Item item = new Item(
                        resultado.getString("nome"),
                        resultado.getString("descricao"),
                        resultado.getString("unidade_medida"));
                item.setId(resultado.getInt("id"));
                saldos.put(item, resultado.getInt("saldo"));
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Erro ao calcular os saldos no banco.", e);
        }
        return saldos;
    }
}