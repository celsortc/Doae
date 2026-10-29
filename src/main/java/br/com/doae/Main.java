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

            CadastroDoadores cadastroDoadores = new CadastroDoadores();

            new JanelaPrincipal(cadastroItens, cadastroDoadores).setVisible(true);

        });

    }
}
