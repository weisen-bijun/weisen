package com.chapter08.Homework05;

public class Homework05 {
    public static void main(String[] args) {
        Staff p = new Staff(1000,"人");
        Staff person[] = {new Farmer(30000,"农民"),new Teacher(50000,"教师",365,200)
                          ,new Waiter(30000,"服务生"),new Worker(40000,"工人")
                          ,new Scientist(100000,"科学家",100000)};
        for (int i = 0; i < person.length; i++) {
            p.print(person[i]);
        }
    }

}
