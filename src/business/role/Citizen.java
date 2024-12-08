 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role;

import business.Network;

 /*
 * @author abhis
 */
public class Citizen {
    
    public int citizenId;  
    public String name;
    public char[] password;
    public String type;  
    public String phone;
    public String address;  
    public String nationality; 
    public Network network;

    public Citizen(int citizenId, String name, char[] password, String type, String phone, String address, String nationality) {
        this.citizenId = citizenId;
        this.name = name;
        this.password= password;
        this.type = type;
        this.phone = phone;
        this.address = address;
        this.nationality = nationality;
    }

    public int getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(int citizenId) {
        this.citizenId = citizenId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
}
