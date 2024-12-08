package business.role;


import java.util.ArrayList;

public class FieldResponseCoordinator extends Citizen {

    private String assignedRegion;
    private int numberOfTeams;
    private String communicationSystem;
    private String latestCalamity; 
    private double latestDamageExtent;
    private String items;
    private double fundsNeeded;
    private String requestMadeBy;
    private double funds;
    private String area;

    private static ArrayList<FieldResponseCoordinator> coordinators = new ArrayList<>();

    public FieldResponseCoordinator(int citizenId, String name, char[] password, String type, String phone,
                                    String address, String nationality, String assignedRegion,
                                    int numberOfTeams, String communicationSystem) {
        super(citizenId, name, password, type, phone, address, nationality);
        this.assignedRegion = assignedRegion;
        this.numberOfTeams = numberOfTeams;
        this.communicationSystem = communicationSystem;
        coordinators.add(this);
    }

    public static FieldResponseCoordinator newCoordinator(int citizenId, String name, char[] password, String type, String phone,
                                                           String address, String nationality, String assignedRegion,
                                                           int numberOfTeams, String communicationSystem) {
        return new FieldResponseCoordinator(citizenId, name, password, type, phone, address, nationality, assignedRegion,
                                            numberOfTeams, communicationSystem);
    }

    public static FieldResponseCoordinator findCoordinator(int citizenId) {
        for (FieldResponseCoordinator coordinator : coordinators) {
            if (coordinator.getCitizenId() == citizenId) {
                return coordinator;
            }
        }
        return null;
    }
    
        public static FieldResponseCoordinator findCoordinatorByName(String name) {
        for (FieldResponseCoordinator coordinator : coordinators) {
            if (coordinator.getName().equals(name)) {
                return coordinator;
            }
        }
        return null;
    }

    public static ArrayList<FieldResponseCoordinator> getAllCoordinators() {
        return coordinators;
    }

    public String getAssignedRegion() {
        return assignedRegion;
    }

    public void setAssignedRegion(String assignedRegion) {
        this.assignedRegion = assignedRegion;
    }

    public int getNumberOfTeams() {
        return numberOfTeams;
    }

    public void setNumberOfTeams(int numberOfTeams) {
        this.numberOfTeams = numberOfTeams;
    }

    public String getCommunicationSystem() {
        return communicationSystem;
    }

    public void setCommunicationSystem(String communicationSystem) {
        this.communicationSystem = communicationSystem;
    }
    
    public String getLatestCalamity() {
        return latestCalamity;
    }

    public double getLatestDamageExtent() {
        return latestDamageExtent;
    }
    
    public void setLatestCalamity(String latestCalamity) {
        this.latestCalamity = latestCalamity;
    }

    public void setLatestDamageExtent(double latestDamageExtent) {
        this.latestDamageExtent = latestDamageExtent;
    }
      
    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }
   
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getFundsNeeded() {
        return fundsNeeded;
    }

    public void setFundsNeeded(double fundsNeeded) {
        this.fundsNeeded = fundsNeeded;
    }        

    public void allocateFunds(String fundDetails) {
        System.out.println("Allocating funds: " + fundDetails);
    }
 
    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public String getRequestMadeBy() {
        return requestMadeBy;
    }

    public void setRequestMadeBy(String requestMadeBy) {
        this.requestMadeBy = requestMadeBy;
    }

    public void receiveFundRequest(String[] fundRequests) {
        System.out.println("Received fund requests:");
        for (String request : fundRequests) {
            if (request != null) {
                System.out.println("- " + request);
            }
        }
    }
    
    @Override
    public String toString() {
        return "FieldResponseCoordinator { " +
               "CitizenId=" + getCitizenId() +
               ", Name='" + getName() + '\'' +
               ", Phone='" + getPhone() + '\'' +
               ", Address='" + getAddress() + '\'' +
               ", Nationality='" + getNationality() + '\'' +
               ", AssignedRegion='" + assignedRegion + '\'' +
               ", NumberOfTeams=" + numberOfTeams +
               ", CommunicationSystem='" + communicationSystem + '\'' +
               " }";
    }
}


