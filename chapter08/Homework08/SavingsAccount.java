package com.chapter08.Homework08;

public class SavingsAccount extends BankAccount {
    private int times = 3;
    private double rate = 0.1;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void deposit(double amount) {
        if (times > 0) {
            super.deposit(amount);
        }else {
            super.deposit(amount - 1);
        }
        times--;
    }
    public void withdraw(double amount) {
        if (times > 0) {
            super.withdraw(amount);
        }else {
            super.withdraw(amount + 1);
        }
        times--;
    }

    public void earnMonthlyInterest(){
        times = 3;
        super.deposit(getBalance() * rate);

    }
}
