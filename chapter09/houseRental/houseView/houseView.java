package com.chapter09.houseRental.houseView;

import com.chapter09.houseRental.House.House;
import com.chapter09.houseRental.Utils.Utility;
import com.chapter09.houseRental.houseService.houseService;

import java.util.Scanner;

public class houseView {
    private boolean loop = true;
    private char choice;
    private houseService Info = new houseService(5);

    public void View(){
        do {
            System.out.println("==========房屋出租系统==========");
            System.out.println("\t\t1.新 增 房 屋");
            System.out.println("\t\t2.查 找 房 屋");
            System.out.println("\t\t3.删 除 房 屋");
            System.out.println("\t\t4.修 改 房 屋 信 息");
            System.out.println("\t\t5.房 屋 列 表");
            System.out.println("\t\t6.退      出");
            System.out.println("请输入你的选择（1-6）：");
            choice = Utility.readMenuSelection();
            switch (choice){
                case '1':
                    creatView();
                    break;
                case '2':
                    readView();
                    break;
                case '3':
                    deleteView();
                    break;
                case '4':
                    updateView();
                    break;
                case '5':
                    System.out.println("房屋列表");
                    listView();
                    break;
                case '6':
                    exitView();
                    loop = false;
                    break;
                default:
                    System.out.println("请输入有效字符！");
                    break;
            }
        }while(loop);
    }
    public void listView(){
        System.out.println("--------房屋列表---------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        for (int i = 0; i < Info.list().length; i++) {
            if (Info.list()[i] == null){
                break;
            }
            System.out.println(Info.list()[i]);
        }
        System.out.println("--------房屋列表完成---------");
    }
    public void creatView(){
        System.out.println("--------添加房屋---------");
        System.out.print("姓名：");
        String name = Utility.readString(6);
        System.out.print("电话：");
        String num = Utility.readString(10);
        System.out.print("地址：");
        String address = Utility.readString(10);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态(未出租/已出租)：");
        String status = Utility.readString(10);
        if(Info.creat(new House(0,name,num,address,rent,status)) == true) {
            System.out.println("--------添加完成---------");
        }else{
            System.out.println("--------添加房屋失败--------");
        }
    }
    public void readView(){
        System.out.println("请输入你要查找的id：");
        int id = Utility.readInt();
        if (Info.read(id) != null) {
            System.out.println(Info.read(id));
        }else {
            System.out.println("房屋不存在，请重新输入");
        }
    }
    public void deleteView() {
        System.out.println("--------删除房屋---------");
        System.out.println("请输入待删除房屋的编号(-1退出)：");
        int id = Utility.readInt();
        if (id == -1) {
            return;
        }
        if (id > 0 && id < Info.list().length) {
            char select = Utility.readConfirmSelection();
            System.out.println("你的选择是：" + select);
            if (select == 'Y') {
                Info.delete(id);
            }
        } else {
            System.out.println("请输入正确的id!");
        }
    }
    public void updateView(){
        System.out.println("--------修改房屋---------");
        System.out.println("请输入待修改房屋的编号(-1退出)：");
        int id = Utility.readInt();
        if (id == -1) {
            return;
        }
        System.out.println("请输入要修改房屋的信息：");
        System.out.print("姓名(" + Info.list()[id - 1].getName() +"):");
        String name = Utility.readString(6,"");
        if ("".equals(name)){
            name = Info.list()[id - 1].getName();
            System.out.print(name);
        }

        System.out.print("电话(" + Info.list()[id - 1].getNum() +"):");
        String num = Utility.readString(10,"");
        if ("".equals(num)){
            num = Info.list()[id - 1].getNum();
            System.out.print(num);
        }
        System.out.print("地址(" + Info.list()[id - 1].getAddress() +"):");
        String address = Utility.readString(10,"");
        if ("".equals(address)){
            address = Info.list()[id - 1].getAddress();
            System.out.print(address);
        }
        System.out.print("地址(" + Info.list()[id - 1].getRent() +"):");
        int rent = Utility.readInt(-1);
        if ( -1 == rent){
            rent = Info.list()[id - 1].getRent();
            System.out.print(rent);
        }
        System.out.print("修改状态(未出租/已出租)(" + Info.list()[id - 1].getStatus() +"):");
        String status = Utility.readString(10,"");
        if ("".equals(status)){
            status = Info.list()[id - 1].getStatus();
            System.out.print(status);
        }
        Info.update(id,new House(0,name,num,address,rent,status));
    }
    public void exitView(){
        System.out.println("你确定退出吗？");
        char select = Utility.readConfirmSelection();
        if (select == 'Y'){
            System.out.println("你退出了程序");
        }else if(select == 'N'){
            return;
        }else{
            System.out.println("选择错误，请重新选择！");
            exitView();
        }
    }
}
