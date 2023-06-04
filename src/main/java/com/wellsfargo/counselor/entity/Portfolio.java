package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio{

    @Id
    @GeneratedValue();
    private long portfolioId;

    @Column(nullable = false)
    private String Name;

    @OneToMany(mappedBy = "client")
    private clientId client; 

    @OneToMany(mappedBy = "financialAdvisor")
    private advisorId financialAdvisor;

    @Column(nullable = false)
    private String PortfolioName;


    protected Portfolio() {

    }

    public Portfolio(String Name, String PortfolioName) {
        this.Name = Name;
        this.PortfolioName = PortfolioName;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String Name() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPortfolioName() {
        return PortfolioName;
    }

    public void setPortfolioName(String PortfolioName) {
        this.PortfolioName = PortfolioName;
    }

    public clientId getClient() {
        return client;
    }

    public financialAdvisor getFinancialAdvisor() {
        return financialAdvisor;
    }
}