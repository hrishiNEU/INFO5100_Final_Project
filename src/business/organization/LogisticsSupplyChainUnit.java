
package business.organization;

import business.role.LogisticsCoordinator;


public class LogisticsSupplyChainUnit {
    Organization org;
    LogisticsCoordinator loc;

    public LogisticsSupplyChainUnit(Organization org, LogisticsCoordinator loc) {
        this.org = org;
        this.loc = loc;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

    public LogisticsCoordinator getLoc() {
        return loc;
    }

    public void setLoc(LogisticsCoordinator loc) {
        this.loc = loc;
    }
}


