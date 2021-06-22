package com.chapter10.Homework02;

public class TestFrock {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock[] frocks = {new Frock(),new Frock(),new Frock()};
        for (Frock num : frocks){
            System.out.println(Frock.getNextNum());
        }
    }
}
