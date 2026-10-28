package br.com.doae.visao;

import br.com.doae.modelo.Movimentacao;
import br.com.doae.servico.ControleEstoque;
import javax.swing.table.DefaultTableModel;

/**
 * Tela visual; ações e carregamento de dados serão implementados separadamente.
 */
public class PainelHistorico extends javax.swing.JPanel {

    private final ControleEstoque controleEstoque;

    public PainelHistorico(ControleEstoque controleEstoque) {
        this.controleEstoque = controleEstoque;

        initComponents();
        scrollConteudo.getVerticalScrollBar().setUnitIncrement(20);
        tblMovimentacoes.getTableHeader().setFont(new java.awt.Font("Segoe UI", 1, 14));
        tblMovimentacoes.getTableHeader().setBackground(new java.awt.Color(245, 246, 247));
        tblMovimentacoes.getTableHeader().setForeground(new java.awt.Color(36, 42, 45));
        tblMovimentacoes.getTableHeader().setReorderingAllowed(false);
    }

    public void atualizarTabelaHistorico() {
        DefaultTableModel modelo
                = (DefaultTableModel) tblMovimentacoes.getModel();

        modelo.setRowCount(0);

        for (Movimentacao movimentacao : controleEstoque.listarMovimentacoes()) {

            String textoDoador = "-";

            if(movimentacao.isAnonima() == true) {
            textoDoador = "Doação anônima";
            } else if(movimentacao.getDoador() != null) {
                textoDoador = movimentacao.getDoador().getNome();
            }

            modelo.addRow(new Object[]{
                movimentacao.getDataHora(),
                movimentacao.getTipo(),
                movimentacao.getItem().getNome(),
                movimentacao.getQuantidade(),
                movimentacao.getItem().getUnidadeMedida(),
                textoDoador,
                movimentacao.getObservacao()
            });
        }
        
        int linhas = modelo.getRowCount();
        
        lblTotalRegistros.setText(linhas == 1 ? "1 registro encontrado • As saídas não possuem doador." : linhas + " registros encontrados • As saídas não possuem doador.");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollConteudo = new javax.swing.JScrollPane();
        painelConteudo = new javax.swing.JPanel();
        painelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        painelFiltros = new javax.swing.JPanel();
        lblFiltros = new javax.swing.JLabel();
        lblItem = new javax.swing.JLabel();
        cmbItem = new javax.swing.JComboBox<>();
        lblTipo = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        lblDataInicial = new javax.swing.JLabel();
        txtDataInicial = new javax.swing.JTextField();
        lblDataFinal = new javax.swing.JLabel();
        txtDataFinal = new javax.swing.JTextField();
        btnAplicar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        scrollMovimentacoes = new javax.swing.JScrollPane();
        tblMovimentacoes = new javax.swing.JTable();
        lblTotalRegistros = new javax.swing.JLabel();
        painelAviso = new javax.swing.JPanel();
        lblAviso = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 760));
        setLayout(new java.awt.BorderLayout());

        scrollConteudo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));

        painelConteudo.setBackground(new java.awt.Color(255, 255, 255));

        painelTitulo.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(36, 42, 45));
        lblTitulo.setText("Histórico");

        lblDescricao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(101, 112, 120));
        lblDescricao.setText("Consulte as entradas e saídas confirmadas do estoque.");

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

        painelFiltros.setBackground(new java.awt.Color(255, 255, 255));
        painelFiltros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));

        lblFiltros.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblFiltros.setForeground(new java.awt.Color(36, 42, 45));
        lblFiltros.setText("Filtros");

        lblItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblItem.setForeground(new java.awt.Color(36, 42, 45));
        lblItem.setText("Item");

        cmbItem.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmbItem.setForeground(new java.awt.Color(36, 42, 45));
        cmbItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));

        lblTipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(36, 42, 45));
        lblTipo.setText("Tipo");

        cmbTipo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmbTipo.setForeground(new java.awt.Color(36, 42, 45));
        cmbTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));

        lblDataInicial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDataInicial.setForeground(new java.awt.Color(36, 42, 45));
        lblDataInicial.setText("Período — de");

        txtDataInicial.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtDataInicial.setForeground(new java.awt.Color(101, 112, 120));
        txtDataInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataInicial.setText("dd/mm/aaaa");
        txtDataInicial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));

        lblDataFinal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDataFinal.setForeground(new java.awt.Color(36, 42, 45));
        lblDataFinal.setText("até");

        txtDataFinal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtDataFinal.setForeground(new java.awt.Color(101, 112, 120));
        txtDataFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataFinal.setText("dd/mm/aaaa");
        txtDataFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));

        btnAplicar.setBackground(new java.awt.Color(76, 150, 53));
        btnAplicar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAplicar.setForeground(new java.awt.Color(255, 255, 255));
        btnAplicar.setText("Aplicar");
        btnAplicar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        btnAplicar.setContentAreaFilled(false);
        btnAplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAplicar.setOpaque(true);

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(36, 42, 45));
        btnLimpar.setText("Limpar");
        btnLimpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        btnLimpar.setContentAreaFilled(false);
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.setOpaque(true);

        javax.swing.GroupLayout painelFiltrosLayout = new javax.swing.GroupLayout(painelFiltros);
        painelFiltros.setLayout(painelFiltrosLayout);
        painelFiltrosLayout.setHorizontalGroup(
            painelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFiltrosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(painelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFiltros)
                    .addGroup(painelFiltrosLayout.createSequentialGroup()
                        .addGroup(painelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblItem)
                            .addComponent(cmbItem, 0, 198, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(painelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipo)
                            .addComponent(cmbTipo, 0, 223, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(painelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataInicial)
                            .addComponent(txtDataInicial, 0, 179, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(painelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataFinal)
                            .addComponent(txtDataFinal, 0, 192, Short.MAX_VALUE)))
                    .addGroup(painelFiltrosLayout.createSequentialGroup()
                        .addComponent(btnAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        painelFiltrosLayout.setVerticalGroup(
            painelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFiltrosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblFiltros)
                .addGap(20, 20, 20)
                .addGroup(painelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblItem)
                    .addComponent(lblTipo)
                    .addComponent(lblDataInicial)
                    .addComponent(lblDataFinal))
                .addGap(8, 8, 8)
                .addGroup(painelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbItem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        scrollMovimentacoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));

        tblMovimentacoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblMovimentacoes.setForeground(new java.awt.Color(36, 42, 45));
        tblMovimentacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data/hora", "Tipo", "Item", "Quantidade", "Unidade", "Doador", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMovimentacoes.setFillsViewportHeight(true);
        tblMovimentacoes.setGridColor(new java.awt.Color(230, 233, 235));
        tblMovimentacoes.setRowHeight(40);
        scrollMovimentacoes.setViewportView(tblMovimentacoes);

        lblTotalRegistros.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTotalRegistros.setForeground(new java.awt.Color(101, 112, 120));
        lblTotalRegistros.setText("0 registros encontrados • As saídas não possuem doador.");

        painelAviso.setBackground(new java.awt.Color(245, 246, 247));
        painelAviso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));

        lblAviso.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(36, 42, 45));
        lblAviso.setText("Registros confirmados são permanentes: não podem ser editados nem excluídos.");

        javax.swing.GroupLayout painelAvisoLayout = new javax.swing.GroupLayout(painelAviso);
        painelAviso.setLayout(painelAvisoLayout);
        painelAvisoLayout.setHorizontalGroup(
            painelAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAvisoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblAviso, 0, 868, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        painelAvisoLayout.setVerticalGroup(
            painelAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAvisoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblAviso)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout painelConteudoLayout = new javax.swing.GroupLayout(painelConteudo);
        painelConteudo.setLayout(painelConteudoLayout);
        painelConteudoLayout.setHorizontalGroup(
            painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelTitulo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelFiltros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollMovimentacoes, 0, 902, Short.MAX_VALUE)
                    .addComponent(lblTotalRegistros)
                    .addComponent(painelAviso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        painelConteudoLayout.setVerticalGroup(
            painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(painelFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(scrollMovimentacoes, 0, 250, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(lblTotalRegistros)
                .addGap(24, 24, 24)
                .addComponent(painelAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        scrollConteudo.setViewportView(painelConteudo);

        add(scrollConteudo, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> cmbItem;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblDataFinal;
    private javax.swing.JLabel lblDataInicial;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblFiltros;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotalRegistros;
    private javax.swing.JPanel painelAviso;
    private javax.swing.JPanel painelConteudo;
    private javax.swing.JPanel painelFiltros;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JScrollPane scrollConteudo;
    private javax.swing.JScrollPane scrollMovimentacoes;
    private javax.swing.JTable tblMovimentacoes;
    private javax.swing.JTextField txtDataFinal;
    private javax.swing.JTextField txtDataInicial;
    // End of variables declaration//GEN-END:variables
}
