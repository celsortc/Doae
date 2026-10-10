import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/** Campo de texto com uma dica visual que não faz parte do valor digitado. */
public class CampoBusca extends JTextField {
    private String placeholder = "";

    public CampoBusca() {
        getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent event) { repaint(); }

            @Override
            public void removeUpdate(DocumentEvent event) { repaint(); }

            @Override
            public void changedUpdate(DocumentEvent event) { repaint(); }
        });
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        String anterior = this.placeholder;
        this.placeholder = placeholder == null ? "" : placeholder;
        firePropertyChange("placeholder", anterior, this.placeholder);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        if (!getText().isEmpty() || placeholder.isEmpty()) {
            return;
        }
        Graphics pintura = graphics.create();
        try {
            Insets margem = getInsets();
            pintura.clipRect(margem.left, margem.top,
                    Math.max(0, getWidth() - margem.left - margem.right),
                    Math.max(0, getHeight() - margem.top - margem.bottom));
            pintura.setFont(getFont());
            pintura.setColor(new Color(101, 112, 120));
            int altura = getHeight() - margem.top - margem.bottom;
            int linha = margem.top + (altura - pintura.getFontMetrics().getHeight()) / 2
                    + pintura.getFontMetrics().getAscent();
            pintura.drawString(placeholder, margem.left, linha);
        } finally {
            pintura.dispose();
        }
    }
}
