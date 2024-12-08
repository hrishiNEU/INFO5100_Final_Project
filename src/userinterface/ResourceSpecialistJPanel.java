/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface;

import business.role.DamageAnalyst;
import business.role.FieldResponseCoordinator;
import business.role.LogisticsCoordinator;
import business.role.ResourceSpecialist;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abhis
 */
public class ResourceSpecialistJPanel extends javax.swing.JPanel {

    FieldResponseCoordinator coordinator =FieldResponseCoordinator.findCoordinator(4);
    
    /**
     * Creates new form ResourceSpecialistJPanel
     */
    public ResourceSpecialistJPanel() {
        initComponents();
        populateFunds();
        populateRequestTable();
        populateInventory();
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
        tblInventoryReport = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        lblNeed = new javax.swing.JLabel();
        txtNeed = new javax.swing.JTextField();
        lblItem = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        lblFunds = new javax.swing.JLabel();
        txtFunds = new javax.swing.JTextField();
        btnRequest = new javax.swing.JButton();
        btnUpdateFunds = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 1000));

        tblInventoryReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Food Items", "Medical Supplies"
            }
        ));
        jScrollPane1.setViewportView(tblInventoryReport);

        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Coordinator", "Value", "Approved (Y/N)"
            }
        ));
        jScrollPane2.setViewportView(tblRequest);

        lblNeed.setText("Funds Needed");

        lblItem.setText("Items");

        lblFunds.setText("Available Funds");

        txtFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFundsActionPerformed(evt);
            }
        });

        btnRequest.setText("Request");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        btnUpdateFunds.setText("Update Funds");
        btnUpdateFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateFundsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblItem, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNeed)
                            .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblFunds, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFunds, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnUpdateFunds))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFunds)
                    .addComponent(txtFunds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNeed)
                    .addComponent(txtNeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItem)
                    .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRequest))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateFunds)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFundsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFundsActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
 
        ResourceSpecialist specialist = ResourceSpecialist.findSpecialist(7);
        
        FieldResponseCoordinator coordinator = FieldResponseCoordinator.findCoordinator(4);

        String items = txtItem.getText();
        double fundsNeed;
        try {
            fundsNeed = Double.parseDouble(txtNeed.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for funds",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        specialist.makeRequestToFieldResponseCoordinator(coordinator,specialist.getName(), items, fundsNeed);
        
    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnUpdateFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateFundsActionPerformed
        // TODO add your handling code here:
        ResourceSpecialist specialist = ResourceSpecialist.findSpecialist(7);
        txtFunds.setText(String.valueOf(specialist.getAvailableFunds()+specialist.getApprovedFundsValue()));
    }//GEN-LAST:event_btnUpdateFundsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequest;
    private javax.swing.JButton btnUpdateFunds;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFunds;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblNeed;
    private javax.swing.JTable tblInventoryReport;
    private javax.swing.JTable tblRequest;
    private javax.swing.JTextField txtFunds;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtNeed;
    // End of variables declaration//GEN-END:variables

    public void populateRequestTable() {
        ResourceSpecialist specialist = ResourceSpecialist.findSpecialist(7);
        DefaultTableModel model = (DefaultTableModel) tblRequest.getModel();
        model.setRowCount(0);
        
        if (specialist !=null) {
            Object row[] = new Object[3];
            row[0] = specialist.getFundsApprovedByCoordinator();
            row[1] = specialist.getApprovedFundsValue();
            row[2] = specialist.isApprovalStatus();
            model.addRow(row);
        } else {
            System.out.println("No Fund Request Made");
        }
    }
    
    private void populateInventory(){
        LogisticsCoordinator coordinator= LogisticsCoordinator.findCoordinator(6);
        DefaultTableModel model = (DefaultTableModel) tblInventoryReport.getModel();
        model.setRowCount(0);
        
        if ( coordinator!=null) {
            Object row[] = new Object[2];
            row[0] = coordinator.getFooditems();
            row[1] = coordinator.getMedicalsupplies();
            model.addRow(row);
        } else {
            System.out.println("Inventory Report Unavailable");
        }
        
    }

    private void populateFunds() {
        ResourceSpecialist specialist = ResourceSpecialist.findSpecialist(7);
        specialist.setAvailableFunds(10000.0);
        double funds = specialist.getAvailableFunds();
        txtFunds.setText(String.valueOf(funds));
    }

}
