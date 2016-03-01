package com.wt.entity;

public class Account {
    
    private String accountNumber;
    private String accountCreationDate;
    private double balance;
    private String accountType;

    public Account() {
    }

    public Account(String accountNumber, String accountCreationDate, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountCreationDate = accountCreationDate;
        this.balance = balance;
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(String accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    
}
