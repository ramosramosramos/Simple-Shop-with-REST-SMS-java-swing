package Cards;

import Main.Home;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import raven.toast.Notifications;

public class CardItem extends javax.swing.JPanel {

    String id;
    String name;
    String price;
    String size;
    BufferedImage image;
    Home home;

    public CardItem(BufferedImage image, String name, String price, String size, String id, Home home) {

        initComponents();
        name_label.setText(name);
        price_label.setText(price);
        size_label.setText(size);
        this.id = id;
        this.price = price;
        this.size = size;
        this.name = name;
        this.image = image;
        this.home = home;

        image_label.setIcon(new ImageIcon(image.getScaledInstance(350, 350, Image.SCALE_SMOOTH)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        image_label = new javax.swing.JLabel();
        size_label = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        price_label = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 102, 0));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add to Cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 120, -1));

        image_label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        add(image_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 350, 350));

        size_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        size_label.setForeground(new java.awt.Color(51, 51, 51));
        size_label.setText("0000");
        add(size_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 120, 30));

        name_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        name_label.setForeground(new java.awt.Color(51, 51, 51));
        name_label.setText("Item name");
        add(name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 330, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Size:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 40, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Price:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 50, 30));

        price_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        price_label.setForeground(new java.awt.Color(51, 51, 51));
        price_label.setText("0000");
        add(price_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 110, 30));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 100, -1));

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 80, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

    }//GEN-LAST:event_formMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection conn = Main.JavaConnection.getConnection();
        try (PreparedStatement pst = conn.prepareStatement("Delete from items where id = ?")) {
            pst.setString(1, id);
            pst.execute();
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_LEFT, "Successfully deleted");
            this.setVisible(false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Object[] items = { name_label.getText(), price_label.getText(), size_label.getText()};
        String type = "Update";
        home.onGlass();
        new Forms.AddOrEditProductForm(items, id,image, type, home).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     home.onGlass();
     new Forms.Cart(image, name, price, size, home).setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel price_label;
    private javax.swing.JLabel size_label;
    // End of variables declaration//GEN-END:variables
}
