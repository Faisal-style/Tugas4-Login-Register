/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Frame;
import com.config.cConfig;
import java.sql.PreparedStatement;
import com.mysql.cj.protocol.Resultset;
import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author faisal
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        RegisterUsername = new javax.swing.JTextField();
        jLabel4regis = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RegisterPassword = new javax.swing.JPasswordField();
        jLabel6re = new javax.swing.JLabel();
        RegisterRepass = new javax.swing.JPasswordField();
        RegisterForm = new javax.swing.JButton();
        RegisterForm1 = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 102));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Register Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        RegisterUsername.setBackground(new java.awt.Color(204, 204, 204));
        RegisterUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterUsernameActionPerformed(evt);
            }
        });

        jLabel4regis.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4regis.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4regis.setText("Username :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password :");

        RegisterPassword.setBackground(new java.awt.Color(204, 204, 204));
        RegisterPassword.setText("jPasswordField1");
        RegisterPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterPasswordMouseClicked(evt);
            }
        });
        RegisterPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterPasswordActionPerformed(evt);
            }
        });
        RegisterPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RegisterPasswordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RegisterPasswordKeyTyped(evt);
            }
        });

        jLabel6re.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6re.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6re.setText("Re-Password :");

        RegisterRepass.setBackground(new java.awt.Color(204, 204, 204));
        RegisterRepass.setText("jPasswordField1");
        RegisterRepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterRepassMouseClicked(evt);
            }
        });
        RegisterRepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterRepassActionPerformed(evt);
            }
        });

        RegisterForm.setBackground(new java.awt.Color(255, 255, 51));
        RegisterForm.setText("Register");
        RegisterForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterFormActionPerformed(evt);
            }
        });

        RegisterForm1.setBackground(new java.awt.Color(255, 153, 102));
        RegisterForm1.setText("Back");
        RegisterForm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterForm1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RegisterForm1)
                    .addComponent(jLabel6re)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4regis))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RegisterUsername)
                            .addComponent(RegisterPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegisterRepass, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(91, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegisterForm)
                        .addGap(110, 110, 110))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RegisterUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4regis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegisterPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterRepass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6re))
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterForm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegisterForm1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(219, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterUsernameActionPerformed

    private void RegisterPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterPasswordActionPerformed

    private void RegisterRepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterRepassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterRepassActionPerformed
    boolean a;
    private void RegisterFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterFormActionPerformed
        // TODO add your handling code here:
        String username = RegisterUsername.getText().toString().trim();
        String password = RegisterPassword.getText().toString().trim();
        String repassword = RegisterRepass.getText().toString().trim();
        //cek username
        java.sql.Connection c = cConfig.getConn();
        try {
            java.sql.Statement s = c.createStatement();
            String sql = "SELECT `Username`FROM `dataakun`";
            ResultSet r = s.executeQuery(sql);
            while (r.next()) {
                 if (username.equals(r.getString("Username"))){
                     a = true;
                 }
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        if (!password.equals(repassword)) {
            JOptionPane.showMessageDialog(jPanel3, "Password yang diinput tidak Sama");
        }else if (password.equals("")||username.equals("")) {
            JOptionPane.showMessageDialog(jPanel3, "Password atau Username tidak boleh Kosong");
        }else if (a){
            JOptionPane.showMessageDialog(jPanel3, "Username sama");
            a=false;
        }else{
            try {
                String sql = "INSERT INTO dataakun VALUES (?, ?, ?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, null);
                p.setString(2, username);
                p.setString(3, password);
                p.executeUpdate();
                p.close();
                JOptionPane.showMessageDialog(jPanel3, "Create Account Successfully");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Gagal");
            }   finally {
                this.dispose();
                LoginForm n = new LoginForm();
                n.setVisible(true);
            }
        } 
    }//GEN-LAST:event_RegisterFormActionPerformed

    
    private void RegisterForm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterForm1ActionPerformed
        this.dispose();
        LoginForm a = new LoginForm();
        a.setVisible(true);
    }//GEN-LAST:event_RegisterForm1ActionPerformed

    private void RegisterPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegisterPasswordKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterPasswordKeyTyped

    private void RegisterRepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterRepassMouseClicked
        // TODO add your handling code here:
        RegisterRepass.setText("");
    }//GEN-LAST:event_RegisterRepassMouseClicked

    private void RegisterPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegisterPasswordKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterPasswordKeyPressed

    private void RegisterPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterPasswordMouseClicked
        // TODO add your handling code here:
        RegisterPassword.setText("");
    }//GEN-LAST:event_RegisterPasswordMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegisterForm;
    private javax.swing.JButton RegisterForm1;
    private javax.swing.JPasswordField RegisterPassword;
    private javax.swing.JPasswordField RegisterRepass;
    private javax.swing.JTextField RegisterUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4regis;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6re;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
