package com.sutherland.loanservice.entity;

//import com.sutherland.creditscore.entity.CreditScore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class LoanService {

    @Id
    private int customerId;

    @Column(length = 40)
    private String name;

    @Column(length = 100)
    private String email;

    @Column(length = 15)
    private String mobileNumber;

    @Column(precision = 10, scale = 2)
    private double monthlyIncome;

    @Column(precision = 10, scale = 2)
    private double loanAvai;

    @ManyToOne
    @JoinColumn(name = "pancard", referencedColumnName = "pancard")
    private double creditScore;

    // Getters and Setters

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public double getLoanAvai() {
        return loanAvai;
    }

    public void setLoanAvai(double loanAvai) {
        this.loanAvai = loanAvai;
    }

    public double getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(double creditScore) {
        this.creditScore = creditScore;
    }
}