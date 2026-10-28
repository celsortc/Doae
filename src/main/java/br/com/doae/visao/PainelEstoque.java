/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.com.doae.visao;

import br.com.doae.modelo.Item;
import br.com.doae.servico.ControleEstoque;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Celsinho
 */
public class PainelEstoque extends javax.swing.JPanel {

    private final ControleEstoque controleEstoque;
    private final Runnable aoRegistrarEntrada;
    private final Runnable aoRegistrarSaida;

    public PainelEstoque(ControleEstoque controleEstoque,
            Runnable aoRegistrarEntrada,
            Runnable aoRegistrarSaida) {
        this.controleEstoque = controleEstoque;
        this.aoRegistrarEntrada = aoRegistrarEntrada;
        this.aoRegistrarSaida = aoRegistrarSaida;
        initComponents();
    }

    public void atualizarTabelaEstoque() {
        DefaultTableModel modelo
                = (DefaultTableModel) tblEstoque.getModel();

        modelo.setRowCount(0);

        for (Map.Entry<Item, Integer> registro
                : controleEstoque.listarSaldos().entrySet()) {

            Item item = registro.getKey();
            int saldo = registro.getValue();

            modelo.addRow(new Object[]{
                item.getNome(),
                item.getUnidadeMedida(),
                saldo
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelConteudoEstoque = new javax.swing.JPanel();
        btnRegistrarEntrada = new javax.swing.JButton();
        btnRegistrarSaida = new javax.swing.JButton();
        painelCabecalhoEstoque = new javax.swing.JPanel();
        lblTituloEstoque = new javax.swing.JLabel();
        lblDescricaoEstoque = new javax.swing.JLabel();
        painelPesquisa = new javax.swing.JPanel();
        lblBuscaItem = new javax.swing.JLabel();
        txtBuscaItem = new br.com.doae.visao.componentes.CampoBusca();
        btnPesquisar = new javax.swing.JButton();
        scrollEstoque = new javax.swing.JScrollPane();
        tblEstoque = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        painelConteudoEstoque.setBackground(new java.awt.Color(255, 255, 255));

        btnRegistrarEntrada.setBackground(new java.awt.Color(76, 150, 53));
        btnRegistrarEntrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarEntrada.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarEntrada.setText("Registrar entrada");
        btnRegistrarEntrada.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(76, 150, 53), 2, true));
        btnRegistrarEntrada.setContentAreaFilled(false);
        btnRegistrarEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarEntrada.setOpaque(true);
        btnRegistrarEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarEntradaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarEntradaMouseExited(evt);
            }
        });
        btnRegistrarEntrada.addActionListener(this::btnRegistrarEntradaActionPerformed);

        btnRegistrarSaida.setBackground(new java.awt.Color(172, 62, 64));
        btnRegistrarSaida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarSaida.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarSaida.setText("Registrar saída");
        btnRegistrarSaida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(130, 40, 42), 2, true));
        btnRegistrarSaida.setContentAreaFilled(false);
        btnRegistrarSaida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarSaida.setOpaque(true);
        btnRegistrarSaida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarSaidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarSaidaMouseExited(evt);
            }
        });
        btnRegistrarSaida.addActionListener(this::btnRegistrarSaidaActionPerformed);

        painelCabecalhoEstoque.setBackground(new java.awt.Color(255, 255, 255));
        painelCabecalhoEstoque.setMinimumSize(new java.awt.Dimension(400, 66));

        lblTituloEstoque.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblTituloEstoque.setForeground(new java.awt.Color(36, 42, 45));
        lblTituloEstoque.setText("Estoque");

        lblDescricaoEstoque.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblDescricaoEstoque.setForeground(new java.awt.Color(101, 112, 120));
        lblDescricaoEstoque.setText("Consulte os saldos e registre as movimentações de itens.");

        javax.swing.GroupLayout painelCabecalhoEstoqueLayout = new javax.swing.GroupLayout(painelCabecalhoEstoque);
        painelCabecalhoEstoque.setLayout(painelCabecalhoEstoqueLayout);
        painelCabecalhoEstoqueLayout.setHorizontalGroup(
            painelCabecalhoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecalhoEstoqueLayout.createSequentialGroup()
                .addGroup(painelCabecalhoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloEstoque)
                    .addComponent(lblDescricaoEstoque))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        painelCabecalhoEstoqueLayout.setVerticalGroup(
            painelCabecalhoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecalhoEstoqueLayout.createSequentialGroup()
                .addComponent(lblTituloEstoque)
                .addGap(8, 8, 8)
                .addComponent(lblDescricaoEstoque)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        painelPesquisa.setBackground(new java.awt.Color(255, 255, 255));

        lblBuscaItem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBuscaItem.setForeground(new java.awt.Color(36, 42, 45));
        lblBuscaItem.setLabelFor(txtBuscaItem);
        lblBuscaItem.setText("Buscar por nome");

        txtBuscaItem.setForeground(new java.awt.Color(36, 42, 45));
        txtBuscaItem.setToolTipText("Digite o nome do item");
        txtBuscaItem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscaItem.setMargin(new java.awt.Insets(8, 12, 8, 12));
        txtBuscaItem.setPlaceholder("Digite o nome do item");

        btnPesquisar.setBackground(new java.awt.Color(76, 150, 53));
        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(76, 150, 53), 2, true));
        btnPesquisar.setContentAreaFilled(false);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.setOpaque(true);

        javax.swing.GroupLayout painelPesquisaLayout = new javax.swing.GroupLayout(painelPesquisa);
        painelPesquisa.setLayout(painelPesquisaLayout);
        painelPesquisaLayout.setHorizontalGroup(
            painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBuscaItem)
            .addGroup(painelPesquisaLayout.createSequentialGroup()
                .addComponent(txtBuscaItem, 200, 767, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(btnPesquisar, 132, 132, 132))
        );
        painelPesquisaLayout.setVerticalGroup(
            painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaLayout.createSequentialGroup()
                .addComponent(lblBuscaItem, 20, 20, 20)
                .addGap(8, 8, 8)
                .addGroup(painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaItem, 42, 42, 42)
                    .addComponent(btnPesquisar, 42, 42, 42)))
        );

        tblEstoque.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Unidade", "Saldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEstoque.setFillsViewportHeight(true);
        tblEstoque.setRowHeight(32);
        scrollEstoque.setViewportView(tblEstoque);

        javax.swing.GroupLayout painelConteudoEstoqueLayout = new javax.swing.GroupLayout(painelConteudoEstoque);
        painelConteudoEstoque.setLayout(painelConteudoEstoqueLayout);
        painelConteudoEstoqueLayout.setHorizontalGroup(
            painelConteudoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoEstoqueLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(painelConteudoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConteudoEstoqueLayout.createSequentialGroup()
                        .addComponent(painelCabecalhoEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarEntrada, 173, 173, 173)
                        .addGap(12, 12, 12)
                        .addComponent(btnRegistrarSaida, 173, 173, 173))
                    .addComponent(scrollEstoque, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        painelConteudoEstoqueLayout.setVerticalGroup(
            painelConteudoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoEstoqueLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(painelConteudoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(painelCabecalhoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarEntrada, 42, 42, 42)
                    .addComponent(btnRegistrarSaida, 42, 42, 42))
                .addGap(32, 32, 32)
                .addComponent(painelPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(scrollEstoque, 100, 233, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        add(painelConteudoEstoque, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarEntradaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarEntradaMouseEntered
        btnRegistrarEntrada.setBackground(new java.awt.Color(52, 110, 35));
    }//GEN-LAST:event_btnRegistrarEntradaMouseEntered

    private void btnRegistrarEntradaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarEntradaMouseExited
        btnRegistrarEntrada.setBackground(new java.awt.Color(76, 150, 53));
    }//GEN-LAST:event_btnRegistrarEntradaMouseExited

    private void btnRegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEntradaActionPerformed
        aoRegistrarEntrada.run();
    }//GEN-LAST:event_btnRegistrarEntradaActionPerformed

    private void btnRegistrarSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSaidaActionPerformed
        aoRegistrarSaida.run();
    }//GEN-LAST:event_btnRegistrarSaidaActionPerformed



    private void btnRegistrarSaidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarSaidaMouseEntered
        btnRegistrarSaida.setBackground(new java.awt.Color(130, 40, 42));
    }//GEN-LAST:event_btnRegistrarSaidaMouseEntered

    private void btnRegistrarSaidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarSaidaMouseExited
        btnRegistrarSaida.setBackground(new java.awt.Color(172, 62, 64));
    }//GEN-LAST:event_btnRegistrarSaidaMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRegistrarEntrada;
    private javax.swing.JButton btnRegistrarSaida;
    private javax.swing.JLabel lblBuscaItem;
    private javax.swing.JLabel lblDescricaoEstoque;
    private javax.swing.JLabel lblTituloEstoque;
    private javax.swing.JPanel painelCabecalhoEstoque;
    private javax.swing.JPanel painelConteudoEstoque;
    private javax.swing.JPanel painelPesquisa;
    private javax.swing.JScrollPane scrollEstoque;
    private javax.swing.JTable tblEstoque;
    private br.com.doae.visao.componentes.CampoBusca txtBuscaItem;
    // End of variables declaration//GEN-END:variables
}
