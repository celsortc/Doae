package br.com.doae.persistencia;

import br.com.doae.modelo.Doador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DoadorRepositorio {

    public void salvar(Doador doador) {
        String sql = "INSERT INTO doadores (nome, contato) VALUES (?, ?)";

        try (Connection conexao = Conexao.abrir();
                PreparedStatement comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            comando.setString(1, doador.getNome());
            comando.setString(2, doador.getContato());
            comando.executeUpdate();

            try (ResultSet chaves = comando.getGeneratedKeys()) {
                if (chaves.next()) {
                    doador.setId(chaves.getInt(1));
                }
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Erro ao salvar o doador no banco.", e);
        }
    }

    public List<Doador> listarTodos() {
        String sql = "SELECT id, nome, contato FROM doadores ORDER BY nome";
        List<Doador> doadores = new ArrayList<>();

        try (Connection conexao = Conexao.abrir();
                PreparedStatement comando = conexao.prepareStatement(sql);
                ResultSet resultado = comando.executeQuery()) {

            while (resultado.next()) {
                Doador doador = new Doador(
                        resultado.getString("nome"),
                        resultado.getString("contato"));
                doador.setId(resultado.getInt("id"));
                doadores.add(doador);
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Erro ao listar os doadores do banco.", e);
        }
        return doadores;
    }
}