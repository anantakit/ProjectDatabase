package group_12;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import static group_12.DormitoryRentingSystem.my;
import javax.swing.JOptionPane;
public class Apartment extends javax.swing.JFrame {

    public Apartment() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        apart_id_TextField = new javax.swing.JTextField();
        name_TextField = new javax.swing.JTextField();
        phone_TextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        menu_Button = new javax.swing.JButton();
        delete_Button = new javax.swing.JButton();
        find_Button = new javax.swing.JButton();
        insert_Button = new javax.swing.JButton();
        show_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        apartment_Table = new javax.swing.JTable();
        update_Button = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        countfloor_TextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        address_TextArea = new javax.swing.JTextArea();
        clear_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(862, 655));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Apartment");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("apartment_id");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("phone");

        menu_Button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        menu_Button.setText("menu");
        menu_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_ButtonMouseClicked(evt);
            }
        });

        delete_Button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        delete_Button.setText("delete");
        delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_ButtonActionPerformed(evt);
            }
        });

        find_Button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        find_Button.setText("find");
        find_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                find_ButtonActionPerformed(evt);
            }
        });

        insert_Button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        insert_Button.setText("insert");
        insert_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_ButtonActionPerformed(evt);
            }
        });

        show_Button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        show_Button.setText("show");
        show_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_ButtonActionPerformed(evt);
            }
        });

        apartment_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "apartment_id", "name", "phone", "address", "countfloor"
            }
        ));
        jScrollPane1.setViewportView(apartment_Table);

        update_Button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        update_Button.setText("update");
        update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_ButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("countfloor");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setText("address");

        address_TextArea.setColumns(20);
        address_TextArea.setRows(5);
        jScrollPane2.setViewportView(address_TextArea);

        clear_Button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        clear_Button.setText("clear");
        clear_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menu_Button)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apart_id_TextField)
                                    .addComponent(name_TextField)
                                    .addComponent(phone_TextField)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addComponent(countfloor_TextField))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 36, Short.MAX_VALUE)
                                .addComponent(clear_Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(show_Button)
                                .addGap(18, 18, 18)
                                .addComponent(insert_Button)
                                .addGap(18, 18, 18)
                                .addComponent(update_Button)
                                .addGap(18, 18, 18)
                                .addComponent(delete_Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(find_Button)
                                .addGap(46, 46, 46))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menu_Button)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(apart_id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phone_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(countfloor_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(find_Button)
                    .addComponent(delete_Button)
                    .addComponent(update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insert_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_ButtonMouseClicked
       menu m = new menu();
        m.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_menu_ButtonMouseClicked

    private void clear_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_ButtonActionPerformed
        apart_id_TextField.setText(null);
        name_TextField.setText(null);
        phone_TextField.setText(null);
        address_TextArea.setText(null);
        countfloor_TextField.setText(null);
    }//GEN-LAST:event_clear_ButtonActionPerformed

    private void show_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_ButtonActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) apartment_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("apartment");
            while (rs.next()) {
                String apartment_id = rs.getString("apart_id");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String countfloor = rs.getString("count_floor");
                model.addRow(new String[]{apartment_id, name, phone, address, countfloor});
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err: " + exc);
        }
    }//GEN-LAST:event_show_ButtonActionPerformed

    private void insert_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_ButtonActionPerformed
        String apart_id = apart_id_TextField.getText();
        String name = name_TextField.getText();
        String phone = phone_TextField.getText();
        String address = address_TextArea.getText();
        String countfloor = countfloor_TextField.getText();
        try {
            if (my.insertApartmentData(apart_id, name, phone, address, countfloor)) {
                DefaultTableModel model = (DefaultTableModel) apartment_Table.getModel();
                model.setRowCount(0);
                ResultSet rs = my.getData("apartment");
                while (rs.next()) {
                    String aapartment_id = rs.getString("apart_id");
                    String nname = rs.getString("name");
                    String pphone = rs.getString("phone");
                    String aaddress = rs.getString("address");
                    String ccountfloor = rs.getString("count_floor");
                    model.addRow(new String[]{aapartment_id, nname, pphone, aaddress, ccountfloor});
                }
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err: " + exc);
        }
    }//GEN-LAST:event_insert_ButtonActionPerformed

    private void update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_ButtonActionPerformed
        String apart_id = apart_id_TextField.getText();
        String name = name_TextField.getText();
        String phone = phone_TextField.getText();
        String address = address_TextArea.getText();
        String countfloor = countfloor_TextField.getText();
        try {
            if (my.updateApartmentData(apart_id, name, phone, address, countfloor)) {
                DefaultTableModel model = (DefaultTableModel) apartment_Table.getModel();
                model.setRowCount(0);
                ResultSet rs = my.getData("apartment");
                while (rs.next()) {
                    String aapartment_id = rs.getString("apart_id");
                    String nname = rs.getString("name");
                    String pphone = rs.getString("phone");
                    String aaddress = rs.getString("address");
                    String ccountfloor = rs.getString("count_floor");
                    model.addRow(new String[]{aapartment_id, nname, pphone, aaddress, ccountfloor});
                }
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err: " + exc);
        }
    }//GEN-LAST:event_update_ButtonActionPerformed

    private void delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_ButtonActionPerformed
        String apart_id = apart_id_TextField.getText();
        try {
            if (my.deleteApartmentData(apart_id)) {
                DefaultTableModel model = (DefaultTableModel) apartment_Table.getModel();
                model.setRowCount(0);
                ResultSet rs = my.getData("apartment");
                while (rs.next()) {
                    String aapartment_id = rs.getString("apart_id");
                    String nname = rs.getString("name");
                    String pphone = rs.getString("phone");
                    String aaddress = rs.getString("address");
                    String ccountfloor = rs.getString("count_floor");
                    model.addRow(new String[]{aapartment_id, nname, pphone, aaddress, ccountfloor});
                }
            }
            JOptionPane.showMessageDialog(null,"DELETE" );
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err: " + exc);
        }
    }//GEN-LAST:event_delete_ButtonActionPerformed

    private void find_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_find_ButtonActionPerformed
        String apart_id = apart_id_TextField.getText();
        try {
            DefaultTableModel model = (DefaultTableModel) apartment_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("apartment where apart_id = '" + apart_id + "'");
            while (rs.next()) {
                String apartment_id = rs.getString("apart_id");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String countfloor = rs.getString("count_floor");
                model.addRow(new String[]{apartment_id, name, phone, address, countfloor});
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err: " + exc);
        }
    }//GEN-LAST:event_find_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Apartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apartment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address_TextArea;
    private javax.swing.JTextField apart_id_TextField;
    private javax.swing.JTable apartment_Table;
    private javax.swing.JButton clear_Button;
    private javax.swing.JTextField countfloor_TextField;
    private javax.swing.JButton delete_Button;
    private javax.swing.JButton find_Button;
    private javax.swing.JButton insert_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton menu_Button;
    private javax.swing.JTextField name_TextField;
    private javax.swing.JTextField phone_TextField;
    private javax.swing.JButton show_Button;
    private javax.swing.JButton update_Button;
    // End of variables declaration//GEN-END:variables
}
