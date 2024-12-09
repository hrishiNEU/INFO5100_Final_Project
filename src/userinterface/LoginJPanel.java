/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface;

import business.Network;
import business.enterprise.EnterpriseDirectory;
import business.role.Citizen;
import business.role.CitizenDirectory;
import business.role.DamageAnalyst;
import business.role.EmergencyOperationCoordinator;
import business.role.FieldResponseCoordinator;
import business.role.HospitalManager;
import business.role.LogisticsCoordinator;
import business.role.ResourceSpecialist;
import business.role.ResponseTeamAgent;
import business.role.ResponseTeamCoordinator;
import business.role.SystemAdmin;
import business.role.VolunteerCoordinator;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author abhis
 */
public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginJPanel
     */
    
    Network network;
    EnterpriseDirectory enterpriseDirectory;
    MainJFrame mainPanel;
    
    public LoginJPanel(MainJFrame mainPanel,Network network, EnterpriseDirectory enterpriseDirectory) {
        initComponents();
        this.mainPanel = mainPanel;
        this.network = network;
        this.enterpriseDirectory = enterpriseDirectory;
        workArea.setLayout(new CardLayout()); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        useridlbl = new javax.swing.JLabel();
        passwordlbl = new javax.swing.JLabel();
        passwordpwd = new javax.swing.JPasswordField();
        useridtxt = new javax.swing.JTextField();
        CheckBox = new javax.swing.JCheckBox();
        loginbtn = new javax.swing.JButton();
        useridlbl1 = new javax.swing.JLabel();
        comboSelected = new javax.swing.JComboBox<>();
        workArea = new javax.swing.JPanel();

        splitPane.setDividerLocation(350);

        leftPanel.setBackground(java.awt.SystemColor.activeCaption);
        leftPanel.setPreferredSize(new java.awt.Dimension(1000, 1000));

        useridlbl.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        useridlbl.setForeground(new java.awt.Color(0, 0, 153));
        useridlbl.setText("ID/Type:");

        passwordlbl.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        passwordlbl.setForeground(new java.awt.Color(0, 0, 153));
        passwordlbl.setText("Password:");

        passwordpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordpwdActionPerformed(evt);
            }
        });

        useridtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridtxtActionPerformed(evt);
            }
        });

        CheckBox.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        CheckBox.setForeground(new java.awt.Color(0, 0, 153));
        CheckBox.setText(" show password ");
        CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxActionPerformed(evt);
            }
        });

        loginbtn.setBackground(new java.awt.Color(0, 0, 153));
        loginbtn.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setText("LOGIN");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        useridlbl1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        useridlbl1.setForeground(new java.awt.Color(0, 0, 153));
        useridlbl1.setText("Login As:");

        comboSelected.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        comboSelected.setForeground(new java.awt.Color(0, 0, 153));
        comboSelected.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Citizen", "Damage Analyst", "Emergency Operation Coordinator", "Field Response Coordinator", "Hospital Manager", "Logistics Coordinator", "Resource Specialist", "Response Team Agent", "Response Team Coordinator", "Volunteer Coordinator"}));
        comboSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSelectedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(useridlbl)
                    .addComponent(useridtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordlbl)
                    .addComponent(passwordpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(useridlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(useridlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(useridtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(passwordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(passwordpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CheckBox)
                .addGap(18, 18, 18)
                .addComponent(useridlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(loginbtn))
        );

        splitPane.setLeftComponent(leftPanel);

        workArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        splitPane.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void passwordpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordpwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordpwdActionPerformed

    private void useridtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridtxtActionPerformed

    private void CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxActionPerformed
        // TODO add your handling code here:

        if(CheckBox.isSelected()){
            passwordpwd.setEchoChar((char)0);
        }
        else{
            passwordpwd.setEchoChar('*');
        }
    }//GEN-LAST:event_CheckBoxActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        String password = String.valueOf(passwordpwd.getPassword());
        String role = comboSelected.getSelectedItem().toString();
        //int id = Integer.parseInt(useridtxt.getText());

        String username = useridtxt.getText();
        
        switch (role.toLowerCase()) {
            case "administrator":
                loginSystemAdministrator(username, password);
                break;
            case "emergency operation coordinator":
                loginEmergencyOperationCoordinator(username, password);
                break;
            case "resource specialist":
                loginResourceSpecialist(username, password);
                break;
            case "field response coordinator":
                loginFieldResponseCoordinator(username, password);
                break;
            case "damage analyst":
                loginDamageAnalyst(username, password);
                break;
            case "logistics coordinator":
                loginLogisticsCoordinator(username, password);
                break;
            case "hospital manager":
                loginHospitalManager(username, password);
                break;
            case "citizen":
                loginCitizen(username, password);
                break;
            case "volunteer coordinator":
                loginVolunteerCoordinator(username, password);
                break;
            case "response team agent":
                loginResponseTeamAgent(username, password);
                break;
            case "response team coordinator":
                loginResponseTeamCoordinator(username, password);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid role selected!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loginSystemAdministrator(String username, String password) {
        SystemAdmin admin = SystemAdmin.getInstance();
        if (admin.getAdminName().equals(username) && admin.getAdminPassword().equals(password)) {
             SystemAdminJPanel panel = new SystemAdminJPanel();
             workArea.add("SystemAdminJPanel", panel);
             CardLayout layout = (CardLayout) workArea.getLayout();
             layout.next(workArea);
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect credentials for System Administrator", "Warning", JOptionPane.WARNING_MESSAGE);
        } 
    }
    private void loginEmergencyOperationCoordinator(String username, String password) {
        EmergencyOperationCoordinator coordinator = EmergencyOperationCoordinator.findCoordinatorByName(username);

        if (coordinator != null) {

            if (new String(coordinator.getPassword()).equals(password)) {
                EmergencyOperationCoordinatorJPanel panel = new EmergencyOperationCoordinatorJPanel();
                workArea.add("EmergencyOperationCooridnatorJPanel", panel);
                CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect credentials for Emergency Operations Coordinator", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Emergency Operations Coordinator not found", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void loginResourceSpecialist(String username, String password) {
        ResourceSpecialist specialist = ResourceSpecialist.findSpecialistByName(username);
        if (specialist != null) { 
            if(new String(specialist.getPassword()).equals(password)){
                ResourceSpecialistJPanel panel = new ResourceSpecialistJPanel();
                workArea.add("ResourceSpecialistJPanel", panel);
                CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect credentials for Resource Specialist", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    

        private void loginFieldResponseCoordinator(String username, String password) {
        FieldResponseCoordinator coordinator = FieldResponseCoordinator.findCoordinatorByName(username);

        if (coordinator != null) {

            // Compare the hashed password directly
            if (new String(coordinator.getPassword()).equals(password)) {
                // If they match, proceed with login
                FieldResponseCoordinatorJPanel panel = new FieldResponseCoordinatorJPanel();
                workArea.add("FieldResponseCoordinatorJPanel", panel);
                CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);
            } else {
                // If the passwords don't match
                JOptionPane.showMessageDialog(null, "Incorrect credentials for Damage Analyst", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Damage Analyst not found", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }


    

    private void loginDamageAnalyst(String username, String password) {
        DamageAnalyst analyst = DamageAnalyst.findDamageAnalystByName(username);

        if (analyst != null) {

            // Compare the hashed password directly
            if (new String(analyst.getPassword()).equals(password)) {
                // If they match, proceed with login
                DamageAnalystJPanel panel = new DamageAnalystJPanel();
                workArea.add("DamageAnalystJPanel", panel);
                CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);
            } else {
                // If the passwords don't match
                JOptionPane.showMessageDialog(null, "Incorrect credentials for Damage Analyst", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Damage Analyst not found", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
    private void loginLogisticsCoordinator(String username, String password) {
        LogisticsCoordinator coordinator = LogisticsCoordinator.findCoordinatorByName(username);

        if (coordinator != null) {

            if (new String(coordinator.getPassword()).equals(password)) {
                LogisticsCoordinatorJPanel panel = new LogisticsCoordinatorJPanel();
                workArea.add("LogisticsCooridnatorJPanel", panel);
                CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect credentials for Logistic Coordinator", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Damage Analyst not found", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void loginHospitalManager(String username, String password) {
        HospitalManager manager = HospitalManager.findManagerByName(username);
        if (manager != null ) {
            if (new String(manager.getPassword()).equals(password)) {
                HospitalManagerJPanel panel = new HospitalManagerJPanel();
                workArea.add("HospitalManagerJPanel", panel);
                CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect credentials for Hospital Manager", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect credentials for Hospital Manager", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void loginCitizen(String username, String password) {
        Citizen citizen = CitizenDirectory.findCitizenByName(username);
        if (citizen != null) {

            if (new String(citizen.getPassword()).equals(password)) {
                CitizenJPanel panel = new CitizenJPanel(citizen);
                workArea.add("CitizenJPanel", panel);
                CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect credentials for Citizen", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Damage Analyst not found", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void loginVolunteerCoordinator(String username, String password) {
        VolunteerCoordinator coordinator = VolunteerCoordinator.findCoordinatorByName(username);
        if (coordinator != null) {
            if (new String(coordinator.getPassword()).equals(password)) {
                VolunteerCoordinatorJPanel panel = new VolunteerCoordinatorJPanel();
                workArea.add("VolunteerCoordinatorJPanel", panel);
                CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect credentials for Volunteer Coordinator", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            // Navigate to Volunteer Coordinator panel
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect credentials for Volunteer Coordinator", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void loginResponseTeamAgent(String username, String password) {
        ResponseTeamAgent agent = ResponseTeamAgent.findTeamAgentByName(username);
        ArrayList<ResponseTeamAgent> teamAgents = agent.getAllTeamAgents();

        if (agent != null) {

            if (new String(agent.getPassword()).equals(password)) {
                ResponseTeamAgentJPanel panel = new ResponseTeamAgentJPanel(teamAgents);
                workArea.add("ResponseTeamAgentJPanel", panel);
                CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect credentials for Damage Analyst", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Damage Analyst not found", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void loginResponseTeamCoordinator(String username, String password) {
        ResponseTeamCoordinator coordinator = ResponseTeamCoordinator.findCoordinatorByName(username);

        if (coordinator != null) {

            if (new String(coordinator.getPassword()).equals(password)) {
                ResponseTeamCoordinatorJPanel panel = new ResponseTeamCoordinatorJPanel(coordinator);
                workArea.add("ResponseTeamCooridnatorJPanel", panel);
                CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect credentials for Damage Analyst", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Damage Analyst not found", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void comboSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSelectedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSelectedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JComboBox<String> comboSelected;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton loginbtn;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JPasswordField passwordpwd;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JLabel useridlbl;
    private javax.swing.JLabel useridlbl1;
    private javax.swing.JTextField useridtxt;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
