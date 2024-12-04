package Forms;

import Main.Home;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import raven.toast.Notifications;

public class Cart extends javax.swing.JFrame {

    Home home;

    public Cart(BufferedImage image, String name, String price, String size, Home home) {
        initComponents();
        this.home = home;
        home.setEnabled(false);
        name_label.setText(name);
        size_label.setText(size);
        price_label.setText(price);
        image_label.setIcon(new ImageIcon(image.getScaledInstance(350, 350, Image.SCALE_SMOOTH)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        image_label = new javax.swing.JLabel();
        price_label = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        size_label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        name_field = new javax.swing.JTextField();
        phone_field = new javax.swing.JTextField();
        size_label1 = new javax.swing.JLabel();
        size_label2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image_label.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel1.add(image_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 350, 350));

        price_label.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        price_label.setForeground(new java.awt.Color(204, 204, 204));
        price_label.setText("Price");
        jPanel1.add(price_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 210, -1));

        name_label.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        name_label.setForeground(new java.awt.Color(204, 204, 204));
        name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_label.setText("Sanchez Shop");
        jPanel1.add(name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 360, -1));

        size_label.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        size_label.setForeground(new java.awt.Color(204, 204, 204));
        size_label.setText("Size");
        jPanel1.add(size_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 220, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Size");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 160, 40));

        jButton2.setBackground(new java.awt.Color(0, 102, 0));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Buy now !");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 160, 40));

        name_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(name_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 330, 40));

        phone_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        phone_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_fieldActionPerformed(evt);
            }
        });
        phone_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phone_fieldKeyTyped(evt);
            }
        });
        jPanel1.add(phone_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 330, 40));

        size_label1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        size_label1.setForeground(new java.awt.Color(255, 255, 255));
        size_label1.setText("Buyer phone number:");
        jPanel1.add(size_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 330, 30));

        size_label2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        size_label2.setForeground(new java.awt.Color(255, 255, 255));
        size_label2.setText("Buyer Name :");
        jPanel1.add(size_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 330, 30));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(748, 447));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        home.setEnabled(true);
        home.offGlass();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        submit();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void phone_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phone_fieldKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_phone_fieldKeyTyped

    private void name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_fieldActionPerformed
        submit();        // TODO add your handling code here:
    }//GEN-LAST:event_name_fieldActionPerformed

    private void phone_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_fieldActionPerformed
        submit();
    }//GEN-LAST:event_phone_fieldActionPerformed

    public void submit() {
        String MESSAGE = "Thank you for purchasing " + name_field.getText()
                + ",Item name:" + name_label.getText() + ", Price:" + price_label.getText() + ",size:" + size_label.getText() + ".";
        String IP_ADDRESS = Tools.IP.getIPAddress();
        String SEND_TO = phone_field.getText().trim();

        Connection conn = Main.JavaConnection.getConnection();
        if (name_field.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Empty name");
            return;
        }
        if (phone_field.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Empty phone number");
            return;
        }
        try (PreparedStatement pst = conn.prepareStatement("insert into orders(buyers_name,item_name,phone_number,price,size)"
                + "values(?,?,?,?,?)")) {
            pst.setString(1, name_field.getText());
            pst.setString(2, name_label.getText());
            pst.setString(3, phone_field.getText());
            pst.setString(4, price_label.getText());
            pst.setString(5, size_label.getText());
            pst.execute();
            Tools.Alert.Customer(IP_ADDRESS, SEND_TO, MESSAGE, true);
            name_field.setText("");
            phone_field.setText("");
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new Cart(null, null, null, null, null).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name_field;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField phone_field;
    private javax.swing.JLabel price_label;
    private javax.swing.JLabel size_label;
    private javax.swing.JLabel size_label1;
    private javax.swing.JLabel size_label2;
    // End of variables declaration//GEN-END:variables
}
