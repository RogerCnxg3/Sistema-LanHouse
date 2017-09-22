
package TELA;

public class JanelaNovoUsuario extends javax.swing.JFrame {

    
    public JanelaNovoUsuario() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoNomeUsuario = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        TextoSobrenomeUsuario = new javax.swing.JLabel();
        CampoSobrenome = new javax.swing.JTextField();
        TextoCPFUsuario = new javax.swing.JLabel();
        CampoCPF = new javax.swing.JFormattedTextField();
        TextoRGUsuario = new javax.swing.JLabel();
        CampoRG = new javax.swing.JTextField();
        TextoDataUsuario = new javax.swing.JLabel();
        CampoDataUsuario = new javax.swing.JFormattedTextField();
        TextoEnderecoUsuario = new javax.swing.JLabel();
        CampoEndereco = new javax.swing.JTextField();
        TextoBairroUsuario = new javax.swing.JLabel();
        CampoBairro = new javax.swing.JTextField();
        PainelPrevilegios = new javax.swing.JPanel();
        TextoTipoDeUsuario = new javax.swing.JLabel();
        TipoDeUsuario = new javax.swing.JComboBox<>();
        TextoUsuarioUsuario = new javax.swing.JLabel();
        CampoUsuario = new javax.swing.JTextField();
        TextoSenhaUsuario = new javax.swing.JLabel();
        CampoSenha = new javax.swing.JPasswordField();
        TextoConfirSenhaUsuario = new javax.swing.JLabel();
        CampoConfirmeSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Usuario");
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setName("Cadastro Usuario"); // NOI18N

        TextoNomeUsuario.setText("Nome");

        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });

        TextoSobrenomeUsuario.setText("Sobrenome");

        TextoCPFUsuario.setText("CPF");

        try {
            CampoCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" ### . ### . ### - ## ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCPFActionPerformed(evt);
            }
        });

        TextoRGUsuario.setText("RG");

        CampoRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoRGActionPerformed(evt);
            }
        });

        TextoDataUsuario.setText("Data de Nascimento");

        try {
            CampoDataUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  ##  /  ##  /  ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        TextoEnderecoUsuario.setText("Endereço");

        TextoBairroUsuario.setText("Bairro");

        PainelPrevilegios.setBorder(javax.swing.BorderFactory.createTitledBorder("Previlegios"));

        TextoTipoDeUsuario.setText("Tipo de Usuario");

        TipoDeUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Clientes" }));
        TipoDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoDeUsuarioActionPerformed(evt);
            }
        });

        TextoUsuarioUsuario.setText("Usuario");

        TextoSenhaUsuario.setText("Senha");

        TextoConfirSenhaUsuario.setText("Confirme a Senha");

        javax.swing.GroupLayout PainelPrevilegiosLayout = new javax.swing.GroupLayout(PainelPrevilegios);
        PainelPrevilegios.setLayout(PainelPrevilegiosLayout);
        PainelPrevilegiosLayout.setHorizontalGroup(
            PainelPrevilegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrevilegiosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PainelPrevilegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelPrevilegiosLayout.createSequentialGroup()
                        .addGroup(PainelPrevilegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelPrevilegiosLayout.createSequentialGroup()
                                .addComponent(TextoTipoDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TextoUsuarioUsuario))
                            .addGroup(PainelPrevilegiosLayout.createSequentialGroup()
                                .addComponent(TipoDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TextoSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59)
                        .addGroup(PainelPrevilegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelPrevilegiosLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(TextoConfirSenhaUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CampoConfirmeSenha)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelPrevilegiosLayout.setVerticalGroup(
            PainelPrevilegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrevilegiosLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(PainelPrevilegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoUsuarioUsuario)
                    .addComponent(CampoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoTipoDeUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelPrevilegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoSenhaUsuario)
                    .addComponent(CampoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelPrevilegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoConfirSenhaUsuario)
                    .addComponent(CampoConfirmeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PainelPrevilegios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextoNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(TextoCPFUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextoEnderecoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TextoSobrenomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CampoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(TextoRGUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoRG, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(CampoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TextoBairroUsuario)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TextoDataUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CampoDataUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(CampoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoNomeUsuario)
                    .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoSobrenomeUsuario)
                    .addComponent(CampoSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoCPFUsuario)
                    .addComponent(CampoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoRGUsuario)
                    .addComponent(TextoDataUsuario)
                    .addComponent(CampoDataUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoEnderecoUsuario)
                    .addComponent(CampoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoBairroUsuario)
                    .addComponent(CampoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(PainelPrevilegios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(816, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CampoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCPFActionPerformed

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeActionPerformed

    private void CampoRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoRGActionPerformed

    private void TipoDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoDeUsuarioActionPerformed


    }//GEN-LAST:event_TipoDeUsuarioActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaNovoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoBairro;
    private javax.swing.JFormattedTextField CampoCPF;
    private javax.swing.JPasswordField CampoConfirmeSenha;
    private javax.swing.JFormattedTextField CampoDataUsuario;
    private javax.swing.JTextField CampoEndereco;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoRG;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JTextField CampoSobrenome;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JPanel PainelPrevilegios;
    private javax.swing.JLabel TextoBairroUsuario;
    private javax.swing.JLabel TextoCPFUsuario;
    private javax.swing.JLabel TextoConfirSenhaUsuario;
    private javax.swing.JLabel TextoDataUsuario;
    private javax.swing.JLabel TextoEnderecoUsuario;
    private javax.swing.JLabel TextoNomeUsuario;
    private javax.swing.JLabel TextoRGUsuario;
    private javax.swing.JLabel TextoSenhaUsuario;
    private javax.swing.JLabel TextoSobrenomeUsuario;
    private javax.swing.JLabel TextoTipoDeUsuario;
    private javax.swing.JLabel TextoUsuarioUsuario;
    private javax.swing.JComboBox<String> TipoDeUsuario;
    // End of variables declaration//GEN-END:variables
}
