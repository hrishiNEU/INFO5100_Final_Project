
package business.organization;


import business.role.EmergencyOperationCoordinator;

   
public class EmergencyOperationsCenter {
    Organization org;
    EmergencyOperationCoordinator eoc;

    public EmergencyOperationsCenter(Organization org, EmergencyOperationCoordinator eoc) {
        this.org = org;
        this.eoc = eoc;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

    public EmergencyOperationCoordinator getEoc() {
        return eoc;
    }

    public void setEoc(EmergencyOperationCoordinator eoc) {
        this.eoc = eoc;
    }
    
}

