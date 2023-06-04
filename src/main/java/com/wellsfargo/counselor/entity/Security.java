package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class security{

    @Id
    @GeneratedValue();
    private long securityId;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private String purchasePrice;

    @Column(nullable = false)
    private String quantity;

    protected security() {

    }

    public security(String Name, String category, String purchaseDate, String purchasePrice, String quantity) {
        this.Name = Name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public Long getsecurityId() {
        return securityId;
    }

    public String Name() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getcategory() {
        return category;
    }

    public void setcategory(String category) {
        this.category = category;
    }

    public String getpurchaseDate() {
        return purchaseDate;
    }

    public void setpurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getpurchasePrice() {
        return purchasePrice;
    }

    public void setpurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getquantity() {
        return quantity;
    }

    public void setquantity(String quantity) {
        this.quantity = quantity;
    }

}