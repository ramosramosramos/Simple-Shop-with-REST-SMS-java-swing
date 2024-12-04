package Main;

import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import raven.toast.Notifications;

public class Register extends javax.swing.JFrame {
    Connection conn= null;
    public Register() {
        initComponents();
        conn = JavaConnection.getConnection();
        Notifications.getInstance().setJFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        name_field = new javax.swing.JTextField();
        size_label2 = new javax.swing.JLabel();
        size_label3 = new javax.swing.JLabel();
        register_button = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        size_label4 = new javax.swing.JLabel();
        password_field = new javax.swing.JPasswordField();
        size_label5 = new javax.swing.JLabel();
        username_field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));

        name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_fieldActionPerformed(evt);
            }
        });

        size_label2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        size_label2.setForeground(new java.awt.Color(255, 255, 255));
        size_label2.setText("Name");

        size_label3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        size_label3.setForeground(new java.awt.Color(255, 255, 255));
        size_label3.setText("Password");

        register_button.setBackground(new java.awt.Color(51, 51, 0));
        register_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        register_button.setForeground(new java.awt.Color(255, 255, 255));
        register_button.setText("Create");
        register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_buttonActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Go back to login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        size_label4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        size_label4.setForeground(new java.awt.Color(255, 255, 255));
        size_label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        size_label4.setText("Register");

        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });

        size_label5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        size_label5.setForeground(new java.awt.Color(255, 255, 255));
        size_label5.setText("Username");

        username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(username_field)
                        .addComponent(size_label5, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(password_field)
                        .addComponent(size_label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(name_field)
                        .addComponent(size_label2, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                        .addComponent(register_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(size_label4, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(size_label4)
                .addGap(38, 38, 38)
                .addComponent(size_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(size_label5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(size_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(443, 593));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_buttonActionPerformed
        register();
    }//GEN-LAST:event_register_buttonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_fieldActionPerformed
  register();        // TODO add your handling code here:
    }//GEN-LAST:event_name_fieldActionPerformed

    private void username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_fieldActionPerformed
  register();        // TODO add your handling code here:
    }//GEN-LAST:event_username_fieldActionPerformed

    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
  register();        // TODO add your handling code here:
    }//GEN-LAST:event_password_fieldActionPerformed

    public void register() {
        String name = name_field.getText().trim();
        String username = username_field.getText().trim();
        String password = new String(password_field.getPassword()).trim();
        
        if(name.isEmpty()){
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Name is empty");
                return;
        }
        if(username.isEmpty()){
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Username is empty");
                return;
        }
        if(password.isEmpty()){
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Password is empty");
                return;
        }
        try (PreparedStatement pst = conn.prepareStatement("Insert into users(name,username,password) values(?,?,?)")) {
            pst.setString(1, name);
            pst.setString(2, username);
            pst.setString(3, password);
            pst.executeUpdate();
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully created");
            name_field.setText("");
            username_field.setText("");
            password_field.setText("");
        } catch (Exception e) {
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, e.getMessage());
        }
    }

    public static void main(String args[]) {
        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name_field;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JButton register_button;
    private javax.swing.JLabel size_label2;
    private javax.swing.JLabel size_label3;
    private javax.swing.JLabel size_label4;
    private javax.swing.JLabel size_label5;
    private javax.swing.JTextField username_field;
    // End of variables declaration//GEN-END:variables
}
