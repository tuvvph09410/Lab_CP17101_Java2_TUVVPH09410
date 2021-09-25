/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author vuvantu
 */
public class Staff {
    private String staffID;
    private String fullName;
    private String country;
    private String gender;
    private String status;
    private String notes;

    public Staff() {
    }

    public Staff(String staffID, String fullName, String country, String gender, String status, String notes) {
        this.staffID = staffID;
        this.fullName = fullName;
        this.country = country;
        this.gender = gender;
        this.status = status;
        this.notes = notes;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStaffID() {
        return staffID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCountry() {
        return country;
    }

    public String getGender() {
        return gender;
    }

    public String getStatus() {
        return status;
    }

    public String getNotes() {
        return notes;
    }
    
}
