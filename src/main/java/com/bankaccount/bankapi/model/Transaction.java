/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bankaccount.bankapi.model;

import java.util.Date;

/**
 *
 * @author JMcN
 * Transaction.java
 */
public class Transaction {
    
    private boolean isDebit;
    private boolean isCredit;
    private Date date;
    private String description;
    private int balance;

    public Transaction() {
    }

    public Transaction(boolean isDebit, boolean isCredit, Date date, String description, int balance) {
        this.isDebit = isDebit;
        this.isCredit = isCredit;
        this.date = new Date();
        this.description = description;
        this.balance = balance;
    }

    public boolean isIsDebit() {
        return isDebit;
    }

    public boolean isIsCredit() {
        return isCredit;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public int getBalance() {
        return balance;
    }

    public void setIsDebit(boolean isDebit) {
        this.isDebit = isDebit;
    }

    public void setIsCredit(boolean isCredit) {
        this.isCredit = isCredit;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    

}
