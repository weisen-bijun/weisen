package com.chapter09.houseRental.houseRentApp;

import com.chapter09.houseRental.houseView.houseView;

public class houseRentApp {
    public static void main(String[] args) {
        System.out.println("第一次使用需先添加房屋");
        new houseView().View();
        System.out.println("你退出了房屋出租系统");
    }
}
