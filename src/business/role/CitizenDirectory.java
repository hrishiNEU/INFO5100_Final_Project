/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role;

/**
 *
 * @author abhis
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CitizenDirectory {
    private static Map<Integer, Citizen> citizenMap; 
    public CitizenDirectory() {
        this.citizenMap = new HashMap<>();
    }
    
 
    public Citizen newCitizen(int citizenId, String name, char[] password, String type, String phone, String address, String nationality) {
        if (findCitizen(citizenId) != null) {
            throw new IllegalArgumentException("Citizen with this ID already exists.");
        }
        Citizen citizen = new Citizen(citizenId, name, password, type, phone, address, nationality);
        citizenMap.put(citizenId, citizen);
        return citizen;
    }
    
   
    public static Citizen findCitizen(int citizenId) {
        return citizenMap.get(citizenId);
    }
    
    public static Citizen findCitizenByName(String name) {
        for (Citizen citizen : citizenMap.values()) {
        if (citizen.getName().equals(name)) {
            return citizen; // Return the citizen if name matches
        }
      }
    return null;
    }
    

    public ArrayList<Citizen> getAllCitizens() {
        return new ArrayList<>(citizenMap.values());
    }
    

    public void removeCitizen(int citizenId) {
        if (findCitizen(citizenId) == null) {
            throw new IllegalArgumentException("Citizen with this ID not found.");
        }
        citizenMap.remove(citizenId);
    }
    
    public void printAllCitizens() {
        for (Citizen citizen : citizenMap.values()) {
            System.out.println("Citizen ID: " + citizen.getCitizenId() + ", Name: " + citizen.getName() + ", Nationality: " + citizen.getNationality());
        }
    }
}
