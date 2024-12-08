 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role;

 /*
 * @author abhis
 */
import business.enterprise.Enterprise;
import business.organization.Organization;
import java.util.ArrayList;

public class SystemAdmin {
    private static SystemAdmin instance; 
    private String adminName;
    private String adminPassword;
    
    public SystemAdmin(String adminName, String adminPassword) {
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }
    
    public static SystemAdmin getInstance() {
        if (instance == null) {
          
            instance = new SystemAdmin("admin", "admin123");
        }
        return instance;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public void addEnterprise(ArrayList<Enterprise> enterprises, Enterprise enterprise) {
        enterprises.add(enterprise);
        System.out.println("Enterprise " + enterprise.getType() + " has been added.");
    }

    public void removeEnterprise(ArrayList<Enterprise> enterprises, Enterprise enterprise) {
        if (enterprises.contains(enterprise)) {
            enterprises.remove(enterprise);
            System.out.println("Enterprise " + enterprise.getType() + " has been removed.");
        } else {
            System.out.println("Enterprise not found.");
        }
    }

    public void addOrganization(Enterprise enterprise, Organization organization) {
        enterprise.addOrg(organization);
        System.out.println("Organization " + organization.getName() + " has been added to the enterprise.");
    }

    public void removeOrganization(Enterprise enterprise, Organization organization) {
        ArrayList<Organization> orgList = enterprise.getOrglist();
        if (orgList.contains(organization)) {
            orgList.remove(organization);
            System.out.println("Organization " + organization.getName() + " has been removed from the enterprise.");
        } else {
            System.out.println("Organization not found in the enterprise.");
        }
    }
}
