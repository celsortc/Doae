package br.com.doae.visao;

import br.com.doae.modelo.Item;
import br.com.doae.servico.CadastroItens;
import br.com.doae.servico.ControleEstoque;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Formulário visual de saída; comportamento será implementado separadamente.
 */
public class RegistrarSaida extends javax.swing.JPanel {

    private List<Item> itensDisponiveis = List.of();
    private final Runnable aoCancelar;
    private final ControleEstoque controleEstoque;

    public RegistrarSaida(CadastroItens cadastroItens,
            ControleEstoque controleEstoque,
            Runnable aoCancelar) {
        this.controleEstoque = controleEstoque;
        this.aoCancelar = aoCancelar;

        initComponents();
        scrollSaida.getVerticalScrollBar().setUnitIncrement(20);

        carregarItens(cadastroItens);
    }

    public void carregarItens(CadastroItens cadastroItens) {
        cmbItem.removeAllItems();

        for (Item item : controleEstoque.listarSaldos().keySet()) {

            cmbItem.addItem(item);
        }

    }

    private void limparFormulario() {
        txtQuantidade.setText("");
        txtObservacao.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollSaida = new javax.swing.JScrollPane();
        painelFormulario = new javax.swing.JPanel();
        painelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        painelDadosSaida = new javax.swing.JPanel();
        lblDados = new javax.swing.JLabel();
        lblObrigatorios = new javax.swing.JLabel();
        lblItem = new javax.swing.JLabel();
        cmbItem = new javax.swing.JComboBox();
        lblUnidade = new javax.swing.JLabel();
        txtUnidade = new javax.swing.JTextField();
        lblSaldoDisponivel = new javax.swing.JLabel();
        txtSaldoDisponivel = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        lblAjudaQuantidade = new javax.swing.JLabel();
        lblObservacao = new javax.swing.JLabel();
        lblDataHora = new javax.swing.JLabel();
        txtDataHora = new javax.swing.JTextField();
        lblAjudaDataHora = new javax.swing.JLabel();
        btnRevisarSaida = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        scrollObservacao = new javax.swing.JScrollPane();
        txtObservacao = new javax.swing.JTextArea();
        painelOrientacoesSaida = new javax.swing.JPanel();
        painelAvisoSaida = new javax.swing.JPanel();
        lblTituloAvisoSaida = new javax.swing.JLabel();
        lblTextoAvisoSaida = new javax.swing.JLabel();
        lblOrientacaoSaida = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1100, 760));
        setLayout(new java.awt.BorderLayout());

        painelFormulario.setBackground(new java.awt.Color(255, 255, 255));

        painelTitulo.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(36, 42, 45));
        lblTitulo.setText("Registrar saída");

        lblDescricao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(101, 112, 120));
        lblDescricao.setText("Informe os itens retirados. Informe os itens e a quantidade retirada.");

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

        painelDadosSaida.setBackground(new java.awt.Color(255, 255, 255));
        painelDadosSaida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));

        lblDados.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblDados.setForeground(new java.awt.Color(36, 42, 45));
        lblDados.setText("Dados da saída");

        lblObrigatorios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblObrigatorios.setForeground(new java.awt.Color(101, 112, 120));
        lblObrigatorios.setText("* Campos obrigatórios");

        lblItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblItem.setForeground(new java.awt.Color(36, 42, 45));
        lblItem.setText("Item *");

        cmbItem.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmbItem.setForeground(new java.awt.Color(36, 42, 45));
        cmbItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        cmbItem.addActionListener(this::cmbItemActionPerformed);

        lblUnidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUnidade.setForeground(new java.awt.Color(36, 42, 45));
        lblUnidade.setText("Unidade");

        txtUnidade.setEditable(false);
        txtUnidade.setBackground(new java.awt.Color(245, 246, 247));
        txtUnidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtUnidade.setForeground(new java.awt.Color(36, 42, 45));
        txtUnidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUnidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));

        lblSaldoDisponivel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSaldoDisponivel.setForeground(new java.awt.Color(36, 42, 45));
        lblSaldoDisponivel.setText("Saldo disponível");

        txtSaldoDisponivel.setEditable(false);
        txtSaldoDisponivel.setBackground(new java.awt.Color(245, 246, 247));
        txtSaldoDisponivel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSaldoDisponivel.setForeground(new java.awt.Color(36, 42, 45));
        txtSaldoDisponivel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSaldoDisponivel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));

        lblQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblQuantidade.setForeground(new java.awt.Color(36, 42, 45));
        lblQuantidade.setText("Quantidade *");

        txtQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtQuantidade.setForeground(new java.awt.Color(36, 42, 45));
        txtQuantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));

        lblAjudaQuantidade.setForeground(new java.awt.Color(101, 112, 120));
        lblAjudaQuantidade.setText("Informe uma quantidade maior que zero.");

        lblObservacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblObservacao.setForeground(new java.awt.Color(36, 42, 45));
        lblObservacao.setText("Observação (opcional)");

        lblDataHora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDataHora.setForeground(new java.awt.Color(36, 42, 45));
        lblDataHora.setText("Data/hora automática");

        txtDataHora.setEditable(false);
        txtDataHora.setBackground(new java.awt.Color(245, 246, 247));
        txtDataHora.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtDataHora.setForeground(new java.awt.Color(36, 42, 45));
        txtDataHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));

        lblAjudaDataHora.setForeground(new java.awt.Color(101, 112, 120));
        lblAjudaDataHora.setText("Preenchida automaticamente pelo sistema.");

        btnRevisarSaida.setBackground(new java.awt.Color(172, 62, 64));
        btnRevisarSaida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRevisarSaida.setForeground(new java.awt.Color(255, 255, 255));
        btnRevisarSaida.setText("Registrar saída");
        btnRevisarSaida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        btnRevisarSaida.setContentAreaFilled(false);
        btnRevisarSaida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRevisarSaida.setOpaque(true);
        btnRevisarSaida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRevisarSaidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRevisarSaidaMouseExited(evt);
            }
        });
        btnRevisarSaida.addActionListener(this::btnRevisarSaidaActionPerformed);

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(36, 42, 45));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setOpaque(true);
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        txtObservacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtObservacao.setForeground(new java.awt.Color(36, 42, 45));
        txtObservacao.setColumns(20);
        txtObservacao.setRows(4);
        txtObservacao.setLineWrap(true);
        txtObservacao.setWrapStyleWord(true);
        scrollObservacao.setViewportView(txtObservacao);

        javax.swing.GroupLayout painelDadosSaidaLayout = new javax.swing.GroupLayout(painelDadosSaida);
        painelDadosSaida.setLayout(painelDadosSaidaLayout);
        painelDadosSaidaLayout.setHorizontalGroup(
            painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosSaidaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDados)
                    .addComponent(lblObrigatorios)
                    .addGroup(painelDadosSaidaLayout.createSequentialGroup()
                        .addGroup(painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblItem)
                            .addComponent(cmbItem, javax.swing.GroupLayout.PREFERRED_SIZE, 424, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUnidade)
                            .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 255, Short.MAX_VALUE)))
                    .addGroup(painelDadosSaidaLayout.createSequentialGroup()
                        .addGroup(painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSaldoDisponivel)
                            .addComponent(txtSaldoDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 339, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantidade)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 340, Short.MAX_VALUE)
                            .addComponent(lblAjudaQuantidade)))
                    .addComponent(lblObservacao)
                    .addComponent(scrollObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 699, Short.MAX_VALUE)
                    .addComponent(lblDataHora)
                    .addComponent(txtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 699, Short.MAX_VALUE)
                    .addComponent(lblAjudaDataHora)
                    .addGroup(painelDadosSaidaLayout.createSequentialGroup()
                        .addComponent(btnRevisarSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        painelDadosSaidaLayout.setVerticalGroup(
            painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosSaidaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblDados)
                .addGap(20, 20, 20)
                .addComponent(lblObrigatorios)
                .addGap(20, 20, 20)
                .addGroup(painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblItem)
                    .addComponent(lblUnidade))
                .addGap(8, 8, 8)
                .addGroup(painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbItem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSaldoDisponivel)
                    .addComponent(lblQuantidade))
                .addGap(8, 8, 8)
                .addGroup(painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSaldoDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(lblAjudaQuantidade)
                .addGap(20, 20, 20)
                .addComponent(lblObservacao)
                .addGap(8, 8, 8)
                .addComponent(scrollObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblDataHora)
                .addGap(8, 8, 8)
                .addComponent(txtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblAjudaDataHora)
                .addGap(20, 20, 20)
                .addGroup(painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRevisarSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        painelOrientacoesSaida.setBackground(new java.awt.Color(255, 255, 255));

        painelAvisoSaida.setBackground(new java.awt.Color(245, 246, 247));
        painelAvisoSaida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));

        lblTituloAvisoSaida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloAvisoSaida.setForeground(new java.awt.Color(36, 42, 45));
        lblTituloAvisoSaida.setText("Limite de retirada");

        lblTextoAvisoSaida.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTextoAvisoSaida.setForeground(new java.awt.Color(101, 112, 120));
        lblTextoAvisoSaida.setText("<html>A quantidade deve ser positiva e não pode<br>ultrapassar o saldo disponível do item.</html>");

        javax.swing.GroupLayout painelAvisoSaidaLayout = new javax.swing.GroupLayout(painelAvisoSaida);
        painelAvisoSaida.setLayout(painelAvisoSaidaLayout);
        painelAvisoSaidaLayout.setHorizontalGroup(
            painelAvisoSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAvisoSaidaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(painelAvisoSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloAvisoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(lblTextoAvisoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 270, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        painelAvisoSaidaLayout.setVerticalGroup(
            painelAvisoSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAvisoSaidaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTituloAvisoSaida)
                .addGap(8, 8, 8)
                .addComponent(lblTextoAvisoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        lblOrientacaoSaida.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblOrientacaoSaida.setForeground(new java.awt.Color(101, 112, 120));
        lblOrientacaoSaida.setText("<html>A saída só reduz o saldo após a revisão e a<br>confirmação definitiva.</html>");

        javax.swing.GroupLayout painelOrientacoesSaidaLayout = new javax.swing.GroupLayout(painelOrientacoesSaida);
        painelOrientacoesSaida.setLayout(painelOrientacoesSaidaLayout);
        painelOrientacoesSaidaLayout.setHorizontalGroup(
            painelOrientacoesSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelAvisoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblOrientacaoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 304, Short.MAX_VALUE)
        );
        painelOrientacoesSaidaLayout.setVerticalGroup(
            painelOrientacoesSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOrientacoesSaidaLayout.createSequentialGroup()
                .addComponent(painelAvisoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblOrientacaoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout painelFormularioLayout = new javax.swing.GroupLayout(painelFormulario);
        painelFormulario.setLayout(painelFormularioLayout);
        painelFormularioLayout.setHorizontalGroup(
            painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormularioLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelFormularioLayout.createSequentialGroup()
                        .addComponent(painelDadosSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24)
                        .addComponent(painelOrientacoesSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        painelFormularioLayout.setVerticalGroup(
            painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormularioLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDadosSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelOrientacoesSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollSaida.setViewportView(painelFormulario);

        add(scrollSaida, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        aoCancelar.run();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRevisarSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevisarSaidaActionPerformed
        try {
            int qtd = Integer.parseInt(txtQuantidade.getText().trim());

            controleEstoque.registrarSaida((Item) cmbItem.getSelectedItem(),
                    qtd,
                    txtObservacao.getText().trim());

            JOptionPane.showMessageDialog(this, "Retirada do estoque registrada com sucesso!");
            limparFormulario();
            aoCancelar.run();

        } catch (NumberFormatException e) {
            // o texto não virou número: vazio, letras, decimal...
            JOptionPane.showMessageDialog(this, "Informe a quantidade com um número inteiro.");
        } catch (IllegalArgumentException e) {
            // regras do ControleEstoque: item, quantidade > 0, estoque
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_btnRevisarSaidaActionPerformed

    private void cmbItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbItemActionPerformed
        Item itemSelecionado = (Item) cmbItem.getSelectedItem();

        if (itemSelecionado == null) {
            txtUnidade.setText("");
            txtSaldoDisponivel.setText("");
            return;
        }

        int saldoSelecionado = controleEstoque.listarSaldos().getOrDefault(itemSelecionado, 0);

        txtUnidade.setText(itemSelecionado.getUnidadeMedida());
        txtSaldoDisponivel.setText(String.valueOf(saldoSelecionado));
    }//GEN-LAST:event_cmbItemActionPerformed


    private void btnRevisarSaidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevisarSaidaMouseEntered
        btnRevisarSaida.setBackground(new java.awt.Color(130, 40, 42));
    }//GEN-LAST:event_btnRevisarSaidaMouseEntered

    private void btnRevisarSaidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevisarSaidaMouseExited
        btnRevisarSaida.setBackground(new java.awt.Color(172, 62, 64));
    }//GEN-LAST:event_btnRevisarSaidaMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRevisarSaida;
    private javax.swing.JComboBox cmbItem;
    private javax.swing.JLabel lblAjudaDataHora;
    private javax.swing.JLabel lblAjudaQuantidade;
    private javax.swing.JLabel lblDados;
    private javax.swing.JLabel lblDataHora;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblObrigatorios;
    private javax.swing.JLabel lblObservacao;
    private javax.swing.JLabel lblOrientacaoSaida;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblSaldoDisponivel;
    private javax.swing.JLabel lblTextoAvisoSaida;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloAvisoSaida;
    private javax.swing.JLabel lblUnidade;
    private javax.swing.JPanel painelAvisoSaida;
    private javax.swing.JPanel painelDadosSaida;
    private javax.swing.JPanel painelFormulario;
    private javax.swing.JPanel painelOrientacoesSaida;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JScrollPane scrollObservacao;
    private javax.swing.JScrollPane scrollSaida;
    private javax.swing.JTextField txtDataHora;
    private javax.swing.JTextArea txtObservacao;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtSaldoDisponivel;
    private javax.swing.JTextField txtUnidade;
    // End of variables declaration//GEN-END:variables
}
