package br.com.doae;

import br.com.doae.modelo.Item;
import br.com.doae.servico.CadastroItens;
import br.com.doae.visao.Estoque;
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

            new Estoque(cadastro).setVisible(true);

            List<Item> itens = cadastro.listar();

            for (Item item : itens) {
                System.out.println(item.getNome());
            }

        });

    }
}
