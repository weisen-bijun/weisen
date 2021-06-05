package com.chapter08.Homework13;

public class Person {
    private String name;
    private char sex;
    private int age;


    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play() {
        return this.name + "爱玩";
    }

    public String details() {
        return "\n姓名：" + this.name + "\n年龄：" + this.age + "\n性别：" + this.sex;
    }

    public void Info(Person p) {
        if (p instanceof Student) {
            Student s = (Student) p;
            s.study();
        }
        if (p instanceof Teacher) {
            Teacher t = (Teacher) p;
            t.teach();
        }
    }
}
