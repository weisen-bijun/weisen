package com.chapter08.Homework04;

public class Staff {
    private String name;
    private double dailySalary;
    private int day;

    public Staff(String name, double dailySalary, int day) {
        this.name = name;
        this.dailySalary = dailySalary;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public double Salary(){
        return this.day * this.dailySalary;
    }
}
