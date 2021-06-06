package com.chapter09.houseRental.House;

public class House {
    private int id;
    private String name;
    private String num;
    private String address;
    private int rent;
    private String status;

    public House(int id, String name, String num, String address, int rent, String status) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.address = address;
        this.rent = rent;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                "\t\t" + name +
                "\t" + num +
                "\t\t" + address +
                "\t" + rent +
                "\t" + status;
    }
}
