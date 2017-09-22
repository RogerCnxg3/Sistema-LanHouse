package TELA;

import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

     public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        BarraMenuTelaPrincipal = new javax.swing.JMenuBar();
        MenuConfiguração = new javax.swing.JMenu();
        SubMenuTrocarUsuario = new javax.swing.JMenuItem();
        SubMenuSair = new javax.swing.JMenuItem();
        MenuNovoUsuario = new javax.swing.JMenu();
        SubMenuNovoUsuario = new javax.swing.JMenuItem();
        SubMenuBuscarUsuario = new javax.swing.JMenuItem();
        SubMenuEditarUsuario = new javax.swing.JMenuItem();
        MenuCaixa = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        MenuConfiguração.setText("Configuração");

        SubMenuTrocarUsuario.setText("Trocar Usuario");
        SubMenuTrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuTrocarUsuarioActionPerformed(evt);
            }
        });
        MenuConfiguração.add(SubMenuTrocarUsuario);

        SubMenuSair.setText("Sair");
        SubMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuSairActionPerformed(evt);
            }
        });
        MenuConfiguração.add(SubMenuSair);

        BarraMenuTelaPrincipal.add(MenuConfiguração);

        MenuNovoUsuario.setText("Usuario");

        SubMenuNovoUsuario.setText("Novo Usuario");
        SubMenuNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuNovoUsuarioActionPerformed(evt);
            }
        });
        MenuNovoUsuario.add(SubMenuNovoUsuario);

        SubMenuBuscarUsuario.setText("Buscar usuario");
        MenuNovoUsuario.add(SubMenuBuscarUsuario);

        SubMenuEditarUsuario.setText("Editar Usuario");
        SubMenuEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuEditarUsuarioActionPerformed(evt);
            }
        });
        MenuNovoUsuario.add(SubMenuEditarUsuario);

        BarraMenuTelaPrincipal.add(MenuNovoUsuario);

        MenuCaixa.setText("Caixa");
        BarraMenuTelaPrincipal.add(MenuCaixa);

        setJMenuBar(BarraMenuTelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(816, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SubMenuTrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuTrocarUsuarioActionPerformed
                 LOGIN login = new LOGIN();
                 login.setVisible(true);
                 dispose();        
    }//GEN-LAST:event_SubMenuTrocarUsuarioActionPerformed

    private void SubMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuSairActionPerformed
                 System.exit(0);   
                 JOptionPane.showInputDialog("saindo");
                  
    }//GEN-LAST:event_SubMenuSairActionPerformed

    private void SubMenuNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuNovoUsuarioActionPerformed
                 JanelaNovoUsuario NovoUsuario = new JanelaNovoUsuario();
                 NovoUsuario.setVisible(true);
                 dispose();   
    }//GEN-LAST:event_SubMenuNovoUsuarioActionPerformed

    private void SubMenuEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuEditarUsuarioActionPerformed
                JanelaEditaUsuario EditaUsuario = new JanelaEditaUsuario();
                 EditaUsuario.setVisible(true);
                 dispose();  


        // TODO add your handling code here:
    }//GEN-LAST:event_SubMenuEditarUsuarioActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenuTelaPrincipal;
    private javax.swing.JMenu MenuCaixa;
    private javax.swing.JMenu MenuConfiguração;
    private javax.swing.JMenu MenuNovoUsuario;
    private javax.swing.JMenuItem SubMenuBuscarUsuario;
    private javax.swing.JMenuItem SubMenuEditarUsuario;
    private javax.swing.JMenuItem SubMenuNovoUsuario;
    private javax.swing.JMenuItem SubMenuSair;
    private javax.swing.JMenuItem SubMenuTrocarUsuario;
    private javax.swing.JMenu jMenu3;
    // End of variables declaration//GEN-END:variables
}
