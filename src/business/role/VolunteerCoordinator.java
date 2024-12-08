 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role;

 /*
 * @author abhis
 */
import java.util.ArrayList;

public class VolunteerCoordinator extends Citizen {

    private String volunteerTeam;
    private int teamSize;
    private String operationArea;

    private static ArrayList<VolunteerCoordinator> coordinators = new ArrayList<>();

    public VolunteerCoordinator(int citizenId, String name, char[] password, String type, String phone, 
                                String address, String nationality, String volunteerTeam, 
                                int teamSize, String operationArea) {
        super(citizenId, name, password, type, phone, address, nationality);
        this.volunteerTeam = volunteerTeam;
        this.teamSize = teamSize;
        this.operationArea = operationArea;
        coordinators.add(this);
    }

    public static VolunteerCoordinator newCoordinator(int citizenId, String name, char[] password, String type, 
                                                       String phone, String address, String nationality, 
                                                       String volunteerTeam, int teamSize, String operationArea) {
        return new VolunteerCoordinator(citizenId, name, password, type, phone, address, nationality, 
                                        volunteerTeam, teamSize, operationArea);
    }

    public static VolunteerCoordinator findCoordinator(int citizenId) {
        for (VolunteerCoordinator coordinator : coordinators) {
            if (coordinator.getCitizenId() == citizenId) {
                return coordinator;
            }
        }
        return null;
    }

    public static ArrayList<VolunteerCoordinator> getAllCoordinators() {
        return coordinators;
    }

    public String getVolunteerTeam() {
        return volunteerTeam;
    }

    public void setVolunteerTeam(String volunteerTeam) {
        this.volunteerTeam = volunteerTeam;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public String getOperationArea() {
        return operationArea;
    }

    public void setOperationArea(String operationArea) {
        this.operationArea = operationArea;
    }

    public void coordinateVolunteerEfforts() {
        System.out.println("Coordinating volunteer efforts for team: " + volunteerTeam + " in area: " + operationArea);
    }

    @Override
    public String toString() {
        return "VolunteerCoordinator { " +
               "CitizenId=" + getCitizenId() +
               ", Name='" + getName() + '\'' +
               ", Phone='" + getPhone() + '\'' +
               ", Address='" + getAddress() + '\'' +
               ", Nationality='" + getNationality() + '\'' +
               ", VolunteerTeam='" + volunteerTeam + '\'' +
               ", TeamSize=" + teamSize +
               ", OperationArea='" + operationArea + '\'' +
               " }";
    }
}
