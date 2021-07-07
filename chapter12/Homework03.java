package com.chapter12;

public class Homework03 {
    public static void main(String[] args) {
        trans("Wei pi sen");
    }
    public static void trans(String name){
        String[] s = name.split(" ");
        System.out.println(s[s.length - 1] + "," + s[0] + "." + s[1].toUpperCase().toCharArray()[0]);
    }

}
