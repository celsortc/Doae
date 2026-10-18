/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.doae.modelo;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author goku0
 */
public class itemform extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(itemform.class.getName());

    /**
     * Creates new form itemform
     */
public itemform() {
    initComponents();
    jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
    jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    estilizarTabela(jTable1);
    estilizarMenu(btnItens3);
   
    
    
    

    btnEstoque3.addActionListener(e -> estilizarMenu(btnEstoque3));
    btnHistorico3.addActionListener(e -> estilizarMenu(btnHistorico3));
    btnItens3.addActionListener(e -> estilizarMenu(btnItens3));
    btnDoadores3.addActionListener(e -> estilizarMenu(btnDoadores3));
}




private void organizarTela() {
    jPanel1.setLayout(null);
    jPanel1.setPreferredSize(new Dimension(1280, 720));

    // x, y, largura, altura
    bgNav3.setBounds(0, 0, 240, 720);
    jPanel2.setBounds(270, 40, 450, 70);
    jLabel4.setBounds(270, 130, 450, 20);
    jScrollPane1.setBounds(270, 160, 450, 260);

    // caixa "Novo item" que já existe: 510 de largura, a 20 px da borda direita
    jPanel4.setBounds(1280 - 20 - 510, 40, 510, 600);

    jPanel1.revalidate();
    jPanel1.repaint();
    pack();
}

public class NovoItemPanel extends JPanel {

    private static final int R = 6;
    private static final Color BORDA = new Color(0xD0D3D8);
    private static final Color TEXTO = new Color(0x1F2328);
    private static final Color CINZA = new Color(0x657078);
    private static final Color VERDE = new Color(0x4C9A34);

    public final JTextField txtNome = new JTextField();
    public final JTextArea txtDescricao = new JTextArea();
    public final JComboBox<String> cmbUnidade =
            new JComboBox<>(new String[]{"unidade", "pacote", "litro", "kg"});
    public final Botao btnSalvar = new Botao("Salvar", VERDE, null, Color.WHITE);
    public final Botao btnCancelar = new Botao("Cancelar", Color.WHITE, BORDA, TEXTO);

    public NovoItemPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setOpaque(false);
        setBorder(new EmptyBorder(28, 30, 28, 30));

        add(texto("Novo item", Font.BOLD, 20, TEXTO, 0));
        add(Box.createVerticalStrut(10));
        add(texto("* Campos obrigatórios", Font.PLAIN, 14, CINZA, 0));
        add(Box.createVerticalStrut(20));

        add(texto("Nome *", Font.PLAIN, 15, TEXTO, 8));
        txtNome.setFont(fonte());
        add(caixa(txtNome, 50, 14, 0));
        add(Box.createVerticalStrut(18));

        add(texto("Descrição (opcional)", Font.PLAIN, 15, TEXTO, 8));
        txtDescricao.setFont(fonte());
        txtDescricao.setLineWrap(true);
        txtDescricao.setWrapStyleWord(true);
        add(caixa(txtDescricao, 110, 14, 10));
        add(Box.createVerticalStrut(18));

        add(texto("Unidade *", Font.PLAIN, 15, TEXTO, 8));
        cmbUnidade.setFont(fonte());
        cmbUnidade.setBackground(Color.WHITE);
        add(caixa(cmbUnidade, 50, 8, 0));
        add(Box.createVerticalStrut(24));

        JPanel linha = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        linha.setOpaque(false);
        btnSalvar.setPreferredSize(new Dimension(110, 44));
        btnCancelar.setPreferredSize(new Dimension(136, 44));
        linha.add(btnSalvar);
        linha.add(Box.createHorizontalStrut(15));
        linha.add(btnCancelar);
        linha.setAlignmentX(LEFT_ALIGNMENT);
        linha.setMaximumSize(new Dimension(Integer.MAX_VALUE, 44));
        add(linha);
        add(Box.createVerticalGlue());
    }

    private Font fonte() {
        return new Font("Segoe UI", Font.PLAIN, 15);
    }

    private JLabel texto(String s, int estilo, int tam, Color cor, int baixo) {
        JLabel l = new JLabel(s);
        l.setFont(new Font("Segoe UI", estilo, tam));
        l.setForeground(cor);
        l.setBorder(new EmptyBorder(0, 0, baixo, 0));
        l.setAlignmentX(LEFT_ALIGNMENT);
        return l;
    }

    /** Envolve um componente numa caixa de cantos arredondados. */
    private JComponent caixa(JComponent c, int altura, int lado, int cima) {
        c.setBorder(null);
        c.setOpaque(false);
        Caixa b = new Caixa();
        b.setBorder(new EmptyBorder(cima, lado, cima, lado));
        b.add(c, BorderLayout.CENTER);
        b.setAlignmentX(LEFT_ALIGNMENT);
        b.setPreferredSize(new Dimension(0, altura));
        b.setMaximumSize(new Dimension(Integer.MAX_VALUE, altura));
        return b;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.WHITE);
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, R, R);
        g2.setColor(BORDA);
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, R, R);
        g2.dispose();
    }

    private static class Caixa extends JPanel {
        Caixa() {
            super(new BorderLayout());
            setOpaque(false);
        }
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(Color.WHITE);
            g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, R, R);
            g2.setColor(BORDA);
            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, R, R);
            g2.dispose();
        }
    }

    public static class Botao extends JButton {
        private final Color fundo, borda;

        Botao(String t, Color fundo, Color borda, Color texto) {
            super(t);
            this.fundo = fundo;
            this.borda = borda;
            setForeground(texto);
            setFont(new Font("Segoe UI", Font.PLAIN, 16));
            setContentAreaFilled(false);
            setBorderPainted(false);
            setFocusPainted(false);
            setOpaque(false);
            setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(fundo);
            g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, R, R);
            if (borda != null) {
                g2.setColor(borda);
                g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, R, R);
            }
            g2.dispose();
            super.paintComponent(g);
        }
    }
}

private void estilizarTabela(JTable t) {
    Color borda     = new Color(0xD9DCE1);
    Color cinzaCab  = new Color(0xF3F4F6);
    Color texto     = new Color(0x1F2328);
    Color verde     = new Color(0x2E6B1F);
    Border margem   = new EmptyBorder(0, 20, 0, 10);

    t.setRowHeight(50);
    t.setShowVerticalLines(false);
    t.setShowHorizontalLines(true);
    t.setIntercellSpacing(new Dimension(0, 1));
    t.setGridColor(borda);
    t.setFont(new Font("Segoe UI", Font.PLAIN, 15));
    t.setForeground(texto);
    t.setBackground(Color.WHITE);
    t.setSelectionBackground(new Color(0xEEF2F7));
    t.setSelectionForeground(texto);

    // Cabeçalho
    JTableHeader h = t.getTableHeader();
    h.setReorderingAllowed(false);
    h.setPreferredSize(new Dimension(0, 50));
    h.setDefaultRenderer(new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable tb, Object v,
                boolean sel, boolean foc, int r, int c) {
            JLabel l = (JLabel) super.getTableCellRendererComponent(tb, v, sel, foc, r, c);
            l.setOpaque(true);
            l.setBackground(cinzaCab);
            l.setForeground(texto);
            l.setFont(new Font("Segoe UI", Font.BOLD, 15));
            l.setHorizontalAlignment(SwingConstants.LEFT);
            l.setBorder(new CompoundBorder(new MatteBorder(0, 0, 1, 0, borda), margem));
            return l;
        }
    });

    // Células (última coluna = "Editar" em verde)
    t.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable tb, Object v,
                boolean sel, boolean foc, int r, int c) {
            JLabel l = (JLabel) super.getTableCellRendererComponent(tb, v, sel, false, r, c);
            l.setBorder(margem);
            l.setForeground(c == tb.getColumnCount() - 1 ? verde : texto);
            return l;
        }
    });

    // Borda externa da tabela
    jScrollPane1.setBorder(new LineBorder(borda));
    jScrollPane1.getViewport().setBackground(Color.WHITE);
}

private void estilizarMenu(JButton ativo) {
    Color borda    = new Color(0xD9DCE1);
    Color texto    = new Color(0x1F2328);
    Color verde    = new Color(0x2E6B1F);
    Color verdeBg  = new Color(0xECF4E6);
    Color secaoBg  = new Color(0xDAE5EB);

    // Títulos das seções
    for (JLabel l : new JLabel[]{lblOperacao3, lblCadastro3}) {
        l.setOpaque(true);
        l.setBackground(secaoBg);
        l.setForeground(texto);
        l.setBorder(new MatteBorder(0, 0, 1, 0, borda));
    }
    lblCadastro3.setText("Cadastros");

    // Botões: todos brancos, só o ativo fica verde
    JButton[] botoes = {btnEstoque3, btnHistorico3, btnItens3, btnDoadores3};
    for (JButton b : botoes) {
        b.setOpaque(true);
        b.setContentAreaFilled(false);
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        if (b == ativo) {
            b.setBackground(verdeBg);
            b.setForeground(verde);
            b.setFont(new Font("Segoe UI", Font.BOLD, 16));
            b.setBorder(new CompoundBorder(
                    new MatteBorder(0, 0, 1, 0, verde),
                    new MatteBorder(0, 5, 0, 0, verde)));
        } else {
            b.setBackground(Color.WHITE);
            b.setForeground(texto);
            b.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            b.setBorder(new MatteBorder(0, 0, 1, 0, borda));
        }
    }
    bgNav3.setBorder(new MatteBorder(0, 0, 0, 1, borda));
    bgNav3.repaint();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        bgNav3 = new javax.swing.JPanel();
        btnEstoque3 = new javax.swing.JButton();
        btnHistorico3 = new javax.swing.JButton();
        btnDoadores3 = new javax.swing.JButton();
        btnItens3 = new javax.swing.JButton();
        lblOperacao3 = new javax.swing.JLabel();
        lblCadastro3 = new javax.swing.JLabel();
        lblLogo3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        bgNav3.setBackground(new java.awt.Color(255, 255, 255));
        bgNav3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        bgNav3.setPreferredSize(new java.awt.Dimension(240, 481));

        btnEstoque3.setBackground(new java.awt.Color(220, 240, 210));
        btnEstoque3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEstoque3.setText("Estoque");
        btnEstoque3.setBorder(null);
        btnEstoque3.setBorderPainted(false);
        btnEstoque3.setContentAreaFilled(false);
        btnEstoque3.setFocusPainted(false);
        btnEstoque3.setOpaque(true);
        btnEstoque3.setPreferredSize(new java.awt.Dimension(75, 40));
        btnEstoque3.addActionListener(this::btnEstoque3ActionPerformed);

        btnHistorico3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHistorico3.setText("Histórico");
        btnHistorico3.setBorder(null);
        btnHistorico3.setBorderPainted(false);
        btnHistorico3.setContentAreaFilled(false);
        btnHistorico3.setFocusPainted(false);
        btnHistorico3.setOpaque(true);
        btnHistorico3.setPreferredSize(new java.awt.Dimension(75, 40));
        btnHistorico3.addActionListener(this::btnHistorico3ActionPerformed);

        btnDoadores3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDoadores3.setText("Doadores");
        btnDoadores3.setBorder(null);
        btnDoadores3.setBorderPainted(false);
        btnDoadores3.setContentAreaFilled(false);
        btnDoadores3.setFocusPainted(false);
        btnDoadores3.setOpaque(true);
        btnDoadores3.setPreferredSize(new java.awt.Dimension(75, 40));
        btnDoadores3.addActionListener(this::btnDoadores3ActionPerformed);

        btnItens3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnItens3.setText("Itens");
        btnItens3.setBorder(null);
        btnItens3.setBorderPainted(false);
        btnItens3.setContentAreaFilled(false);
        btnItens3.setFocusPainted(false);
        btnItens3.setOpaque(true);
        btnItens3.setPreferredSize(new java.awt.Dimension(75, 40));
        btnItens3.addActionListener(this::btnItens3ActionPerformed);

        lblOperacao3.setBackground(new java.awt.Color(205, 211, 215));
        lblOperacao3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblOperacao3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOperacao3.setText("Operação");
        lblOperacao3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        lblOperacao3.setOpaque(true);

        lblCadastro3.setBackground(new java.awt.Color(205, 211, 215));
        lblCadastro3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCadastro3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastro3.setText("Cadastro");
        lblCadastro3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        lblCadastro3.setOpaque(true);

        lblLogo3.setBackground(new java.awt.Color(255, 255, 255));
        lblLogo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Logo.png"))); // NOI18N
        lblLogo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        lblLogo3.setOpaque(true);
        lblLogo3.setPreferredSize(new java.awt.Dimension(150, 72));

        javax.swing.GroupLayout bgNav3Layout = new javax.swing.GroupLayout(bgNav3);
        bgNav3.setLayout(bgNav3Layout);
        bgNav3Layout.setHorizontalGroup(
            bgNav3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEstoque3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHistorico3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnItens3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblOperacao3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCadastro3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDoadores3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgNav3Layout.createSequentialGroup()
                .addComponent(lblLogo3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bgNav3Layout.setVerticalGroup(
            bgNav3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgNav3Layout.createSequentialGroup()
                .addComponent(lblLogo3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOperacao3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnEstoque3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnHistorico3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblCadastro3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnItens3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnDoadores3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Itens");

        jLabel2.setForeground(new java.awt.Color(101, 112, 120));
        jLabel2.setText("Cadastre os itens e as unidades utilizadas no estoque.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Itens cadastrados");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Unidade", "Editar"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setDoubleBuffered(true);
        jTable1.setGridColor(new java.awt.Color(101, 112, 120));
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(false);
        jTable1.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleDescription("");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Novo item");

        jLabel3.setForeground(new java.awt.Color(101, 112, 120));
        jLabel3.setText("* Campos obrigatórios");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Nome *");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Descrição (opcional)");

        jLabel8.setText("Cobertor de solteiro");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText(" Unidade *");

        jLabel10.setText("Unidade");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton1.setBackground(new java.awt.Color(87, 181, 65));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salvar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Cancelar");

        jLabel11.setText("Cobertor");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(33, 33, 33)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(58, 58, 58))
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bgNav3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(bgNav3, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        jPanel4.getAccessibleContext().setAccessibleName("");
        jPanel4.getAccessibleContext().setAccessibleParent(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnItens3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItens3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnItens3ActionPerformed

    private void btnDoadores3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoadores3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDoadores3ActionPerformed

    private void btnHistorico3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorico3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHistorico3ActionPerformed

    private void btnEstoque3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoque3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstoque3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new itemform().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgNav3;
    private javax.swing.JButton btnDoadores3;
    private javax.swing.JButton btnEstoque3;
    private javax.swing.JButton btnHistorico3;
    private javax.swing.JButton btnItens3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCadastro3;
    private javax.swing.JLabel lblLogo3;
    private javax.swing.JLabel lblOperacao3;
    // End of variables declaration//GEN-END:variables
}
