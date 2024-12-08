
package business.organization;

import business.role.DamageAnalyst;

public class DamageAssesmentDepartment {
    Organization org;
    DamageAnalyst da;

    public DamageAssesmentDepartment(Organization org, DamageAnalyst da) {
        this.org = org;
        this.da = da;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

    public DamageAnalyst getDa() {
        return da;
    }

    public void setDa(DamageAnalyst da) {
        this.da = da;
    }
    
}
