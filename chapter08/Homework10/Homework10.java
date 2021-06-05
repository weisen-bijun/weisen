package com.chapter08.Homework10;

public class Homework10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Jack", 34, "医生", '男', 56000);
        Object obj = new Doctor("Jack", 34, "医生", '男', 56000);
        if(doctor.equals(obj)){
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }
    }
}
