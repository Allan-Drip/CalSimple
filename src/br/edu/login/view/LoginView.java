
package br.edu.login.view;


import br.edu.TelaEscolha.TelaEscolha;
import br.edu.login.controle.LoginControle;
import br.edu.login.poo.Login;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * 
 * Tela de login, em que o usuário deve colocar seu nome e senha anteriormente registrados, para ter acesso às calculadoras.
 */


public class LoginView extends javax.swing.JFrame {
 Login adm =new Login ("Lesia","1234");
    /**
     * Creates new form LoginView
     */
    public LoginView() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Usuario = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        entrar = new javax.swing.JToggleButton();
        MenuBar = new javax.swing.JMenuBar();
        barra = new javax.swing.JMenu();
        Ajuda = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        Equipe = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Usuario.setBorder(null);
        Usuario.setOpaque(false);
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 320, 40));

        senha.setBorder(null);
        senha.setOpaque(false);
        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        getContentPane().add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 320, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/login/images/usUario.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 870, 560));

        entrar.setContentAreaFilled(false);
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        getContentPane().add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 360, 90));

        barra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/login/images/search-engine-optimization.png"))); // NOI18N
        barra.setText("Ajuda");

        Ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/login/images/sinal-de-interrogacao.png"))); // NOI18N
        Ajuda.setText("Sobre");
        Ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjudaActionPerformed(evt);
            }
        });
        barra.add(Ajuda);
        barra.add(jSeparator3);

        Equipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/login/images/trabalho-em-equipe.png"))); // NOI18N
        Equipe.setText("Equipe");
        Equipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquipeActionPerformed(evt);
            }
        });
        barra.add(Equipe);
        barra.add(jSeparator1);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/login/images/inscricao.png"))); // NOI18N
        jMenuItem1.setText("Outros");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        barra.add(jMenuItem1);
        barra.add(jSeparator2);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Retornar");
        jRadioButtonMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/login/images/cruz.png"))); // NOI18N
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        barra.add(jRadioButtonMenuItem1);

        MenuBar.add(barra);

        setJMenuBar(MenuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    public JTextField getUsuario() {
        return Usuario;
    }

    public void setUsuario(JTextField Usuario) {
        this.Usuario = Usuario;
    }

    public JPasswordField getSenha() {
        return senha;
    }

    public void setSenha(JPasswordField senha) {
        this.senha = senha;
    }
   

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        
    }//GEN-LAST:event_UsuarioActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
     
    }//GEN-LAST:event_senhaActionPerformed
    /**
     * Botão que, caso usuário e senha estejam corretos, permite o acesso à tela de escolha
     */
    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        if(Usuario.getText().matches("") || senha.getText().matches("")){
            JOptionPane.showMessageDialog(rootPane,"Preencha todos os campos");
        }
        else{
        
        try{
            LoginControle login = new LoginControle();
            login.login(this);
        }catch (SQLException sql){
            
        }
     }
     TelaEscolha calc = new TelaEscolha();
        this.dispose();
        calc.setVisible(true);
    }//GEN-LAST:event_entrarActionPerformed
     /**
     * Botão que, pressionado, vai para a tela de "sobre" o projeto
     */
    private void AjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjudaActionPerformed
       sobre sobre = new sobre();
       sobre.setVisible(true);
       
    }//GEN-LAST:event_AjudaActionPerformed
    /**
     * Botão que, pressionado, vai para a tela de "equipe" do projeto
     */
    private void EquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipeActionPerformed
        equipe equipe = new equipe();
        equipe.setVisible(true);
    }//GEN-LAST:event_EquipeActionPerformed
    /**
     * Botão que, pressionado, vai para a tela de "outros" do projeto
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      outros outros = new outros();
      outros.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    /**
     * Botão que, caso apertado, volta à tela de LoginOuCadastro
     */
    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
       LoginOuCadastro retornar = new LoginOuCadastro();
       this.dispose();
       retornar.setVisible(true);
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed
    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ajuda;
    private javax.swing.JMenuItem Equipe;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JTextField Usuario;
    private javax.swing.JMenu barra;
    private javax.swing.JToggleButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPasswordField senha;
    // End of variables declaration//GEN-END:variables
}
