
package br.edu.login.view;


import br.edu.login.controle.LoginControle;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Cadastrar extends javax.swing.JFrame {

    
    public Cadastrar() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Usuario = new javax.swing.JTextField();
        confiSenha = new javax.swing.JPasswordField();
        senha = new javax.swing.JPasswordField();
        email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Avancar = new javax.swing.JButton();
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

        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 320, 50));

        confiSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confiSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(confiSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 310, 40));

        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        getContentPane().add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 320, 40));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 320, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/login/images/usUario_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Avancar.setContentAreaFilled(false);
        Avancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvancarActionPerformed(evt);
            }
        });
        getContentPane().add(Avancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 90, 90));

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

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
 
    }//GEN-LAST:event_UsuarioActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
       
    }//GEN-LAST:event_emailActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
       
    }//GEN-LAST:event_senhaActionPerformed

    private void AvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvancarActionPerformed
        if(Usuario.getText().matches("")||email.getText().matches("")||senha.getText().matches("")){
              JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
    } if(confiSenha.getText().equals(senha.getText())){
        
        try{
        LoginControle cadastro = new LoginControle();
        cadastro.cadastrarUsuario(this);
        }catch (SQLException sql){
            
        }
        
        JOptionPane.showMessageDialog(rootPane, "Cadastro Realizado com sucesso!");
        
        this.setVisible(false);
         dispose(); 
        
    } else {
        JOptionPane.showMessageDialog(rootPane, "As senhas não estão iguais.");
    }
    
    }//GEN-LAST:event_AvancarActionPerformed

    private void confiSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confiSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confiSenhaActionPerformed

    private void AjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjudaActionPerformed
    sobre sobre = new sobre();
   sobre.setVisible(true);
    }//GEN-LAST:event_AjudaActionPerformed

    private void EquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipeActionPerformed
        equipe equipe = new equipe();
        equipe.setVisible(true);
    }//GEN-LAST:event_EquipeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        outros outros = new outros();
        outros.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
       LoginOuCadastro retornar = new LoginOuCadastro();
       this.dispose();
       retornar.setVisible(true);
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    public JTextField getUsuario() {
        return Usuario;
    }

    public void setUsuario(JTextField Usuario) {
        this.Usuario = Usuario;
    }

    public JTextField getEmail() {
        return email;
    }

    public void setEmail(JTextField email) {
        this.email = email;
    }

    public JPasswordField getSenha() {
        return senha;
    }

    public void setSenha(JPasswordField senha) {
        this.senha = senha;
    }

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ajuda;
    private javax.swing.JButton Avancar;
    private javax.swing.JMenuItem Equipe;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JTextField Usuario;
    private javax.swing.JMenu barra;
    private javax.swing.JPasswordField confiSenha;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPasswordField senha;
    // End of variables declaration//GEN-END:variables
}
