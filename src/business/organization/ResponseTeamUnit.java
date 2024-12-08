
package business.organization;

import business.role.ResponseTeamAgent;
import business.role.ResponseTeamCoordinator;

public class ResponseTeamUnit {
    Organization org;
    ResponseTeamCoordinator rtc;
    ResponseTeamAgent rta;

    public ResponseTeamUnit (Organization org, ResponseTeamCoordinator rtc, ResponseTeamAgent rta) {
        this.org = org;
        this.rtc = rtc;
        this.rta = rta;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }
    
    public ResponseTeamCoordinator getRtc() {
        return rtc;
    }
    
    public void setRtc(ResponseTeamCoordinator rtc){
        this.rtc = rtc;
    }

    public ResponseTeamAgent getRta() {
        return rta;
    }

    public void setRta(ResponseTeamAgent rta) {
        this.rta = rta;
    }
}

