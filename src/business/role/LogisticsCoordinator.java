 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role;

 /*
 * @author abhis
 */
import java.util.ArrayList;

public class LogisticsCoordinator extends Citizen {
    
    private int inventoryId;
    private String[] inventoryItems;
    private String[] resourceRequests;
    private int fooditems;
    private int medicalsupplies;
    private static ArrayList<LogisticsCoordinator> coordinators = new ArrayList<>();

    public LogisticsCoordinator(int citizenId, String name, char[] password, String type, 
                                String phone, String address, String nationality, int inventoryId) {
        super(citizenId, name, password, type, phone, address, nationality);
        this.inventoryId = inventoryId;
        this.inventoryItems = new String[10];
        this.resourceRequests = new String[10];
        coordinators.add(this);
    }

    public static LogisticsCoordinator newCoordinator(int citizenId, String name, char[] password, String type, 
                                                       String phone, String address, String nationality, int inventoryId) {
        return new LogisticsCoordinator(citizenId, name, password, type, phone, address, nationality, inventoryId);
    }

    public static LogisticsCoordinator findCoordinator(int citizenId) {
        for (LogisticsCoordinator coordinator : coordinators) {
            if (coordinator.getCitizenId() == citizenId) {
                return coordinator;
            }
        }
        return null;
    }

    public static ArrayList<LogisticsCoordinator> getAllCoordinators() {
        return coordinators;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }
    
    
    public int getFooditems() {
        return fooditems;
    }

    public void setFooditems(int fooditems) {
        this.fooditems = fooditems;
    }

    public void addItemToInventory(String item) {
        for (int i = 0; i < inventoryItems.length; i++) {
            if (inventoryItems[i] == null) {
                inventoryItems[i] = item;
                System.out.println("Item added to inventory: " + item);
                return;
            }
        }
        System.out.println("Inventory is full. Unable to add item.");
    }

    
    public String[] getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(String[] inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    public int getMedicalsupplies() {
        return medicalsupplies;
    }

    public void setMedicalsupplies(int medicalsupplies) {
        this.medicalsupplies = medicalsupplies;
    }
    public void removeItemFromInventory(String item) {
        for (int i = 0; i < inventoryItems.length; i++) {
            if (inventoryItems[i] != null && inventoryItems[i].equals(item)) {
                inventoryItems[i] = null;
                System.out.println("Item removed from inventory: " + item);
                return;
            }
        }
        System.out.println("Item not found in inventory.");
    }

    public void displayInventory() {
        System.out.println("Current Inventory:");
        for (String item : inventoryItems) {
            if (item != null) {
                System.out.println("- " + item);
            }
        }
    }

    public void receiveResourceRequest(String request) {
        for (int i = 0; i < resourceRequests.length; i++) {
            if (resourceRequests[i] == null) {
                resourceRequests[i] = request;
                System.out.println("Resource request received: " + request);
                return;
            }
        }
        System.out.println("Request queue is full. Unable to process the request.");
    }

    public void displayResourceRequests() {
        System.out.println("Current Resource Requests:");
        for (String request : resourceRequests) {
            if (request != null) {
                System.out.println("- " + request);
            }
        }
    }

    public void giveInfoToResourceSpecialist(ResourceSpecialist specialist,int fooditems, int medicalsupplies) {
        this.fooditems = fooditems;
        this.medicalsupplies = medicalsupplies;
    }

    @Override
    public String toString() {
        return "LogisticsCoordinator { " +
               "CitizenId=" + getCitizenId() +
               ", Name='" + getName() + '\'' +
               ", Phone='" + getPhone() + '\'' +
               ", Address='" + getAddress() + '\'' +
               ", Nationality='" + getNationality() + '\'' +
               ", InventoryId=" + inventoryId +
               " }";
    }
}
