 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role;

 /*
 * @author abhis
 */
import java.util.ArrayList;

public class EmergencyOperationCoordinator extends Citizen {

    private String responsibilityArea;
    private String communicationSystem;
    private int yearsOfExperience;
    private String alert;

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    private static ArrayList<EmergencyOperationCoordinator> coordinators = new ArrayList<>();

    public EmergencyOperationCoordinator(int citizenId, String name, char[] password, String type, String phone,
                                         String address, String nationality, String responsibilityArea,
                                         String communicationSystem, int yearsOfExperience) {
        super(citizenId, name, password, type, phone, address, nationality);
        this.responsibilityArea = responsibilityArea;
        this.communicationSystem = communicationSystem;
        this.yearsOfExperience = yearsOfExperience;
        coordinators.add(this);
    }

    public static EmergencyOperationCoordinator newCoordinator(int citizenId, String name, char[] password, String type, String phone,
                                                                String address, String nationality, String responsibilityArea,
                                                                String communicationSystem, int yearsOfExperience) {
        return new EmergencyOperationCoordinator(citizenId, name, password, type, phone, address, nationality, responsibilityArea,
                                                 communicationSystem, yearsOfExperience);
    }

    public static EmergencyOperationCoordinator findCoordinator(int citizenId) {
        for (EmergencyOperationCoordinator coordinator : coordinators) {
            if (coordinator.getCitizenId() == citizenId) {
                return coordinator;
            }
        }
        return null;
    }
    
    public static EmergencyOperationCoordinator findCoordinatorByName(String name) {
        for (EmergencyOperationCoordinator coordinator : coordinators) {
            if (coordinator.getName().equals(name)) {
                return coordinator;
            }
        }
        return null;
    }

    public static ArrayList<EmergencyOperationCoordinator> getAllCoordinators() {
        return coordinators;
    }

    public String getResponsibilityArea() {
        return responsibilityArea;
    }

    public void setResponsibilityArea(String responsibilityArea) {
        this.responsibilityArea = responsibilityArea;
    }

    public String getCommunicationSystem() {
        return communicationSystem;
    }

    public void setCommunicationSystem(String communicationSystem) {
        this.communicationSystem = communicationSystem;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void monitorCalamity(String calamityType, String location) {
        System.out.println("Monitoring calamity type: " + calamityType + " at location: " + location);
    }

    @Override
    public String toString() {
        return "EmergencyOperationCoordinator { " +
               "CitizenId=" + getCitizenId() +
               ", Name='" + getName() + '\'' +
               ", Phone='" + getPhone() + '\'' +
               ", Address='" + getAddress() + '\'' +
               ", Nationality='" + getNationality() + '\'' +
               ", ResponsibilityArea='" + responsibilityArea + '\'' +
               ", CommunicationSystem='" + communicationSystem + '\'' +
               ", YearsOfExperience=" + yearsOfExperience +
               " }";
    }
}
