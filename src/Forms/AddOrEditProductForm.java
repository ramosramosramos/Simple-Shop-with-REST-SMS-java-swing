package Forms;

import Main.Home;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import raven.toast.Notifications;

public class AddOrEditProductForm extends javax.swing.JFrame {

    Connection conn = null;
    Home home;
    String id;
    String type;

    public AddOrEditProductForm(Object[] items, String id, BufferedImage image, String type, Home home) {
        initComponents();
        this.home = home;
        this.id = id;
        this.type = type;
        home.setEnabled(false);

        if (type.contains("Update")) {
            title_label.setText("Edit form");
            main_button.setText("Save edit");
            image_label.setIcon(new ImageIcon(image.getScaledInstance(350, 350, Image.SCALE_SMOOTH)));
            name_field.setText(items[0].toString());
            price_field.setText(items[1].toString());
            size_field.setText(items[2].toString());

        }

        conn = Main.JavaConnection.getConnection();
        Notifications.getInstance().setJFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        image_label = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        price_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        size_field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        main_button = new javax.swing.JButton();
        title_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 51, 0));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CLOSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 110, 30));

        image_label.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel1.add(image_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 350, 350));
        jPanel1.add(name_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 310, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Item name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 240, 30));
        jPanel1.add(price_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 310, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item price");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 240, 30));
        jPanel1.add(size_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 310, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Item size");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 240, 30));

        jButton2.setBackground(new java.awt.Color(51, 51, 0));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add image");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 110, 30));

        main_button.setBackground(new java.awt.Color(0, 0, 102));
        main_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        main_button.setForeground(new java.awt.Color(255, 255, 255));
        main_button.setText("CREATE");
        main_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(main_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 110, 30));

        title_label.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        title_label.setForeground(new java.awt.Color(204, 204, 204));
        title_label.setText("Create item");
        jPanel1.add(title_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 250, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(785, 540));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        browse();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void main_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_buttonActionPerformed
        submit();

    }//GEN-LAST:event_main_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        home.setEnabled(true);
        home.offGlass();
        home.getItems();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void submit() {
        if (type.contains("Update")) {
           if(selectedFile ==null){
                updateProductWithoutImage();
           }else{
                updateProduct();
           }
        } else {
            createProduct();
        }
    }
    File selectedFile = null;
    JFileChooser fileChooser = new JFileChooser();

    void browse() {

        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            try {
                Image img = ImageIO.read(selectedFile);

                Image scaledmage = img.getScaledInstance(350, 350, Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(scaledmage);
                image_label.setIcon(icon);

            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());

            }

        }

    }

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new AddOrEditProductForm(new Object[]{}, "", new BufferedImage(0, 0, 0), "", new Home()).setVisible(true);
        });
    }

    public void createProduct() {
        String name = name_field.getText();
        String price = price_field.getText();
        String size = size_field.getText();
        if (name.isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Empty name");
            return;
        }
        if (price.isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Price is empty");
            return;
        }
        if (size.isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Size is empty");
            return;
        }

        try (PreparedStatement pst = conn.prepareStatement("Insert into items(item_name,price,size,image) values (?,?,?,?)")) {
            pst.setString(1, name);
            pst.setString(2, price);
            pst.setString(3, size);
            pst.setBlob(4, new FileInputStream(selectedFile));
            pst.executeUpdate();
            dispose();
            home.setEnabled(true);
            home.offGlass();
            home.getItems();
            name_field.setText("");
            price_field.setText("");
            size_field.setText("");
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully created");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateProduct() {
        String name = name_field.getText();
        String price = price_field.getText();
        String size = size_field.getText();
        if (name.isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Empty name");
            return;
        }
        if (price.isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Price is empty");
            return;
        }
        if (size.isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Size is empty");
            return;
        }

        try (PreparedStatement pst = conn.prepareStatement("Update items"
                + " set item_name =?,"
                + "price = ?,"
                + "size =?,"
                + "image =? where id = ?")) {
            pst.setString(1, name);
            pst.setString(2, price);
            pst.setString(3, size);
            pst.setBlob(4, new FileInputStream(selectedFile));
            pst.setString(5, id);
            pst.executeUpdate();
            dispose();
            home.setEnabled(true);
            home.offGlass();
            home.getItems();
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully updated");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void updateProductWithoutImage() {
        String name = name_field.getText();
        String price = price_field.getText();
        String size = size_field.getText();
        if (name.isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Empty name");
            return;
        }
        if (price.isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Price is empty");
            return;
        }
        if (size.isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Size is empty");
            return;
        }

        try (PreparedStatement pst = conn.prepareStatement("Update items"
                + " set item_name =?,"
                + "price = ?,"
                + "size =? where id = ?")) {
            pst.setString(1, name);
            pst.setString(2, price);
            pst.setString(3, size);
            pst.setString(4, id);
            pst.executeUpdate();
            dispose();
            home.setEnabled(true);
            home.offGlass();
            home.getItems();
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_LEFT, "Successfully updated");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton main_button;
    private javax.swing.JTextField name_field;
    private javax.swing.JTextField price_field;
    private javax.swing.JTextField size_field;
    private javax.swing.JLabel title_label;
    // End of variables declaration//GEN-END:variables
}
