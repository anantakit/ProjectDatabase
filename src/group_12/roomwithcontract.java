/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group_12;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static group_12.DormitoryRentingSystem.my;


/**
 *
 * @author WiN 10 V.3
 */
public class roomwithcontract extends javax.swing.JFrame {
   
    public roomwithcontract() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomwithscontract_Table = new javax.swing.JTable();
        apartment_id_TextField = new javax.swing.JTextField();
        promotion_id_TextField = new javax.swing.JTextField();
        customer_id_TextField = new javax.swing.JTextField();
        room_number_TextField = new javax.swing.JTextField();
        insert_Button = new javax.swing.JButton();
        update_Button = new javax.swing.JButton();
        delete_Button = new javax.swing.JButton();
        find_Button = new javax.swing.JButton();
        show_Button = new javax.swing.JButton();
        contract_id_TextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        receipt_id_TextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        clear_Button = new javax.swing.JButton();
        receipt_id_TextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("apartmentwithscontract");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        roomwithscontract_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "promotion_id", "customer_id", "room_number", "contract_id", "apart_id", "receipt_id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(roomwithscontract_Table);

        apartment_id_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apartment_id_TextFieldActionPerformed(evt);
            }
        });

        insert_Button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        insert_Button.setText("insert");
        insert_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_ButtonActionPerformed(evt);
            }
        });

        update_Button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        update_Button.setText("update");
        update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_ButtonActionPerformed(evt);
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

        show_Button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        show_Button.setText("show");
        show_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_ButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("promotion_id");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("customer_id");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Room_id");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("contract_id");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("apartment_id");

        receipt_id_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receipt_id_TextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("receipt_id");

        clear_Button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        clear_Button.setText("clear");
        clear_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_ButtonActionPerformed(evt);
            }
        });

        receipt_id_TextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receipt_id_TextField1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(customer_id_TextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(promotion_id_TextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apartment_id_TextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(room_number_TextField)
                            .addComponent(contract_id_TextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(receipt_id_TextField)
                            .addComponent(receipt_id_TextField1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(clear_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insert_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(find_Button)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(receipt_id_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(promotion_id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customer_id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(room_number_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contract_id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apartment_id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(receipt_id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(show_Button)
                    .addComponent(insert_Button)
                    .addComponent(update_Button)
                    .addComponent(delete_Button)
                    .addComponent(find_Button)
                    .addComponent(clear_Button))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void show_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_ButtonActionPerformed
         try {
            DefaultTableModel model = (DefaultTableModel) roomwithscontract_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("withs");
            while (rs.next()) {
                String pro_id = rs.getString("pro_id");
                String cus_id = rs.getString("cus_id");
                String room_number = rs.getString("room_number");
                String contract_id = rs.getString("contract_id");
                String apart_id = rs.getString("apart_id");
                String receipt_id = rs.getString("receipt_id");
                String idd = rs.getString("id");
                model.addRow(new String[]{idd,pro_id, cus_id,room_number,contract_id,apart_id,receipt_id});
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err : "+exc);
        }
    }//GEN-LAST:event_show_ButtonActionPerformed

    private void apartment_id_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apartment_id_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apartment_id_TextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         menu m = new menu();
         m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void receipt_id_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receipt_id_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receipt_id_TextFieldActionPerformed

    private void clear_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_ButtonActionPerformed
        promotion_id_TextField.setText("");
        customer_id_TextField.setText("");
        room_number_TextField.setText("");
        contract_id_TextField.setText("");
        apartment_id_TextField.setText("");
        receipt_id_TextField.setText("");
        receipt_id_TextField1.setText("");
        
        
        
    }//GEN-LAST:event_clear_ButtonActionPerformed

    private void delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_ButtonActionPerformed
        String pro_id = promotion_id_TextField.getText();
        String cus_id = customer_id_TextField.getText();
        String room_number = room_number_TextField.getText();
        String contract_id = contract_id_TextField.getText();
        String apart_id = apartment_id_TextField.getText();
        String receipt_id = receipt_id_TextField.getText();
        String id = receipt_id_TextField1.getText();
        try {if(my.deleteroomwithscontractData(pro_id,cus_id,room_number,contract_id,apart_id,receipt_id,id)) {
            DefaultTableModel model = (DefaultTableModel) roomwithscontract_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("withs");
            while (rs.next()) {
                String ppro_id = rs.getString("pro_id");
                String ccus_id = rs.getString("cus_id");
                String rroom_number = rs.getString("room_number");
                String ccontract_id = rs.getString("contract_id");
                String aapart_id = rs.getString("apart_id");
                String rreceipt_id = rs.getString("receipt_id");
                String iid = rs.getString("id");
                model.addRow(new String[]{iid,ppro_id, ccus_id,rroom_number,ccontract_id,aapart_id,rreceipt_id});
            }
            }JOptionPane.showMessageDialog(null,"DELETE" );
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err : "+exc);
        }
    }//GEN-LAST:event_delete_ButtonActionPerformed

    private void find_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_find_ButtonActionPerformed
        String pro_id = promotion_id_TextField.getText();
        String cus_id = customer_id_TextField.getText();
        String room_number = room_number_TextField.getText();
        String contract_id = contract_id_TextField.getText();
        String apart_id = apartment_id_TextField.getText();
        String receipt_id = receipt_id_TextField.getText();
        String id = receipt_id_TextField1.getText();
        try { {
            DefaultTableModel model = (DefaultTableModel) roomwithscontract_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("withs where id =  '"+id+"'");
            while (rs.next()) {
                String ppro_id = rs.getString("pro_id");
                String ccus_id = rs.getString("cus_id");
                String rroom_number = rs.getString("room_number");
                String ccontract_id = rs.getString("contract_id");
                String aapart_id = rs.getString("apart_id");
                String rreceipt_id = rs.getString("receipt_id");
                String iid = rs.getString("id");
                model.addRow(new String[]{iid,ppro_id, ccus_id,rroom_number,ccontract_id,aapart_id,rreceipt_id});
            }
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err : "+exc);
        }
    }//GEN-LAST:event_find_ButtonActionPerformed

    private void insert_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_ButtonActionPerformed
        String pro_id = promotion_id_TextField.getText();
        String cus_id = customer_id_TextField.getText();
        String room_number = room_number_TextField.getText();
        String contract_id = contract_id_TextField.getText();
        String apart_id = apartment_id_TextField.getText();
        String receipt_id = receipt_id_TextField.getText();
        String id = receipt_id_TextField1.getText();
        try {if(my.insertroomwithscontractData(pro_id,cus_id,room_number,contract_id,apart_id,receipt_id,id)) {
            DefaultTableModel model = (DefaultTableModel) roomwithscontract_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("withs");
            while (rs.next()) {
                String ppro_id = rs.getString("pro_id");
                String ccus_id = rs.getString("cus_id");
                String rroom_number = rs.getString("room_number");
                String ccontract_id = rs.getString("contract_id");
                String aapart_id = rs.getString("apart_id");
                String rreceipt_id = rs.getString("receipt_id");
                String iid = rs.getString("id");
                model.addRow(new String[]{iid,ppro_id, ccus_id,rroom_number,ccontract_id,aapart_id,rreceipt_id});
            }
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err : "+exc);
        }
    }//GEN-LAST:event_insert_ButtonActionPerformed

    private void update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_ButtonActionPerformed
        String pro_id = promotion_id_TextField.getText();
        String cus_id = customer_id_TextField.getText();
        String room_number = room_number_TextField.getText();
        String contract_id = contract_id_TextField.getText();
        String apart_id = apartment_id_TextField.getText();
        String receipt_id = receipt_id_TextField.getText();
        String id = receipt_id_TextField1.getText();
        try {if(my.updateroomwithscontractData(pro_id,cus_id,room_number,contract_id,apart_id,receipt_id,id)) {
            DefaultTableModel model = (DefaultTableModel) roomwithscontract_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("withs");
            while (rs.next()) {
                String ppro_id = rs.getString("pro_id");
                String ccus_id = rs.getString("cus_id");
                String rroom_number = rs.getString("room_number");
                String ccontract_id = rs.getString("contract_id");
                String aapart_id = rs.getString("apart_id");
                String rreceipt_id = rs.getString("receipt_id");
                String iid = rs.getString("id");
                model.addRow(new String[]{iid,ppro_id, ccus_id,rroom_number,ccontract_id,aapart_id,rreceipt_id});
            }
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err : "+exc);
        }
    }//GEN-LAST:event_update_ButtonActionPerformed

    private void receipt_id_TextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receipt_id_TextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receipt_id_TextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(roomwithcontract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(roomwithcontract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(roomwithcontract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(roomwithcontract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new roomwithcontract().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apartment_id_TextField;
    private javax.swing.JButton clear_Button;
    private javax.swing.JTextField contract_id_TextField;
    private javax.swing.JTextField customer_id_TextField;
    private javax.swing.JButton delete_Button;
    private javax.swing.JButton find_Button;
    private javax.swing.JButton insert_Button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField promotion_id_TextField;
    private javax.swing.JTextField receipt_id_TextField;
    private javax.swing.JTextField receipt_id_TextField1;
    private javax.swing.JTextField room_number_TextField;
    private javax.swing.JTable roomwithscontract_Table;
    private javax.swing.JButton show_Button;
    private javax.swing.JButton update_Button;
    // End of variables declaration//GEN-END:variables
}
