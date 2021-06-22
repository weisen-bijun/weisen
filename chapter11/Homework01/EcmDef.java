package com.chapter11.Homework01;


import java.util.Scanner;

public class EcmDef {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.println("请输入第一个数：");
            int i = myScanner.nextInt();
            System.out.println("请输入第二个数：");
            int j = myScanner.nextInt();
            if (args.length != 2){
                throw new ArrayIndexOutOfBoundsException();
            }
            double k = cal(i,j);
            System.out.println("计算结果为:" + k);
        } catch (ArithmeticException e) {
            System.out.println("0不能作为被除数");
        }catch (NumberFormatException e){
            System.out.println("输入格式有误");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("必须输入两个参数");
        }
    }
    public static double cal(int i ,int j){
        return i / j;
    }
}
