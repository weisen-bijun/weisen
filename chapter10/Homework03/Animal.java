package com.chapter10.Homework03;

public abstract class Animal {
    public abstract void shout();
}
class cat extends Animal{

    @Override
    public void shout() {
        System.out.println("猫会喵喵叫");
    }
}
class dog extends Animal{

    @Override
    public void shout() {
        System.out.println("狗会汪汪叫");
    }
}