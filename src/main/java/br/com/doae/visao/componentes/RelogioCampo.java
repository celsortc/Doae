package br.com.doae.visao.componentes;

import java.awt.event.HierarchyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 * Faz um campo de texto mostrar a data e hora atuais, atualizadas a cada
 * segundo, enquanto a tela que o contém estiver visível.
 */
public final class RelogioCampo {

    private static final DateTimeFormatter FORMATO
            = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private RelogioCampo() {
    }

    public static void ligar(JComponent tela, JTextField campo) {
        // Timer do Swing: executa na thread da interface, a cada 1000 ms.
        Timer relogio = new Timer(1000, e -> atualizar(campo));

        // Liga o relógio quando a tela aparece e desliga quando ela é escondida
        // (o CardLayout só esconde as telas, não as destrói).
        tela.addHierarchyListener(evento -> {
            if ((evento.getChangeFlags() & HierarchyEvent.SHOWING_CHANGED) == 0) {
                return;
            }
            if (tela.isShowing()) {
                atualizar(campo);
                relogio.start();
            } else {
                relogio.stop();
            }
        });
    }

    private static void atualizar(JTextField campo) {
        campo.setText(LocalDateTime.now().format(FORMATO));
    }
}
