package br.com.doae.visao;

/** Formulário visual de saída; comportamento será implementado separadamente. */
public class RegistrarSaida extends javax.swing.JPanel {

    public RegistrarSaida() {
        initComponents();
        scrollSaida.getVerticalScrollBar().setUnitIncrement(20);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        scrollSaida = new javax.swing.JScrollPane();
        painelFormulario = new javax.swing.JPanel();
        painelTitulo = new javax.swing.JPanel();
        painelDadosSaida = new javax.swing.JPanel();
        scrollObservacao = new javax.swing.JScrollPane();
        painelOrientacoesSaida = new javax.swing.JPanel();
        painelAvisoSaida = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblDados = new javax.swing.JLabel();
        lblObrigatorios = new javax.swing.JLabel();
        lblItem = new javax.swing.JLabel();
        cmbItem = new javax.swing.JComboBox<>();
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
        txtObservacao = new javax.swing.JTextArea();
        lblTituloAvisoSaida = new javax.swing.JLabel();
        lblTextoAvisoSaida = new javax.swing.JLabel();
        lblOrientacaoSaida = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1100, 760));
        setLayout(new java.awt.BorderLayout());
        painelFormulario.setBackground(new java.awt.Color(255, 255, 255));
        painelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        painelDadosSaida.setBackground(new java.awt.Color(255, 255, 255));
        painelDadosSaida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        painelOrientacoesSaida.setBackground(new java.awt.Color(255, 255, 255));
        painelAvisoSaida.setBackground(new java.awt.Color(245, 246, 247));
        painelAvisoSaida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 28));
        lblTitulo.setForeground(new java.awt.Color(36, 42, 45));
        lblTitulo.setText("Registrar saída");
        lblDescricao.setFont(new java.awt.Font("Segoe UI", 0, 16));
        lblDescricao.setForeground(new java.awt.Color(101, 112, 120));
        lblDescricao.setText("Informe os itens retirados. Revise os dados antes de confirmar.");
        lblDados.setFont(new java.awt.Font("Segoe UI", 1, 20));
        lblDados.setForeground(new java.awt.Color(36, 42, 45));
        lblDados.setText("Dados da saída");
        lblObrigatorios.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lblObrigatorios.setForeground(new java.awt.Color(101, 112, 120));
        lblObrigatorios.setText("* Campos obrigatórios");
        lblItem.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblItem.setForeground(new java.awt.Color(36, 42, 45));
        lblItem.setText("Item *");
        cmbItem.setFont(new java.awt.Font("Segoe UI", 0, 16));
        cmbItem.setForeground(new java.awt.Color(36, 42, 45));
        cmbItem.setBackground(new java.awt.Color(255, 255, 255));
        cmbItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        lblUnidade.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblUnidade.setForeground(new java.awt.Color(36, 42, 45));
        lblUnidade.setText("Unidade");
        txtUnidade.setFont(new java.awt.Font("Segoe UI", 0, 16));
        txtUnidade.setForeground(new java.awt.Color(36, 42, 45));
        txtUnidade.setBackground(new java.awt.Color(245, 246, 247));
        txtUnidade.setEditable(false);
        txtUnidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        lblSaldoDisponivel.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblSaldoDisponivel.setForeground(new java.awt.Color(36, 42, 45));
        lblSaldoDisponivel.setText("Saldo disponível");
        txtSaldoDisponivel.setFont(new java.awt.Font("Segoe UI", 0, 16));
        txtSaldoDisponivel.setForeground(new java.awt.Color(36, 42, 45));
        txtSaldoDisponivel.setBackground(new java.awt.Color(245, 246, 247));
        txtSaldoDisponivel.setEditable(false);
        txtSaldoDisponivel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        lblQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblQuantidade.setForeground(new java.awt.Color(36, 42, 45));
        lblQuantidade.setText("Quantidade *");
        txtQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 16));
        txtQuantidade.setForeground(new java.awt.Color(36, 42, 45));
        txtQuantidade.setBackground(new java.awt.Color(255, 255, 255));
        txtQuantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        lblAjudaQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 12));
        lblAjudaQuantidade.setForeground(new java.awt.Color(101, 112, 120));
        lblAjudaQuantidade.setText("Informe uma quantidade maior que zero.");
        lblObservacao.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblObservacao.setForeground(new java.awt.Color(36, 42, 45));
        lblObservacao.setText("Observação (opcional)");
        lblDataHora.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblDataHora.setForeground(new java.awt.Color(36, 42, 45));
        lblDataHora.setText("Data/hora automática");
        txtDataHora.setFont(new java.awt.Font("Segoe UI", 0, 16));
        txtDataHora.setForeground(new java.awt.Color(36, 42, 45));
        txtDataHora.setBackground(new java.awt.Color(245, 246, 247));
        txtDataHora.setEditable(false);
        txtDataHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        lblAjudaDataHora.setFont(new java.awt.Font("Segoe UI", 0, 12));
        lblAjudaDataHora.setForeground(new java.awt.Color(101, 112, 120));
        lblAjudaDataHora.setText("Preenchida automaticamente pelo sistema.");
        btnRevisarSaida.setFont(new java.awt.Font("Segoe UI", 1, 14));
        btnRevisarSaida.setForeground(new java.awt.Color(255, 255, 255));
        btnRevisarSaida.setBackground(new java.awt.Color(172, 62, 64));
        btnRevisarSaida.setText("Revisar saída");
        btnRevisarSaida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        btnRevisarSaida.setContentAreaFilled(false);
        btnRevisarSaida.setOpaque(true);
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14));
        btnCancelar.setForeground(new java.awt.Color(36, 42, 45));
        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 211, 215)));
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setOpaque(true);
        txtObservacao.setFont(new java.awt.Font("Segoe UI", 0, 14));
        txtObservacao.setForeground(new java.awt.Color(36, 42, 45));
        txtObservacao.setBackground(new java.awt.Color(255, 255, 255));
        txtObservacao.setColumns(20);
        txtObservacao.setRows(4);
        txtObservacao.setLineWrap(true);
        txtObservacao.setWrapStyleWord(true);
        lblTituloAvisoSaida.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblTituloAvisoSaida.setForeground(new java.awt.Color(36, 42, 45));
        lblTituloAvisoSaida.setText("Limite de retirada");
        lblTextoAvisoSaida.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblTextoAvisoSaida.setForeground(new java.awt.Color(101, 112, 120));
        lblTextoAvisoSaida.setText("<html>A quantidade deve ser positiva e não pode<br>ultrapassar o saldo disponível do item.</html>");
        lblOrientacaoSaida.setFont(new java.awt.Font("Segoe UI", 0, 13));
        lblOrientacaoSaida.setForeground(new java.awt.Color(101, 112, 120));
        lblOrientacaoSaida.setText("<html>A saída só reduz o saldo após a revisão e a<br>confirmação definitiva.</html>");
        javax.swing.GroupLayout painelAvisoSaidaLayout = new javax.swing.GroupLayout(painelAvisoSaida);
        painelAvisoSaida.setLayout(painelAvisoSaidaLayout);
        painelAvisoSaidaLayout.setHorizontalGroup(
            painelAvisoSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAvisoSaidaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(painelAvisoSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloAvisoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(lblTextoAvisoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 270, Short.MAX_VALUE))
                .addGap(16, 16, 16)));
        painelAvisoSaidaLayout.setVerticalGroup(
            painelAvisoSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAvisoSaidaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTituloAvisoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblTextoAvisoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)));
        javax.swing.GroupLayout painelOrientacoesSaidaLayout = new javax.swing.GroupLayout(painelOrientacoesSaida);
        painelOrientacoesSaida.setLayout(painelOrientacoesSaidaLayout);
        painelOrientacoesSaidaLayout.setHorizontalGroup(
            painelOrientacoesSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelAvisoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 304, Short.MAX_VALUE)
            .addComponent(lblOrientacaoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 304, Short.MAX_VALUE));
        painelOrientacoesSaidaLayout.setVerticalGroup(
            painelOrientacoesSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOrientacoesSaidaLayout.createSequentialGroup()
                .addComponent(painelAvisoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblOrientacaoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
        scrollObservacao.setViewportView(txtObservacao);
        javax.swing.GroupLayout painelDadosSaidaLayout = new javax.swing.GroupLayout(painelDadosSaida);
        painelDadosSaida.setLayout(painelDadosSaidaLayout);
        painelDadosSaidaLayout.setHorizontalGroup(
            painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosSaidaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObrigatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelDadosSaidaLayout.createSequentialGroup()
                        .addGroup(painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbItem, javax.swing.GroupLayout.PREFERRED_SIZE, 370, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(painelDadosSaidaLayout.createSequentialGroup()
                        .addGroup(painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSaldoDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaldoDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 285, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(lblAjudaQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 590, Short.MAX_VALUE)
                    .addComponent(lblDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 590, Short.MAX_VALUE)
                    .addComponent(lblAjudaDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelDadosSaidaLayout.createSequentialGroup()
                        .addComponent(btnRevisarSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)));
        painelDadosSaidaLayout.setVerticalGroup(
            painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosSaidaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblObrigatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbItem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSaldoDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSaldoDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(lblAjudaQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(scrollObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(txtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblAjudaDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(painelDadosSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRevisarSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)));
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
        javax.swing.GroupLayout painelFormularioLayout = new javax.swing.GroupLayout(painelFormulario);
        painelFormulario.setLayout(painelFormularioLayout);
        painelFormularioLayout.setHorizontalGroup(
            painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormularioLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 640, Short.MAX_VALUE)
                    .addGroup(painelFormularioLayout.createSequentialGroup()
                        .addComponent(painelDadosSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 640, Short.MAX_VALUE)
                        .addGap(24, 24, 24)
                        .addComponent(painelOrientacoesSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)));
        painelFormularioLayout.setVerticalGroup(
            painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormularioLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDadosSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelOrientacoesSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, Short.MAX_VALUE)));
        scrollSaida.setViewportView(painelFormulario);
        add(scrollSaida, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRevisarSaida;
    private javax.swing.JComboBox<String> cmbItem;
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
