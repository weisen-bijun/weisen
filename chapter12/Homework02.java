package com.chapter12;

import java.util.Scanner;

public class Homework02 {
    public static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            getName();
            getCode();
            getAddress();
            System.out.println("用户名：" + getName());
            System.out.println("密码：" + getCode());
            System.out.println("邮箱：" + getAddress());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static String getName(){
        System.out.println("请输入用户名：");
        String name = myScanner.next();
        if (name.length() != 2 && name.length() != 3 && name.length() != 4 ){
            throw new RuntimeException("用户名长度不对");
        }
        return name;
    }
    public static String getCode(){
        System.out.println("请输入密码：");
        String code = myScanner.next();
        int c = Integer.parseInt(code);
        return code;
    }
    public static String getAddress(){
        System.out.println("请输入邮箱：");
        String address = myScanner.next();
        int i = address.indexOf("@");
        int j = address.indexOf(".");
        if (!(i < j)){
            throw new RuntimeException("邮箱输入有误");
        }
        return address;
    }
}
