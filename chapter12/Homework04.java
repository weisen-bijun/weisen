package com.chapter12;

public class Homework04 {
    public static void main(String[] args) {
        search("fsajfksahjshnHNJKHUIhhnjkHKJNHHUOIFH9798A798F7A987");
    }
    public static void search(String str){
        int upCaseNumber = 0;
        int lowCaseNumber = 0;
        int Number = 0;
        char[] chars = str.toCharArray();
        for (char c : chars){
            if (c >= 'a' && c <= 'z'){
                lowCaseNumber++;
            }else if (c >= 'A' && c <= 'Z' ){
                upCaseNumber++;
            }else if(c >= '0' && c <= '9' ){
                Number++;
            }
        }
        System.out.println("大写字母有" + upCaseNumber + "个");
        System.out.println("小写字母有" + lowCaseNumber + "个");
        System.out.println("数字有" + Number + "个");
    }
}
