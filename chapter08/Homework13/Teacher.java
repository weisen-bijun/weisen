package com.chapter08.Homework13;

public class Teacher extends Person{

    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    public void teach(){
        System.out.println("我承诺，我会认真教学。");
    }
    public String play(){
        return super.play() + "象棋";
    }
    public String details(){
        return "老师的信息：" + super.details() + "\n工龄：" + this.work_age ;
    }
}
