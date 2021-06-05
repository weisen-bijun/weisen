package com.chapter08.Homework03;

public class Professor extends Teacher {
    private double salaryScale;

    public Professor(String name, int age, String post, double salary, double salaryScale) {
        super(name, age, post, salary);
        this.salaryScale = salaryScale;
    }

    public double getSalaryScale() {
        return salaryScale;
    }

    public void setSalaryScale(double salaryScale) {
        this.salaryScale = salaryScale;
    }
    public String introduce(){
        return super.introduce() + "  工资级别：" + this.salaryScale;
    }
}
