package br.com.doae;

import br.com.doae.servico.CadastroItens;
import br.com.doae.visao.JanelaPrincipal;
import br.com.doae.servico.CadastroDoadores;

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
            CadastroItens cadastroItens = new CadastroItens();
            cadastroItens.cadastrar("Arroz", "arroz top", "pacote");
            cadastroItens.cadastrar("Leite", "Italac", "Litro");
            cadastroItens.cadastrar("Arroz", "Arroz por peso", "kg");

            CadastroDoadores cadastroDoadores = new CadastroDoadores();

            cadastroDoadores.cadastrar("Maria Oliveira", "");
            cadastroDoadores.cadastrar("João Santos", "11900000000");
            cadastroDoadores.cadastrar("Mercado Solidário", "");

            new JanelaPrincipal(cadastroItens, cadastroDoadores).setVisible(true);

        });

    }
}
