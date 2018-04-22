/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bankaccount.bankapi.model;

/**
 * 
 * @author JMcN
 * Account.java
 */


import javax.xml.bind.annotation.XmlRootElement;

public class Account {
    
    private int sortCode;
    private int accountNo;
    private int balance;

    public Account() {
    }

    public Account(int sortCode, int accountNo, int balance) {
        this.sortCode = sortCode;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public int getSortCode() {
        return sortCode;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setSortCode(int sortCode) {
        this.sortCode = sortCode;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
