 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role;

import java.util.ArrayList;

public class HospitalManager extends Citizen {

    private String managedHospital;
    private int numberOfStaff;
    private String hospitalPolicy;

    private static ArrayList<HospitalManager> managers = new ArrayList<>();

    public HospitalManager(int citizenId, String name, char[] password, String type, String phone,
                           String address, String nationality, String managedHospital,
                           int numberOfStaff, String hospitalPolicy) {
        super(citizenId, name, password, type, phone, address, nationality);
        this.managedHospital = managedHospital;
        this.numberOfStaff = numberOfStaff;
        this.hospitalPolicy = hospitalPolicy;
        managers.add(this);
    }

    public static HospitalManager newManager(int citizenId, String name, char[] password, String type, String phone,
                                             String address, String nationality, String managedHospital,
                                             int numberOfStaff, String hospitalPolicy) {
        return new HospitalManager(citizenId, name, password, type, phone, address, nationality, managedHospital,
                                  numberOfStaff, hospitalPolicy);
    }

    public static HospitalManager findManager(int citizenId) {
        for (HospitalManager manager : managers) {
            if (manager.getCitizenId() == citizenId) {
                return manager;
            }
        }
        return null;
    }

    public static ArrayList<HospitalManager> getAllManagers() {
        return managers;
    }

    public String getManagedHospital() {
        return managedHospital;
    }

    public void setManagedHospital(String managedHospital) {
        this.managedHospital = managedHospital;
    }

    public int getNumberOfStaff() {
        return numberOfStaff;
    }

    public void setNumberOfStaff(int numberOfStaff) {
        this.numberOfStaff = numberOfStaff;
    }

    public String getHospitalPolicy() {
        return hospitalPolicy;
    }

    public void setHospitalPolicy(String hospitalPolicy) {
        this.hospitalPolicy = hospitalPolicy;
    }

    public void admitPatientToHospital(Citizen patient) {
        System.out.println("Admitting patient: " + patient.getName() + " to the hospital managed by " + managedHospital);
    }

    @Override
    public String toString() {
        return "HospitalManager { " +
               "CitizenId=" + getCitizenId() +
               ", Name='" + getName() + '\'' +
               ", Phone='" + getPhone() + '\'' +
               ", Address='" + getAddress() + '\'' +
               ", Nationality='" + getNationality() + '\'' +
               ", ManagedHospital='" + managedHospital + '\'' +
               ", NumberOfStaff=" + numberOfStaff +
               ", HospitalPolicy='" + hospitalPolicy + '\'' +
               " }";
    }
}
