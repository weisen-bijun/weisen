package com.chapter08.Homework01;

public class Homework01 {
    public static void main(String[] args) {
        Person p1 = new Person("jack", 18, "学生");
        Person p2 = new Person("mary", 17, "工人");
        Person p3 = new Person("smith", 30, "教师");
        Person personArr[] = {p1,p2,p3};
        for (int i = 0; i < personArr.length - 1; i++) {
            for (int j = 0; j < personArr.length - 1 - i; j++) {
                if (personArr[i].getAge() < personArr[i+1].getAge()){
                    Person p = personArr[i];
                    personArr[i] = personArr[i+1];
                    personArr[i+1] = p;
                }
            }
        }
        for (int i = 0; i < personArr.length; i++) {
            System.out.print(personArr[i].getName() + "  ");
        }
    }
}

