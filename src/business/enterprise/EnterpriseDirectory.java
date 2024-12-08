 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.enterprise;

 /*
 * @author abhis
 */

import business.Network;
import business.organization.Organization;
import java.util.ArrayList;

public class EnterpriseDirectory {
    Network network;
    ArrayList<Enterprise> enterpriselist;
    ArrayList<Organization> orglist;

    public EnterpriseDirectory(Network n) {
        this.network = n;
        this.enterpriselist = new ArrayList<>();
    }
    
    public Enterprise newEnterprise(String type){
        Enterprise ent = new Enterprise(type);
        enterpriselist.add(ent);
        return ent;
    }
    
    public Enterprise findEnterprise(String type){
        for (Enterprise ent : enterpriselist) {
            if (ent.getType().equalsIgnoreCase(type)) {
                return ent;
            }
        }
        return null; 
    }
    
    public void loggedEnterpriseType(String type){
        Enterprise ent = findEnterprise(type);
        ent.setType(type);
    }
    
    public ArrayList<Enterprise> getAllEnter(){
        return enterpriselist;
    }
}
