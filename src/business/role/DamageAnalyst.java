 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role;

 /*
 * @author abhis
 */
import java.util.ArrayList;

public class DamageAnalyst extends Citizen {

    private String expertiseArea;
    private String certification;
    private int yearsOfExperience;

    private static ArrayList<DamageAnalyst> damageAnalysts = new ArrayList<>();

    public DamageAnalyst(int citizenId, String name, char[] password, String type, String phone,
                         String address, String nationality, String expertiseArea,
                         String certification, int yearsOfExperience) {
        super(citizenId, name, password, type, phone, address, nationality);
        this.expertiseArea = expertiseArea;
        this.certification = certification;
        this.yearsOfExperience = yearsOfExperience;
        damageAnalysts.add(this);
    }

    public static DamageAnalyst newDamageAnalyst(int citizenId, String name, char[] password, String type, String phone,
                                                 String address, String nationality, String expertiseArea,
                                                 String certification, int yearsOfExperience) {
        return new DamageAnalyst(citizenId, name, password, type, phone, address, nationality, expertiseArea,
                                 certification, yearsOfExperience);
    }

    public static DamageAnalyst findDamageAnalyst(int citizenId) {
        for (DamageAnalyst da : damageAnalysts) {
            if (da.getCitizenId() == citizenId) {
                return da;
            }
        }
        return null;
    }
    
    public static DamageAnalyst findDamageAnalystByName(String username){
        for (DamageAnalyst da : damageAnalysts) {
            if (da.getName().equalsIgnoreCase(username)) {
                return da;
            }
        }
        return null;
    }

    public static ArrayList<DamageAnalyst> getAllDamageAnalysts() {
        return damageAnalysts;
    }

    public String getExpertiseArea() {
        return expertiseArea;
    }

    public void setExpertiseArea(String expertiseArea) {
        this.expertiseArea = expertiseArea;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void assessDamage(String calamityType, double damageExtent) {
        System.out.println("Assessing damage for calamity type: " + calamityType);
        System.out.println("Damage extent: " + damageExtent + " units");
    }
    
    public void sendDamageReport(FieldResponseCoordinator coordinator, String calamityType, double damageExtent, String area) {
        String damageReport = "Calamity Type: " + calamityType + "\n" +
                              "Damage Extent: " + damageExtent + " units\n" +
                              "Assessed by Damage Analyst: " + getName() + " (" + getCitizenId() + ")";
        
        coordinator.setLatestCalamity(calamityType);
        coordinator.setLatestDamageExtent(damageExtent);
        coordinator.setArea(area);
    }

    @Override
    public String toString() {
        return "DamageAnalyst { " +
               "CitizenId=" + getCitizenId() +
               ", Name='" + getName() + '\'' +
               ", Phone='" + getPhone() + '\'' +
               ", Address='" + getAddress() + '\'' +
               ", Nationality='" + getNationality() + '\'' +
               ", ExpertiseArea='" + expertiseArea + '\'' +
               ", Certification='" + certification + '\'' +
               ", YearsOfExperience=" + yearsOfExperience +
               " }";
    }
}
