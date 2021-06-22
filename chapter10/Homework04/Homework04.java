package com.chapter10.Homework04;

public class Homework04 {
    public static void main(String[] args) {
        Cellphone.testWork(new Computer() {
            @Override
            public void work() {
                System.out.println("计算");
            }
        });
    }
}
interface Computer{
    void work();
}
class Cellphone{
    public static void testWork(Computer computer){
        computer.work();
    }
}