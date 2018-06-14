
package group_12;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import static group_12.DormitoryRentingSystem.my;
import javax.swing.JOptionPane;
public class Employee extends javax.swing.JFrame {

 
    public Employee() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        employee_id_TextField = new javax.swing.JTextField();
        name_TextField = new javax.swing.JTextField();
        department_TextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        menu_Button = new javax.swing.JButton();
        delete_Button = new javax.swing.JButton();
        find_Button = new javax.swing.JButton();
        insert_Button = new javax.swing.JButton();
        show_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        employee_Table = new javax.swing.JTable();
        update_Button = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        salary_TextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        apartment_id_TextField = new javax.swing.JTextField();
        clear_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(862, 655));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Employee");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("employee_id");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("department");

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

        employee_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "employee_id", "name", "department", "apartment_id", "salary"
            }
        ));
        jScrollPane1.setViewportView(employee_Table);

        update_Button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        update_Button.setText("update");
        update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_ButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("salary");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setText("apartment_id");

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
                        .addGap(324, 324, 324)
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
                                    .addComponent(department_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(employee_id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salary_TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apartment_id_TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(clear_Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(show_Button)
                                .addGap(18, 18, 18)
                                .addComponent(insert_Button)
                                .addGap(18, 18, 18)
                                .addComponent(update_Button)
                                .addGap(18, 18, 18)
                                .addComponent(delete_Button)
                                .addGap(18, 18, 18)
                                .addComponent(find_Button))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE))
                        .addGap(40, 40, 40))))
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
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(employee_id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(department_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(apartment_id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(salary_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
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
        employee_id_TextField.setText("");
        name_TextField.setText("");
        department_TextField.setText("");
        apartment_id_TextField.setText("");
        salary_TextField.setText("");
    }//GEN-LAST:event_clear_ButtonActionPerformed

    private void show_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_ButtonActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) employee_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("includeemployee");
             
            while (rs.next()) {
                String employee_id = rs.getString("emp_id");
                String name = rs.getString("name");
                String department = rs.getString("department");
                String apartment_id = rs.getString("apart_id");
                String salary = rs.getString("salary");
                model.addRow(new String[]{employee_id, name,department,apartment_id,salary});
            }
           
            
               
            
              
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err: " + exc);
        }

    }//GEN-LAST:event_show_ButtonActionPerformed

    private void insert_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_ButtonActionPerformed
        String employee_id = employee_id_TextField.getText();
        String name = name_TextField.getText();
        String department = department_TextField.getText();
        String apartment_id = apartment_id_TextField.getText();
        String salary = salary_TextField.getText();
        try {
            if (my.insertEmployeeData(employee_id, name,department,apartment_id,salary)) {
            DefaultTableModel model = (DefaultTableModel) employee_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("includeemployee");
            while (rs.next()) {
                String eemployee_id = rs.getString("emp_id");
                String nname = rs.getString("name");
                String ddepartment = rs.getString("department");
                String aapartment_id = rs.getString("apart_id");
                String ssalary = rs.getString("salary");
                model.addRow(new String[]{eemployee_id, nname,ddepartment,aapartment_id,ssalary});}
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err: " + exc);
        }
    }//GEN-LAST:event_insert_ButtonActionPerformed

    private void delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_ButtonActionPerformed
        String employee_id = employee_id_TextField.getText();
        try {
            if (my.deleteEmployeeData(employee_id)) {
            DefaultTableModel model = (DefaultTableModel) employee_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("includeemployee");
            while (rs.next()) {
                String eemployee_id = rs.getString("emp_id");
                String nname = rs.getString("name");
                String ddepartment = rs.getString("department");
                String aapartment_id = rs.getString("apart_id");
                String ssalary = rs.getString("salary");
                model.addRow(new String[]{eemployee_id, nname,ddepartment,aapartment_id,ssalary});}
            }JOptionPane.showMessageDialog(null,"DELETE" );
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err: " + exc);
        }
    }//GEN-LAST:event_delete_ButtonActionPerformed

    private void update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_ButtonActionPerformed
        String employee_id = employee_id_TextField.getText();
        String name = name_TextField.getText();
        String department = department_TextField.getText();
        String apartment_id = apartment_id_TextField.getText();
        String salary = salary_TextField.getText();
        try {
            if (my.updateEmployeeData(employee_id, name,department,apartment_id,salary)) {
            DefaultTableModel model = (DefaultTableModel) employee_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("includeemployee");
            while (rs.next()) {
                String eemployee_id = rs.getString("emp_id");
                String nname = rs.getString("name");
                String ddepartment = rs.getString("department");
                String aapartment_id = rs.getString("apart_id");
                String ssalary = rs.getString("salary");
                model.addRow(new String[]{eemployee_id, nname,ddepartment,aapartment_id,ssalary});}
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,"Err: " + exc);
        }
    }//GEN-LAST:event_update_ButtonActionPerformed

    private void find_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_find_ButtonActionPerformed
        String employee_id = employee_id_TextField.getText();
       try {
            DefaultTableModel model = (DefaultTableModel) employee_Table.getModel();
            model.setRowCount(0);
            ResultSet rs = my.getData("includeemployee where emp_id = '"+employee_id+"'");
            while (rs.next()) {
                String eemployee_id = rs.getString("emp_id");
                String name = rs.getString("name");
                String department = rs.getString("department");
                String apartment_id = rs.getString("apart_id");
                String salary = rs.getString("salary");
                model.addRow(new String[]{eemployee_id, name,department,apartment_id,salary});
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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apartment_id_TextField;
    private javax.swing.JButton clear_Button;
    private javax.swing.JButton delete_Button;
    private javax.swing.JTextField department_TextField;
    private javax.swing.JTable employee_Table;
    private javax.swing.JTextField employee_id_TextField;
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
    private javax.swing.JButton menu_Button;
    private javax.swing.JTextField name_TextField;
    private javax.swing.JTextField salary_TextField;
    private javax.swing.JButton show_Button;
    private javax.swing.JButton update_Button;
    // End of variables declaration//GEN-END:variables
}
