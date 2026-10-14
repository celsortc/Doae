package br.com.doae;

import br.com.doae.modelo.Item;
import br.com.doae.visao.Estoque;


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

      new Estoque().setVisible(true);
    });

  }
}