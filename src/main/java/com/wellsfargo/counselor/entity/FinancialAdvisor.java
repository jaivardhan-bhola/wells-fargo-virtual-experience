package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue()
    private long advisorId;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String EmployementStatus;

    @Column(nullable = false)
    private String EmployementStartDate;

    protected FinancialAdvisor() {

    }

    public FinancialAdvisor(String Name, String address, String phone, String email, String EmployementStatus, String EmployementStartDate) {
        this.Name = Name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.EmployementStatus = EmployementStatus;
        this.EmployementStartDate = EmployementStartDate;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String Name() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void getEmployementStatus() {
        return EmployementStatus;
    }
    
    public String setEmployementStatus(String EmployementStatus) {
        this.EmployementStatus = EmployementStatus;
    }

    public void getEmployementStartDate() {
        return EmployementStartDate;
    }

    public String setEmployementStartDate(String EmployementStartDate) {
        this.EmployementStartDate = EmployementStartDate;
    }
}
