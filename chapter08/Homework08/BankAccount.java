package com.chapter08.Homework08;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {

        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;

    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
