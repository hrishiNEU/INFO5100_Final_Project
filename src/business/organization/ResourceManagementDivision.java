
package business.organization;

import business.role.ResourceSpecialist;


public class ResourceManagementDivision {
    Organization org;
    ResourceSpecialist rs;

    public ResourceManagementDivision(Organization org, ResourceSpecialist rs) {
        this.org = org;
        this.rs = rs;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

    public ResourceSpecialist getRs() {
        return rs;
    }

    public void setRs(ResourceSpecialist rs) {
        this.rs = rs;
    }
}



