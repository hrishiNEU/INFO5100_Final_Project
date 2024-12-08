/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userinterface;

/**
 *
 * @author meera
 */
public class DisasterAlertService {
    private String newdisasterType;
    private String newlocation;
    private String newseverity;
    
    // Set the disaster details
    public void setDisasterAlert(String disasterType, String location, String severity) {
        this.newdisasterType = disasterType;
        this.newlocation = location;
        this.newseverity = severity;
    }
    
    // Getters for the disaster details
    public String getDisasterType() {
        return newdisasterType; 
    }
    
    public String getLocation() {
        return newlocation; 
    }
    
    public String getSeverity() {
        return newseverity; 
    }
}
