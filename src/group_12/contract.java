package group_12;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static group_12.DormitoryRentingSystem.my;
import javax.swing.JOptionPane;

public class contract extends javax.swing.JFrame {
    
    public contract() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menu_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        contract_Table = new javax.swing.JTable();
        contract_id_TextField = new javax.swing.JTextField();
        promotion_id_TextField = new javax.swing.JTextField();
        customer_id_TextField = new javax.swing.JTextField();
        apartment_id_TextField = new javax.swing.JTextField();
        insert_Button = new javax.swing.JButton();
        update_Button = new javax.swing.JButton();
        delete_Button = new javax.swing.JButton();
        find_Button = new javax.swing.JButton();
        show_Button = new javax.swing.JButton();
        room_number_TextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        start_date_TextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        exp_date_TextField = new javax.swing.JTextField();
        recipt_date_TextField = new javax.swing.JTextField();
        deposite_TextField = new javax.swing.JTextField();
        clear_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("contract");

        menu_Button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        menu_Button.setText("MENU");
        menu_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ButtonActionPerformed(evt);
            }
        });

        contract_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "contract_id", "customer_id", "apartment_id", "room_number", "promotion_id", "start_date", "exp_date", "receipt_id", "deposite"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(contract_Table);

        contract_id_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contract_id_TextFieldActionPerformed(evt);
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
        jLabel5.setText("apartment_id");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("room_number");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("contract_id");

        start_date_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_date_TextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("start_date");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("exp_date");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("receipt");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("deposite");

        exp_date_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exp_date_TextFieldActionPerformed(evt);
            }
        });

        deposite_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposite_TextFieldActionPerformed(evt);
            }
        });

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(clear_Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(show_Button)
                                .addGap(18, 18, 18)
                                .addComponent(insert_Button)
                                .addGap(18, 18, 18)
                                .addComponent(update_Button)
                                .addGap(18, 18, 18)
                                .addComponent(delete_Button)
                                .addGap(18, 18, 18)
                                .addComponent(find_Button)
                                .addGap(5, 5, 5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(promotion_id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(room_number_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(start_date_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(exp_date_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(recipt_date_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(deposite_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(contract_id_TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(customer_id_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                                .addComponent(apartment_id_TextField)))))
                                .addGap(72, 72, 72)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menu_Button)
                        .addGap(73, 73, 73))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menu_Button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contract_id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(customer_id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(apartment_id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(room_number_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(start_date_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(exp_date_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(recipt_date_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(deposite_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(promotion_id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear_Button)
                    .addComponent(show_Button)
                    .addComponent(insert_Button)
                    .addComponent(update_Button)
                    .addComponent(delete_Button)
                    .addComponent(find_Button))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void show_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_ButtonActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) contract_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("includecontract");
            while (rs.next()) {
                String ppro_id = rs.getString("pro_id");
                String ccus_id = rs.getString("cus_id");
                String aapart_id = rs.getString("apart_id");
                String rroom_number = rs.getString("room_number");
                String ccontract_id = rs.getString("contract_id");
                String sstart_date = rs.getString("start_date");
                String rrecipt_date = rs.getString("receipt_id");
                
                String eexp_date = rs.getString("exp_date");
                
                String ddeposite = rs.getString("deposite");
                model.addRow(new String[]{ccontract_id, ccus_id,aapart_id,rroom_number,ppro_id,sstart_date,eexp_date,rrecipt_date,ddeposite});
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err : "+exc);
        }
    }//GEN-LAST:event_show_ButtonActionPerformed

    private void contract_id_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contract_id_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contract_id_TextFieldActionPerformed

    private void menu_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ButtonActionPerformed
        menu m = new menu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menu_ButtonActionPerformed

    private void start_date_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_date_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_start_date_TextFieldActionPerformed

    private void exp_date_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exp_date_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exp_date_TextFieldActionPerformed

    private void insert_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_ButtonActionPerformed
         String pro_id = promotion_id_TextField.getText();
         String cus_id = customer_id_TextField.getText();
         String apart_id = apartment_id_TextField.getText();
         String room_number = room_number_TextField.getText();
         String contract_id = contract_id_TextField.getText();
         String start_date = start_date_TextField.getText();
         String exp_date = exp_date_TextField.getText();
         String recipt_date =  recipt_date_TextField.getText();
         String deposite = deposite_TextField.getText();
         
        try {
            if (my.insertContractData(pro_id,cus_id,apart_id,room_number,contract_id,start_date,exp_date,recipt_date,deposite)) {
               DefaultTableModel model = (DefaultTableModel) contract_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("includecontract");
            while (rs.next()) {
                String ppro_id = rs.getString("pro_id");
                String ccus_id = rs.getString("cus_id");
                String aapart_id = rs.getString("apart_id");
                String rroom_number = rs.getString("room_number");
                String ccontract_id = rs.getString("contract_id");
                String sstart_date = rs.getString("start_date");
                String eexp_date = rs.getString("exp_date");
                String rrecipt_date = rs.getString("receipt_id");
                String ddeposite = rs.getString("deposite");
                model.addRow(new String[]{ccontract_id, ccus_id,aapart_id,rroom_number,ppro_id,sstart_date,eexp_date,rrecipt_date,ddeposite});
            }
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err: " + exc);
        }
    }//GEN-LAST:event_insert_ButtonActionPerformed

    private void clear_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_ButtonActionPerformed
        promotion_id_TextField.setText("");
        customer_id_TextField.setText("");
        apartment_id_TextField.setText("");
        room_number_TextField.setText("");
        contract_id_TextField.setText("");
        start_date_TextField.setText("");
        exp_date_TextField.setText("");
        recipt_date_TextField.setText("");
        deposite_TextField.setText("");
    }//GEN-LAST:event_clear_ButtonActionPerformed

    private void delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_ButtonActionPerformed
         String pro_id = promotion_id_TextField.getText();
         String cus_id = customer_id_TextField.getText();
         String apart_id = apartment_id_TextField.getText();
         String room_number = room_number_TextField.getText();
         String contract_id = contract_id_TextField.getText();
         String r = recipt_date_TextField.getText();
         String s = start_date_TextField.getText();
        try {
            if (my.deleteContractData(pro_id,cus_id,apart_id,room_number,contract_id,r,s)) {
               DefaultTableModel model = (DefaultTableModel) contract_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("includecontract");
            while (rs.next()) {
                String ppro_id = rs.getString("pro_id");
                String ccus_id = rs.getString("cus_id");
                String aapart_id = rs.getString("apart_id");
                String rroom_number = rs.getString("room_number");
                String ccontract_id = rs.getString("contract_id");
                String sstart_date = rs.getString("start_date");
                String eexp_date = rs.getString("exp_date");
                String rrecipt_date = rs.getString("receipt_id");
                String ddeposite = rs.getString("deposite");
               model.addRow(new String[]{ccontract_id, ccus_id,aapart_id,rroom_number,ppro_id,sstart_date,eexp_date,rrecipt_date,ddeposite});
            }
            }JOptionPane.showMessageDialog(null,"DELETE" );
        } catch (Exception exc) {
           JOptionPane.showMessageDialog(null,"Err: " + exc);
        }
    }//GEN-LAST:event_delete_ButtonActionPerformed

    private void find_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_find_ButtonActionPerformed
         String pro_id = promotion_id_TextField.getText();
         String cus_id = customer_id_TextField.getText();
         String apart_id = apartment_id_TextField.getText();
         String room_number = room_number_TextField.getText();
         String contract_id = contract_id_TextField.getText();
         String r = recipt_date_TextField.getText();
        
        try {
            DefaultTableModel model = (DefaultTableModel) contract_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("includecontract where contract_id = '"+contract_id+"'");
            while (rs.next()) {
                String ppro_id = rs.getString("pro_id");
                String ccus_id = rs.getString("cus_id");
                String aapart_id = rs.getString("apart_id");
                String rroom_number = rs.getString("room_number");
                String ccontract_id = rs.getString("contract_id");
                String sstart_date = rs.getString("start_date");
                String eexp_date = rs.getString("exp_date");
                String rrecipt_date = rs.getString("receipt_id");
                String ddeposite = rs.getString("deposite");
                model.addRow(new String[]{ccontract_id, ccus_id,aapart_id,rroom_number,ppro_id,sstart_date,eexp_date,rrecipt_date,ddeposite});
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err : "+exc);
        }
    }//GEN-LAST:event_find_ButtonActionPerformed

    private void update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_ButtonActionPerformed
         String pro_id = promotion_id_TextField.getText();
         String cus_id = customer_id_TextField.getText();
         String apart_id = apartment_id_TextField.getText();
         String room_number = room_number_TextField.getText();
         String contract_id = contract_id_TextField.getText();
         String start_date = start_date_TextField.getText();
         String exp_date = exp_date_TextField.getText();
         String recipt_date =  recipt_date_TextField.getText();
         String deposite = deposite_TextField.getText();
         
         
        try {
            if (my.updateContractData(pro_id,cus_id,apart_id,room_number,contract_id,start_date,exp_date,recipt_date,deposite)) {
               DefaultTableModel model = (DefaultTableModel) contract_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("includecontract");
            while (rs.next()) {
                String ppro_id = rs.getString("pro_id");
                String ccus_id = rs.getString("cus_id");
                String aapart_id = rs.getString("apart_id");
                String rroom_number = rs.getString("room_number");
                String ccontract_id = rs.getString("contract_id");
                String sstart_date = rs.getString("start_date");
                String eexp_date = rs.getString("exp_date");
                String rrecipt_date = rs.getString("receipt_id");
                String ddeposite = rs.getString("deposite");
                model.addRow(new String[]{ccontract_id, ccus_id,aapart_id,rroom_number,ppro_id,sstart_date,eexp_date,rrecipt_date,ddeposite});
            }
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err: " + exc);
        }
    }//GEN-LAST:event_update_ButtonActionPerformed

    private void deposite_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposite_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deposite_TextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new contract().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apartment_id_TextField;
    private javax.swing.JButton clear_Button;
    private javax.swing.JTable contract_Table;
    private javax.swing.JTextField contract_id_TextField;
    private javax.swing.JTextField customer_id_TextField;
    private javax.swing.JButton delete_Button;
    private javax.swing.JTextField deposite_TextField;
    private javax.swing.JTextField exp_date_TextField;
    private javax.swing.JButton find_Button;
    private javax.swing.JButton insert_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menu_Button;
    private javax.swing.JTextField promotion_id_TextField;
    private javax.swing.JTextField recipt_date_TextField;
    private javax.swing.JTextField room_number_TextField;
    private javax.swing.JButton show_Button;
    private javax.swing.JTextField start_date_TextField;
    private javax.swing.JButton update_Button;
    // End of variables declaration//GEN-END:variables
}
