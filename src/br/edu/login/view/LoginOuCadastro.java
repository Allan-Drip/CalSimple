/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.login.view;

import br.edu.login.poo.Login;

/**
 *
 * O usuário deve escolher entre fazer o login ou o cadastro para conseguir utilizar o programa.
 */
public class LoginOuCadastro extends javax.swing.JFrame {

    /**
     * Creates new form LoginOuCadastro
     */
    public LoginOuCadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        Cadastrar = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        barra = new javax.swing.JMenu();
        Ajuda = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        Equipe = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/login/images/oi.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Login.setContentAreaFilled(false);
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 280, 60));

        Cadastrar.setContentAreaFilled(false);
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 280, 60));

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

        MenuBar.add(barra);

        setJMenuBar(MenuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Botão que, pressionado, vai para a tela de login
     */
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        LoginView telaLogin = new LoginView();
                telaLogin.setVisible(true);
                 dispose();
    }//GEN-LAST:event_LoginActionPerformed
    /**
     * Botão que, pressionado, vai para a tela de cadastro
     */
    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        Cadastrar telaCadastro = new Cadastrar();
                telaCadastro.setVisible(true);
                 dispose();
    }//GEN-LAST:event_CadastrarActionPerformed
    /**
     * Botão que, pressionado, vai para a tela de "sobre" o projeto
     */
    private void AjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjudaActionPerformed
        sobre sobre = new sobre();
        sobre.setVisible(true);
        dispose();
    }//GEN-LAST:event_AjudaActionPerformed
    /**
     * Botão que, pressionado, vai para a tela de "equipe" do projeto
     */
    private void EquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipeActionPerformed
        equipe equipe = new equipe();
         equipe.setVisible(true);
          dispose();
    }//GEN-LAST:event_EquipeActionPerformed
    /**
     * Botão que, pressionado, vai para a tela de "outros" do projeto
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    outros outros = new outros();
    outros.setVisible(true);
     dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginOuCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ajuda;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JMenuItem Equipe;
    private javax.swing.JButton Login;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu barra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
