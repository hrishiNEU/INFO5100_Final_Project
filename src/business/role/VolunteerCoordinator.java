 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role;

 /*
 * @author abhis
 */import java.util.ArrayList;

public class VolunteerCoordinator extends Citizen {

    private String volunteerTeam;
    private int teamSize;
    private String operationArea;
    private ArrayList<Citizen> volunteers; // List of volunteers managed by the coordinator

    private static ArrayList<VolunteerCoordinator> coordinators = new ArrayList<>();

    public VolunteerCoordinator(int citizenId, String name, char[] password, String type, String phone, 
                                String address, String nationality, String volunteerTeam, 
                                int teamSize, String operationArea) {
        super(citizenId, name, password, type, phone, address, nationality);
        this.volunteerTeam = volunteerTeam;
        this.teamSize = teamSize;
        this.operationArea = operationArea;
        this.volunteers = new ArrayList<>(); // Initialize the volunteers list
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

    public static VolunteerCoordinator findCoordinatorByName(String name) {
        for (VolunteerCoordinator coordinator : coordinators) {
            if (coordinator.getName().equals(name)) {
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

    // Methods for managing volunteers
    public void addVolunteer(Citizen volunteer) {
        this.volunteers.add(volunteer);
        System.out.println("Volunteer added: " + volunteer.getName());
    }

    public boolean removeVolunteer(int volunteerId) {
        for (Citizen volunteer : volunteers) {
            if (volunteer.getCitizenId() == volunteerId) {
                volunteers.remove(volunteer);
                System.out.println("Volunteer removed: " + volunteer.getName());
                return true;
            }
        }
        System.out.println("Volunteer with ID " + volunteerId + " not found.");
        return false;
    }

    public Citizen findVolunteer(int volunteerId) {
        for (Citizen volunteer : volunteers) {
            if (volunteer.getCitizenId() == volunteerId) {
                return volunteer;
            }
        }
        System.out.println("Volunteer with ID " + volunteerId + " not found.");
        return null;
    }

    public ArrayList<Citizen> getAllVolunteers() {
        return new ArrayList<>(volunteers); // Return a copy to avoid direct modifications
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
               ", Volunteers=" + volunteers.size() + // Show number of volunteers
               " }";
    }
}
