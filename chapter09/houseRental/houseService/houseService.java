package com.chapter09.houseRental.houseService;

import com.chapter09.houseRental.House.House;

public class houseService {
    private House house[];
    private int houseNum = 0;//当前房子的个数

    public houseService(int i) {
        house = new House[i];
    }//指定数组的大小

    public boolean creat(House h) {
        if (houseNum == house.length) {
            House house1[] = new House[house.length + 1];
            for (int i = 0; i < house.length; i++) {
                house1[i] = house[i];
            }
            house = house1;
        }
        house[houseNum++] = h;
        h.setId(houseNum);
        return true;
    }

    public House[] list() {
        return house;
    }

    public House read(int id) {
        for (int i = 0; i < house.length; i++) {
            if (house[i] == null) {
                houseNum = i;
                break;
            }
        }
        if (id > houseNum) {
            System.out.println("房屋不存在，请重新输入");
            return null;
        }
        return house[id - 1];
    }

    public void delete(int id) {
        for (int i = 0; i < house.length; i++) {
            if (house[i] == null) {
                houseNum = i;
                break;
            }
        }
        house[id - 1] = null;
        for (int i = id - 1; i < houseNum - 1; i++) {
            house[i + 1].setId(house[i + 1].getId() - 1);
            House temp = house[i];
            house[i] = house[i + 1];
            house[i + 1] = temp;
        }
    }

    public void update(int id, House h1) {
        for (int i = 0; i < house.length; i++) {
            if (house[i] == null) {
                houseNum = i;
                break;
            }
        }
        if (id > houseNum) {
            System.out.println("房屋不存在");
        } else {
            h1.setId(id);
            house[id - 1] = h1;
            System.out.println("房屋修改完成");
        }
    }
}
