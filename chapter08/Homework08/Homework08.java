package com.chapter08.Homework08;

public class Homework08 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(5000);
        savingsAccount.deposit(411);
        savingsAccount.deposit(411);
        savingsAccount.deposit(411);
        System.out.println(savingsAccount.getBalance());
    }
}
