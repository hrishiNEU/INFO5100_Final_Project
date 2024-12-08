 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role;

 /*
 * @author abhis
 */
import java.util.ArrayList;

public class ResponseTeamCoordinator extends Citizen {

    private String responseStrategy;
    private ArrayList<ResponseTeamAgent> teamAgents;
    private String teamDeploymentArea;

    private static ArrayList<ResponseTeamCoordinator> coordinators = new ArrayList<>();

    public ResponseTeamCoordinator(int citizenId, String name, char[] password, String type, String phone, 
                                   String address, String nationality, String responseStrategy, 
                                   ArrayList<ResponseTeamAgent> teamAgents, String teamDeploymentArea) {
        super(citizenId, name, password, type, phone, address, nationality);
        this.responseStrategy = responseStrategy;
        this.teamAgents = teamAgents != null ? teamAgents : new ArrayList<>();
        this.teamDeploymentArea = teamDeploymentArea;
        coordinators.add(this);
    }

    public static ResponseTeamCoordinator newCoordinator(int citizenId, String name, char[] password, String type, 
                                                      String phone, String address, String nationality, 
                                                      String responseStrategy, ArrayList<ResponseTeamAgent> teamAgents, 
                                                      String teamDeploymentArea) {
    return new ResponseTeamCoordinator(citizenId, name, password, type, phone, address, nationality, 
                                       responseStrategy, teamAgents, teamDeploymentArea);
}


    public static ResponseTeamCoordinator findCoordinator(int citizenId) {
        for (ResponseTeamCoordinator coordinator : coordinators) {
            if (coordinator.getCitizenId() == citizenId) {
                return coordinator;
            }
        }
        return null;
    }

    public static ArrayList<ResponseTeamCoordinator> getAllCoordinators() {
        return coordinators;
    }

    public String getResponseStrategy() {
        return responseStrategy;
    }

    public void setResponseStrategy(String responseStrategy) {
        this.responseStrategy = responseStrategy;
    }

    public String getTeamDeploymentArea() {
        return teamDeploymentArea;
    }

    public void setTeamDeploymentArea(String teamDeploymentArea) {
        this.teamDeploymentArea = teamDeploymentArea;
    }

    public void makeDeploymentDecision() {
        System.out.println("Making deployment decision based on strategy: " + responseStrategy + 
                           " for teams in area: " + teamDeploymentArea);
    }
    
    
    public ArrayList<ResponseTeamAgent> getTeamAgents() {
        return teamAgents;
    }

    public void setTeamAgents(ArrayList<ResponseTeamAgent> teamAgents) {
        this.teamAgents = teamAgents;
    }

    @Override
    public String toString() {
        return "ResponseTeamCoordinator { " +
               "CitizenId=" + getCitizenId() +
               ", Name='" + getName() + '\'' +
               ", Phone='" + getPhone() + '\'' +
               ", Address='" + getAddress() + '\'' +
               ", Nationality='" + getNationality() + '\'' +
               ", ResponseStrategy='" + responseStrategy + '\'' +
               ", teamOfAgents=" + teamAgents +
               ", TeamDeploymentArea='" + teamDeploymentArea + '\'' +
               " }";
    }
}
