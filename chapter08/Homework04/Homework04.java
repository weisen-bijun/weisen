package com.chapter08.Homework04;

public class Homework04 {
    public static void main(String[] args) {
        Worker jack = new Worker("Jack", 400, 30, 1.0);
        Manager smith = new Manager("Smith", 600, 30, 1.2);
        System.out.println(jack.getName() + "的工资为" + jack.Salary() + "元");
        System.out.println(smith.getName() + "的工资为" + smith.Salary() + "元");
    }
}
