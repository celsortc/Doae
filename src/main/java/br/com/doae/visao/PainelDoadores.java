package br.com.doae.visao;

import br.com.doae.modelo.Doador;
import br.com.doae.servico.CadastroDoadores;
import javax.swing.table.DefaultTableModel;

public class PainelDoadores extends javax.swing.JPanel {

    private final CadastroDoadores cadastroDoadores;

    public PainelDoadores(CadastroDoadores cadastroDoadores) {
        this.cadastroDoadores = cadastroDoadores;
        initComponents();

        scrollConteudo.getVerticalScrollBar().setUnitIncrement(20);
        tblDoadores.getTableHeader().setFont(new java.awt.Font("Segoe UI", 1, 14));
        tblDoadores.getTableHeader().setBackground(new java.awt.Color(245, 246, 247));
        tblDoadores.getTableHeader().setForeground(new java.awt.Color(36, 42, 45));
        tblDoadores.getTableHeader().setReorderingAllowed(false);

        atualizarTabelaDoadores();
    }

    private void atualizarTabelaDoadores() {
        DefaultTableModel modelo
                = (DefaultTableModel) tblDoadores.getModel();

        modelo.setRowCount(0);

        for (Doador doador : cadastroDoadores.listar()) {
            modelo.addRow(new Object[]{
                doador.getNome(),
                doador.getContato()
            });
        }
        int total = modelo.getRowCount();
        lblTotalDoadores.setText(total == 1 ? "1 doador cadastrado" : total + " doadores cadastrados");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        scrollConteudo = new javax.swing.JScrollPane();
        painelConteudo = new javax.swing.JPanel();
        painelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        painelLista = new javax.swing.JPanel();
        lblCadastrados = new javax.swing.JLabel();
        scrollDoadores = new javax.swing.JScrollPane();
        tblDoadores = new javax.swing.JTable();
        lblTotalDoadores = new javax.swing.JLabel();
        painelNovoDoador = new javax.swing.JPanel();
        lblNovoDoador = new javax.swing.JLabel();
        lblObrigatorios = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblContato = new javax.swing.JLabel();
        txtContato = new javax.swing.JTextField();
        lblAjudaContato = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 760));
        setLayout(new java.awt.BorderLayout());

        scrollConteudo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        painelConteudo.setBackground(new java.awt.Color(255, 255, 255));
        painelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 28));
        lblTitulo.setForeground(new java.awt.Color(36, 42, 45));
        lblTitulo.setText("Doadores");
        lblDescricao.setFont(new java.awt.Font("Segoe UI", 0, 16));
        lblDescricao.setForeground(new java.awt.Color(101, 112, 120));
        lblDescricao.setText("Mantenha os contatos de quem contribui com a ONG.");
        painelLista.setBackground(new java.awt.Color(255, 255, 255));
        lblCadastrados.setFont(new java.awt.Font("Segoe UI", 1, 20));
        lblCadastrados.setForeground(new java.awt.Color(36, 42, 45));
        lblCadastrados.setText("Doadores cadastrados");
        scrollDoadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        tblDoadores.setFont(new java.awt.Font("Segoe UI", 0, 14));
        tblDoadores.setForeground(new java.awt.Color(36, 42, 45));
        tblDoadores.setBackground(new java.awt.Color(255, 255, 255));
        tblDoadores.setFillsViewportHeight(true);
        tblDoadores.setRowHeight(40);
        tblDoadores.setShowVerticalLines(false);
        tblDoadores.setGridColor(new java.awt.Color(230, 233, 235));
        tblDoadores.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {}, new String[] { "Nome", "Contato" }) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        lblTotalDoadores.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblTotalDoadores.setForeground(new java.awt.Color(101, 112, 120));
        lblTotalDoadores.setText("0 doadores cadastrados");
        painelNovoDoador.setBackground(new java.awt.Color(255, 255, 255));
        painelNovoDoador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        lblNovoDoador.setFont(new java.awt.Font("Segoe UI", 1, 20));
        lblNovoDoador.setForeground(new java.awt.Color(36, 42, 45));
        lblNovoDoador.setText("Novo doador");
        lblObrigatorios.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblObrigatorios.setForeground(new java.awt.Color(101, 112, 120));
        lblObrigatorios.setText("* Campos obrigatórios");
        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblNome.setForeground(new java.awt.Color(36, 42, 45));
        lblNome.setText("Nome *");
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 16));
        txtNome.setForeground(new java.awt.Color(36, 42, 45));
        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        lblContato.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblContato.setForeground(new java.awt.Color(36, 42, 45));
        lblContato.setText("Contato (opcional)");
        txtContato.setFont(new java.awt.Font("Segoe UI", 0, 16));
        txtContato.setForeground(new java.awt.Color(36, 42, 45));
        txtContato.setBackground(new java.awt.Color(255, 255, 255));
        txtContato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        lblAjudaContato.setFont(new java.awt.Font("Segoe UI", 0, 12));
        lblAjudaContato.setForeground(new java.awt.Color(101, 112, 120));
        lblAjudaContato.setText("Telefone ou e-mail.");
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setBackground(new java.awt.Color(76, 150, 53));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.setOpaque(true);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14));
        btnCancelar.setForeground(new java.awt.Color(36, 42, 45));
        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setOpaque(true);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        javax.swing.GroupLayout painelNovoDoadorLayout = new javax.swing.GroupLayout(painelNovoDoador);
        painelNovoDoador.setLayout(painelNovoDoadorLayout);
        painelNovoDoadorLayout.setHorizontalGroup(
            painelNovoDoadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNovoDoadorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(painelNovoDoadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNovoDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObrigatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, 0, 310, Short.MAX_VALUE)
                    .addComponent(lblContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContato, 0, 310, Short.MAX_VALUE)
                    .addComponent(lblAjudaContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelNovoDoadorLayout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)));
        painelNovoDoadorLayout.setVerticalGroup(
            painelNovoDoadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNovoDoadorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblNovoDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblObrigatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblAjudaContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(painelNovoDoadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)));

        scrollDoadores.setViewportView(tblDoadores);
        javax.swing.GroupLayout painelListaLayout = new javax.swing.GroupLayout(painelLista);
        painelLista.setLayout(painelListaLayout);
        painelListaLayout.setHorizontalGroup(
            painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(scrollDoadores, 0, 520, Short.MAX_VALUE)
            .addComponent(lblTotalDoadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        painelListaLayout.setVerticalGroup(
            painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListaLayout.createSequentialGroup()
                .addComponent(lblCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(scrollDoadores, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblTotalDoadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

        javax.swing.GroupLayout painelTituloLayout = new javax.swing.GroupLayout(painelTitulo);
        painelTitulo.setLayout(painelTituloLayout);
        painelTituloLayout.setHorizontalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        painelTituloLayout.setVerticalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

        javax.swing.GroupLayout painelConteudoLayout = new javax.swing.GroupLayout(painelConteudo);
        painelConteudo.setLayout(painelConteudoLayout);
        painelConteudoLayout.setHorizontalGroup(
            painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelTitulo, 0, 900, Short.MAX_VALUE)
                    .addGroup(painelConteudoLayout.createSequentialGroup()
                        .addComponent(painelLista, 0, 520, Short.MAX_VALUE)
                        .addGap(24, 24, 24)
                        .addComponent(painelNovoDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)));
        painelConteudoLayout.setVerticalGroup(
            painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelNovoDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, Short.MAX_VALUE)));

        scrollConteudo.setViewportView(painelConteudo);
        add(scrollConteudo, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblAjudaContato;
    private javax.swing.JLabel lblCadastrados;
    private javax.swing.JLabel lblContato;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNovoDoador;
    private javax.swing.JLabel lblObrigatorios;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotalDoadores;
    private javax.swing.JPanel painelConteudo;
    private javax.swing.JPanel painelLista;
    private javax.swing.JPanel painelNovoDoador;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JScrollPane scrollConteudo;
    private javax.swing.JScrollPane scrollDoadores;
    private javax.swing.JTable tblDoadores;
    private javax.swing.JTextField txtContato;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
