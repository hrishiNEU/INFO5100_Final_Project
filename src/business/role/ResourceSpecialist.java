 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role;

 /*
 * @author abhis
 */
import java.util.ArrayList;

public class ResourceSpecialist extends Citizen {

    private double availableFunds;
    private String[] inventoryInfo;
    private String[] fundRequests;
    private String fundsApprovedByCoordinator;
    private double approvedFundsValue;
    private boolean approvalStatus;

    private static ArrayList<ResourceSpecialist> specialists = new ArrayList<>();

    public ResourceSpecialist(int citizenId, String name, char[] password, String type, 
                              String phone, String address, String nationality, double availableFunds) {
        super(citizenId, name, password, type, phone, address, nationality);
        this.availableFunds = availableFunds;
        this.inventoryInfo = new String[10];
        this.fundRequests = new String[10];
        specialists.add(this);
    }

    public static ResourceSpecialist newSpecialist(int citizenId, String name, char[] password, String type, 
                                                   String phone, String address, String nationality, double availableFunds) {
        return new ResourceSpecialist(citizenId, name, password, type, phone, address, nationality, availableFunds);
    }

    public static ResourceSpecialist findSpecialist(int citizenId) {
        for (ResourceSpecialist specialist : specialists) {
            if (specialist.getCitizenId() == citizenId) {
                return specialist;
            }
        }
        return null;
    }
    
    public static ResourceSpecialist findSpecialistByName(String name) {
        for (ResourceSpecialist specialist : specialists) {
            if (specialist.getName().equals(name)) {
                return specialist;
            }
        }
        return null;
    }

    public static ArrayList<ResourceSpecialist> getAllSpecialists() {
        return specialists;
    }

    public double getAvailableFunds() {
        return availableFunds;
    }

    public void setAvailableFunds(double availableFunds) {
        this.availableFunds = availableFunds;
    }

    public void receiveInventoryInfo(String[] inventoryItems) {
        this.inventoryInfo = inventoryItems;
        System.out.println("Inventory info received:");
        for (String item : inventoryItems) {
            if (item != null) {
                System.out.println("- " + item);
            }
        }
    }

    public void checkFunds(double requiredFunds) {
        if (availableFunds < requiredFunds) {
            System.out.println("Insufficient funds. Making a request for additional funds.");
            requestFunds(requiredFunds - availableFunds);
        } else {
            System.out.println("Funds are sufficient.");
        }
    }

    public void requestFunds(double neededFunds) {
        for (int i = 0; i < fundRequests.length; i++) {
            if (fundRequests[i] == null) {
                fundRequests[i] = "Requesting " + neededFunds + " funds.";
                System.out.println("Fund request made: " + fundRequests[i]);
                return;
            }
        }
        System.out.println("Request queue is full. Unable to make fund request.");
    }
    
     public String getFundsApprovedByCoordinator() {
        return fundsApprovedByCoordinator;
    }

    public void setFundsApprovedByCoordinator(String fundsApprovedByCoordinator) {
        this.fundsApprovedByCoordinator = fundsApprovedByCoordinator;
    }

    public double getApprovedFundsValue() {
        return approvedFundsValue;
    }

    public void setApprovedFundsValue(double approvedFundsValue) {
        this.approvedFundsValue = approvedFundsValue;
    }

    public boolean isApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(boolean approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public void makeRequestToFieldResponseCoordinator(FieldResponseCoordinator coordinator,String ResourceSpecialist,String Items,double neededFunds) {
       coordinator.setFundsNeeded(neededFunds);
       coordinator.setItems(Items);
       coordinator.setRequestMadeBy(ResourceSpecialist);
    }
    
    
    public void fundsApprovedBy(FieldResponseCoordinator coordinator, double approvedFunds, boolean isApproved) {
        this.fundsApprovedByCoordinator = coordinator.getName();
        this.approvedFundsValue = approvedFunds;
        this.approvalStatus = isApproved;

        if (isApproved) {
            if (this.availableFunds <= approvedFunds) {
                this.availableFunds += approvedFunds;
                System.out.println("Funds approved successfully.");
            } 
        } else {
            System.out.println("Funds not approved.");
        }
    }



    @Override
    public String toString() {
        return "ResourceSpecialist { " +
               "CitizenId=" + getCitizenId() +
               ", Name='" + getName() + '\'' +
               ", Phone='" + getPhone() + '\'' +
               ", Address='" + getAddress() + '\'' +
               ", Nationality='" + getNationality() + '\'' +
               ", AvailableFunds=" + availableFunds +
               " }";
    }
}
