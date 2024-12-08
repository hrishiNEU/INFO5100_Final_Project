 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role;

 /*
 * @author abhis
 */
import java.util.ArrayList;

public class ResponseTeamAgent extends Citizen {

    private String assignedArea;
    private String assignedTask;
    

    private static ArrayList<ResponseTeamAgent> teamAgents = new ArrayList<>();

    public ResponseTeamAgent(int citizenId, String name, char[] password, String type, String phone, 
                             String address, String nationality, String assignedArea, 
                             String assignedTask) {
        super(citizenId, name, password, type, phone, address, nationality);
        this.assignedArea = assignedArea;
        this.assignedTask = assignedTask;
        teamAgents.add(this);
    }

    public static ResponseTeamAgent newTeamAgent(int citizenId, String name, char[] password, String type, 
            String phone, String address, String nationality,
            String assignedArea, String assignedTask, String equipment) {
        return new ResponseTeamAgent(citizenId, name, password, type, phone, address, nationality, assignedArea, assignedTask);
    }

    public static ResponseTeamAgent findTeamAgent(int citizenId) {
        for (ResponseTeamAgent agent : teamAgents) {
            if (agent.getCitizenId() == citizenId) {
                return agent;
            }
        }
        return null;
    }

    public static ResponseTeamAgent searchByName(String name) {
        for (ResponseTeamAgent agent : teamAgents) {
            if (agent.getName().equalsIgnoreCase(name)) {
                return agent;  // Return the first match
            }
        }
        return null;  // Return null if no match is found
    }

    public static ArrayList<ResponseTeamAgent> getAllTeamAgents() {
        return teamAgents;
    }

    public String getAssignedArea() {
        return assignedArea;
    }

    public void setAssignedArea(String assignedArea) {
        this.assignedArea = assignedArea;
    }

    public String getAssignedTask() {
        return assignedTask;
    }

    public void setAssignedTask(String assignedTask) {
        this.assignedTask = assignedTask;
    }

    public void performTask() {
        System.out.println("Performing task: " + assignedTask);
    }

    @Override
    public String toString() {
        return "ResponseTeamAgent { "
                + "CitizenId=" + getCitizenId()
                + ", Name='" + getName() + '\''
                + ", Phone='" + getPhone() + '\''
                + ", Address='" + getAddress() + '\''
                + ", Nationality='" + getNationality() + '\''
                + ", TeamRole='" + assignedArea + '\''
                + ", AssignedTask='" + assignedTask + '\''
                + " }";
    }
}
