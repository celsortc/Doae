package br.com.doae.visao;

import br.com.doae.servico.CadastroItens;
import javax.swing.JOptionPane;
import br.com.doae.modelo.Item;
import javax.swing.table.DefaultTableModel;

public class PainelItens extends javax.swing.JPanel {

    private final CadastroItens cadastroItens;

    public PainelItens(CadastroItens cadastroItens) {

        this.cadastroItens = cadastroItens;
        initComponents();

        btnSalvar.putClientProperty("FlatLaf.style",
                "background: #4A9B2F; foreground: #FFFFFF; font: bold");
        final javax.swing.ListCellRenderer<? super String> original = cmbUnidade.getRenderer();
        cmbUnidade.setSelectedIndex(-1);
        cmbUnidade.setRenderer((list, value, index, isSelected, cellHasFocus)
                -> original.getListCellRendererComponent(list, value == null ? "Unidade" : value,
                        index, isSelected, cellHasFocus));

        tblItens.getTableHeader().setFont(new java.awt.Font("Segoe UI", 1, 14));
        tblItens.getTableHeader().setBackground(new java.awt.Color(245, 246, 247));
        tblItens.getTableHeader().setForeground(new java.awt.Color(36, 42, 45));
        tblItens.getTableHeader().setReorderingAllowed(false);
        tblItens.getColumnModel().getColumn(0).setPreferredWidth(160);
        tblItens.getColumnModel().getColumn(1).setPreferredWidth(250);
        tblItens.getColumnModel().getColumn(2).setPreferredWidth(100);
        scrollConteudo.getVerticalScrollBar().setUnitIncrement(20);

        atualizarTabelaItens();
    }

    private void atualizarTabelaItens() {
        DefaultTableModel modelo
                = (DefaultTableModel) tblItens.getModel();

        modelo.setRowCount(0);

        for (Item item : cadastroItens.listar()) {
            modelo.addRow(new Object[]{
                item.getNome(),
                item.getDescricao(),
                item.getUnidadeMedida()
            });
        }
        int total = modelo.getRowCount();
        lblTotalItens.setText(total == 1 ? "1 item cadastrado" : total + " itens cadastrados");
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
        scrollItens = new javax.swing.JScrollPane();
        tblItens = new javax.swing.JTable();
        lblTotalItens = new javax.swing.JLabel();
        painelNovoItem = new javax.swing.JPanel();
        lblNovoItem = new javax.swing.JLabel();
        lblObrigatorios = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblDescricaoItem = new javax.swing.JLabel();
        scrollDescricao = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        lblUnidade = new javax.swing.JLabel();
        cmbUnidade = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 760));
        setLayout(new java.awt.BorderLayout());

        scrollConteudo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));

        painelConteudo.setBackground(new java.awt.Color(255, 255, 255));

        painelTitulo.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(36, 42, 45));
        lblTitulo.setText("Itens");

        lblDescricao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(101, 112, 120));
        lblDescricao.setText("Cadastre os itens e as unidades utilizadas no estoque.");

        javax.swing.GroupLayout painelTituloLayout = new javax.swing.GroupLayout(painelTitulo);
        painelTitulo.setLayout(painelTituloLayout);
        painelTituloLayout.setHorizontalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo)
            .addComponent(lblDescricao)
        );
        painelTituloLayout.setVerticalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloLayout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addGap(8, 8, 8)
                .addComponent(lblDescricao))
        );

        painelLista.setBackground(new java.awt.Color(255, 255, 255));

        lblCadastrados.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCadastrados.setForeground(new java.awt.Color(36, 42, 45));
        lblCadastrados.setText("Itens cadastrados");

        scrollItens.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));

        tblItens.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblItens.setForeground(new java.awt.Color(36, 42, 45));
        tblItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Descrição", "Unidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItens.setFillsViewportHeight(true);
        tblItens.setRowHeight(40);
        tblItens.setGridColor(new java.awt.Color(230, 233, 235));
        scrollItens.setViewportView(tblItens);

        lblTotalItens.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTotalItens.setForeground(new java.awt.Color(101, 112, 120));
        lblTotalItens.setText("0 itens cadastrados");

        javax.swing.GroupLayout painelListaLayout = new javax.swing.GroupLayout(painelLista);
        painelLista.setLayout(painelListaLayout);
        painelListaLayout.setHorizontalGroup(
            painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCadastrados)
            .addComponent(scrollItens, 0, 520, Short.MAX_VALUE)
            .addComponent(lblTotalItens)
        );
        painelListaLayout.setVerticalGroup(
            painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListaLayout.createSequentialGroup()
                .addComponent(lblCadastrados)
                .addGap(16, 16, 16)
                .addComponent(scrollItens, 120, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(lblTotalItens))
        );

        painelNovoItem.setBackground(new java.awt.Color(255, 255, 255));
        painelNovoItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));

        lblNovoItem.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblNovoItem.setForeground(new java.awt.Color(36, 42, 45));
        lblNovoItem.setText("Novo item");

        lblObrigatorios.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblObrigatorios.setForeground(new java.awt.Color(101, 112, 120));
        lblObrigatorios.setText("* Campos obrigatórios");

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(36, 42, 45));
        lblNome.setText("Nome *");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNome.setForeground(new java.awt.Color(36, 42, 45));
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));

        lblDescricaoItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDescricaoItem.setForeground(new java.awt.Color(36, 42, 45));
        lblDescricaoItem.setText("Descrição (opcional)");

        scrollDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));

        txtDescricao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtDescricao.setForeground(new java.awt.Color(36, 42, 45));
        txtDescricao.setColumns(20);
        txtDescricao.setRows(4);
        txtDescricao.setLineWrap(true);
        txtDescricao.setWrapStyleWord(true);
        scrollDescricao.setViewportView(txtDescricao);

        lblUnidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUnidade.setForeground(new java.awt.Color(36, 42, 45));
        lblUnidade.setText("Unidade *");

        cmbUnidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmbUnidade.setForeground(new java.awt.Color(36, 42, 45));
        cmbUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caixa", "kg", "Litro", "Pacote", "Par", "Unidade" }));
        cmbUnidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));

        btnSalvar.setBackground(new java.awt.Color(76, 150, 53));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setOpaque(true);
        btnSalvar.addActionListener(this::btnSalvarActionPerformed);

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(36, 42, 45));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setOpaque(true);
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        javax.swing.GroupLayout painelNovoItemLayout = new javax.swing.GroupLayout(painelNovoItem);
        painelNovoItem.setLayout(painelNovoItemLayout);
        painelNovoItemLayout.setHorizontalGroup(
            painelNovoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNovoItemLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(painelNovoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNovoItem)
                    .addComponent(lblObrigatorios)
                    .addComponent(lblNome)
                    .addComponent(txtNome, 0, 310, Short.MAX_VALUE)
                    .addComponent(lblDescricaoItem)
                    .addComponent(scrollDescricao, 0, 310, Short.MAX_VALUE)
                    .addComponent(lblUnidade)
                    .addComponent(cmbUnidade, 0, 310, Short.MAX_VALUE)
                    .addGroup(painelNovoItemLayout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        painelNovoItemLayout.setVerticalGroup(
            painelNovoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNovoItemLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblNovoItem)
                .addGap(20, 20, 20)
                .addComponent(lblObrigatorios)
                .addGap(20, 20, 20)
                .addComponent(lblNome)
                .addGap(8, 8, 8)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblDescricaoItem)
                .addGap(8, 8, 8)
                .addComponent(scrollDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblUnidade)
                .addGap(8, 8, 8)
                .addComponent(cmbUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(painelNovoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout painelConteudoLayout = new javax.swing.GroupLayout(painelConteudo);
        painelConteudo.setLayout(painelConteudoLayout);
        painelConteudoLayout.setHorizontalGroup(
            painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelTitulo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelConteudoLayout.createSequentialGroup()
                        .addComponent(painelLista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24)
                        .addComponent(painelNovoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        painelConteudoLayout.setVerticalGroup(
            painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelLista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelNovoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        scrollConteudo.setViewportView(painelConteudo);

        add(scrollConteudo, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String nome = txtNome.getText().trim();
        String descricao = txtDescricao.getText().trim();
        String unidade = (String) cmbUnidade.getSelectedItem();

        try {
            cadastroItens.cadastrar(nome, descricao, unidade);

            JOptionPane.showMessageDialog(this, "Item cadastrado com sucesso!");
            txtNome.setText("");
            txtDescricao.setText("");
            cmbUnidade.setSelectedIndex(-1);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        atualizarTabelaItens();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtNome.setText("");
        txtDescricao.setText("");
        cmbUnidade.setSelectedIndex(-1);
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbUnidade;
    private javax.swing.JLabel lblCadastrados;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDescricaoItem;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNovoItem;
    private javax.swing.JLabel lblObrigatorios;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotalItens;
    private javax.swing.JLabel lblUnidade;
    private javax.swing.JPanel painelConteudo;
    private javax.swing.JPanel painelLista;
    private javax.swing.JPanel painelNovoItem;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JScrollPane scrollConteudo;
    private javax.swing.JScrollPane scrollDescricao;
    private javax.swing.JScrollPane scrollItens;
    private javax.swing.JTable tblItens;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
