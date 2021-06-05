package com.chapter08.Homework05;

public class Staff {
    private double salary;
    private String post;

    public Staff(double salary, String post) {
        this.salary = salary;
        this.post = post;
    }

    public Staff(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double Info(){
        return this.salary;
    }
    public void print(Staff p){
        System.out.println(p.getPost() + "的工资为" + p.Info() + "元");
    }
}
class Worker extends Staff{
    public Worker(double salary, String post) {
        super(salary, post);
    }
    public double Info(){
        return super.Info();
    }
}
class Farmer extends Staff{
    public Farmer(double salary, String post) {
        super(salary, post);
    }
    public double Info(){
        return super.Info();
    }
}
class Teacher extends Staff{
    private int day;
    private double dailySalary;
    public Teacher(double salary, String post, int day, double dailySalary) {
        super(salary, post);
        this.day = day;
        this.dailySalary = dailySalary;
    }
    public double Info(){
        return super.Info() + this.day * this.dailySalary;
    }

}
class Scientist extends Staff{
    private double bonus;

    public Scientist(double salary, String post, double bonus) {
        super(salary, post);
        this.bonus = bonus;
    }
    public double Info(){
        return super.Info() + this.bonus;
    }
}
class Waiter extends Staff{
    public Waiter(double salary, String post) {
        super(salary, post);
    }
    public double Info(){
        return super.Info();
    }
}