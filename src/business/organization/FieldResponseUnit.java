
package business.organization;


import business.role.FieldResponseCoordinator;
import java.util.ArrayList;
import java.util.HashMap;


public class FieldResponseUnit {
    Organization org;
    FieldResponseCoordinator frc;

    public FieldResponseUnit(Organization org, FieldResponseCoordinator frc) {
        this.org = org;
        this.frc = frc;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

    public FieldResponseCoordinator getFrc() {
        return frc;
    }

    public void setFrc(FieldResponseCoordinator frc) {
        this.frc = frc;
    }
    
}