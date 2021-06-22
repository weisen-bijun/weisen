package com.chapter10.Homework03;

public class Test {
    public static void main(String[] args) {
        Animal animal[] = {new cat(),new dog()};
        for (Animal ani : animal){
            ani.shout();
        }
    }
}
