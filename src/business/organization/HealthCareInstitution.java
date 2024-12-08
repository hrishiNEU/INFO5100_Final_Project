
package business.organization;

import business.role.HospitalManager;


public class HealthCareInstitution {
    Organization org;
    HospitalManager hos;

    public HealthCareInstitution(Organization org, HospitalManager hos) {
        this.org = org;
        this.hos = hos;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

    public HospitalManager getHos() {
        return hos;
    }

    public void setHos(HospitalManager hos) {
        this.hos = hos;
    }
    
}