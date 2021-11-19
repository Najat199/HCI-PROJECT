/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hci;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Win 8.1
 */
public class People {
    private String SSN;
    private String Fname;
    private String Lname;
    private Date birthDate;
    private String email;
    private String passward;
    private ArrayList <Item>grantedItems = new ArrayList();

    public People() {
    }
    
    

    public People(String SSN, String Fname, String Lname, Date birthDate, String email, String passward) {
        this.SSN = SSN;
        this.Fname = Fname;
        this.Lname = Lname;
        this.birthDate = birthDate;
        this.email = email;
        this.passward = passward;
    }
    
    
    public void addGrantItem(Item item){
        grantedItems.add(item);
        
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }
    
      
}
