package br.com.doae.persistencia;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final Properties config = carregarConfig();

    private static Properties carregarConfig() {
        Properties props = new Properties();

        try (InputStream in = new FileInputStream("db.properties")) {

            props.load(in);
        } catch (IOException e) {
            throw new IllegalStateException("Não foi possível ler o arquivo db.properties.", e);
        }
        return props;

    }

    public static Connection abrir() throws SQLException {
        return DriverManager.getConnection(
                config.getProperty("db.url"),
                config.getProperty("db.usuario"),
                config.getProperty("db.senha"));
    }

}
