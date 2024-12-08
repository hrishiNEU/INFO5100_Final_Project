
package business;

import business.enterprise.Enterprise;
import business.enterprise.EnterpriseDirectory;
import business.organization.Organization;
import business.organization.OrganizationDirectory;
import business.role.CitizenDirectory;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class Network {

    
    private String networkname;
    private OrganizationDirectory organizationdirectory;
    private EnterpriseDirectory enterprisedirectory;
    private Enterprise enterprise;
    private Organization organization;
    private CitizenDirectory citizendirectory;
    
    
    public Network(String n){
        this.networkname = n;
        enterprisedirectory = new EnterpriseDirectory(this);
    }

    public String getNetworkname() {
        return networkname;
    }

    public void setNetworkname(String networkname) {
        this.networkname = networkname;
    }

    public EnterpriseDirectory getEnterprisedirectory() {
        return enterprisedirectory;
    }

    public void setEnterprisedirectory(EnterpriseDirectory enterprisedirectory) {
        this.enterprisedirectory = enterprisedirectory;
    }

    public OrganizationDirectory getOrganizationdirectory() {
        return organizationdirectory;
    }

    public void setOrganizationdirectory(OrganizationDirectory organizationdirectory) {
        this.organizationdirectory = organizationdirectory;
    }
    
    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
    
    
    public CitizenDirectory getCitizendirectory() {
        return citizendirectory;
    }

    public void setCitizendirectory(CitizenDirectory citizendirectory) {
        this.citizendirectory = citizendirectory;
    }
    
    
    
    public char[] hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));

            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString().toCharArray();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public char[] hashPassword(char[] charpassword) {
        try {
            String password = String.valueOf(charpassword);
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));


            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString().toCharArray();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

}

