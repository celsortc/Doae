package br.com.doae;

import br.com.doae.servico.CadastroItens;
import br.com.doae.visao.JanelaPrincipal;
import br.com.doae.modelo.Doador;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(() -> {
            try {
                javax.swing.UIManager.setLookAndFeel(
                        javax.swing.UIManager.getSystemLookAndFeelClassName()
                );
            } catch (Exception e) {
                e.printStackTrace();
            }
            CadastroItens cadastro = new CadastroItens();
            cadastro.cadastrar("Arroz", "arroz top", "pacote");
            cadastro.cadastrar("Leite", "Italac", "Litro");
            cadastro.cadastrar("Arroz", "Arroz por peso", "kg");

            List<Doador> doadores = List.of(
                    new Doador("Maria Oliveira", ""),
                    new Doador("João Santos", ""),
                    new Doador("Mercado Solidário", "")
            );

            new JanelaPrincipal(cadastro, doadores).setVisible(true);

        });

    }
}
