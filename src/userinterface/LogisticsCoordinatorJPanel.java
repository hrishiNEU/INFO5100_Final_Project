/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface;

import business.role.LogisticsCoordinator;
import business.role.ResourceSpecialist;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abhis
 */
public class LogisticsCoordinatorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LogisticsCoorinatorJPanel
     */
    public LogisticsCoordinatorJPanel() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventory = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        txtFoodItems = new javax.swing.JTextField();
        txtMedicalSupplies = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSendReport = new javax.swing.JButton();

        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "No. of Items", "No. of Supplies"
            }
        ));
        jScrollPane1.setViewportView(tblInventory);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel1.setText("Food Items");

        jLabel2.setText("Medical Supplies");

        btnSendReport.setText("Send Report");
        btnSendReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSendReport, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtFoodItems)
                                        .addComponent(txtMedicalSupplies, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                                .addComponent(btnAdd)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFoodItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedicalSupplies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(btnSendReport, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        int noOfItems = Integer.parseInt(txtFoodItems.getText());
        int noOfSupplies = Integer.parseInt(txtMedicalSupplies.getText());
        
        populateTable(noOfItems,noOfSupplies);
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSendReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendReportActionPerformed
        // TODO add your handling code here:
        LogisticsCoordinator coordinator= LogisticsCoordinator.findCoordinator(6);
        ResourceSpecialist specialist = ResourceSpecialist.findSpecialist(7);
        
        int noOfItems = Integer.parseInt(txtFoodItems.getText());
        int noOfSupplies = Integer.parseInt(txtMedicalSupplies.getText());
        
        coordinator.giveInfoToResourceSpecialist(specialist, noOfItems, noOfSupplies);

        JOptionPane.showMessageDialog(this, "Inventory report sent to " + coordinator.getName(),
                "Report Sent", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSendReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSendReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInventory;
    private javax.swing.JTextField txtFoodItems;
    private javax.swing.JTextField txtMedicalSupplies;
    // End of variables declaration//GEN-END:variables

    private void populateTable(int noOfItems, int noOfSupplies) {
        DefaultTableModel model = (DefaultTableModel) tblInventory.getModel();
        model.setRowCount(0);
        
        if (noOfItems!=0 && noOfSupplies!= 0) {
            Object row[] = new Object[2];
            row[0] = noOfItems;
            row[1] = noOfSupplies;
            model.addRow(row);
        } 
    }
}

