package com.chapter10.Homework02;

public class Frock {
    public int serialNumber;
    private static int currentNum = 100000;

    public Frock() {
        this.serialNumber = getSerialNumber();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }


}
