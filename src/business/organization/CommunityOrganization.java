
package business.organization;


import business.role.Citizen;
import business.role.VolunteerCoordinator;


   
public class CommunityOrganization {
    Organization org;
    VolunteerCoordinator vc;
    Citizen c;

    public CommunityOrganization(Organization org, VolunteerCoordinator vc, Citizen c) {
        this.org = org;
        this.vc = vc;
        this.c= c;
    }

    public Organization getOrg() {
        return org;
    }

    
    public void setOrg(Organization org) {
        this.org = org;
    }

    public VolunteerCoordinator getVc() {
        return vc;
    }

    public void setVc(VolunteerCoordinator vc) {
        this.vc = vc;
    }
    
    public Citizen getC() {
        return c;
    }

    public void setC(Citizen c) {
        this.c = c;
    }
}
