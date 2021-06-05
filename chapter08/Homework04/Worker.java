package com.chapter08.Homework04;

public class Worker extends Staff{
    private double salaryScale;

    public Worker(String name, double dailySalary, int day, double salaryScale) {
        super(name, dailySalary, day);
        this.salaryScale = salaryScale;
    }

    public double getSalaryScale() {
        return salaryScale;
    }

    public void setSalaryScale(double salaryScale) {
        this.salaryScale = salaryScale;
    }
    public double Salary(){
        return super.Salary() * this.salaryScale;
    }
}
