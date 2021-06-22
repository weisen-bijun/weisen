package com.chapter08.Homework08;

public class CheckingAccount extends BankAccount{

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }
    public void deposit(double amount){
        super.deposit(amount - 1);
    }
    public void withdraw(double amount){
        super.withdraw(amount + 1);
    }
}