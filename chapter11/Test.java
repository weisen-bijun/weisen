package com.chapter11;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println(A.getInt());
    }
}
class A{
    public static int i;
    public static int getInt(){
        try {
            System.out.println("请输入整数：");
            i = new Scanner(System.in).nextInt();
        } catch (Exception e) {
            System.out.println("输入有误，请重新输入！");
            A.getInt();
        }
        return i;
    }
}