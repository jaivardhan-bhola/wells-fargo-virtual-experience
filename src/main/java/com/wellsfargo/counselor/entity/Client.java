package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client{

    @Id
    @GeneratedValue();
    private long clientId;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String EmployementStatus;

    protected Client() {

    }

    public Client(String Name, String email, String phone, String address, String EmployementStatus) {
        this.Name = Name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.EmployementStatus = EmployementStatus;
    }

    public Long getClientId() {
        return clientId;
    }

    public String Name() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getEmployementStatus() {
        return EmployementStatus;
    }

    public void setEmployementStatus(String EmployementStatus) {
        this.EmployementStatus = EmployementStatus;
    }

}