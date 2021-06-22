package com.chapter10.Homework06;

public interface Vehicles {
    void work();
}

class Horse implements Vehicles {

    @Override
    public void work() {
        System.out.println("一般情况下骑马");
    }
}

class Boat implements Vehicles {

    @Override
    public void work() {
        System.out.println("遇到大河时坐船");
    }
}

class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passCommon() {
        if (vehicles instanceof Boat || vehicles == null){
            vehicles = vehiclesPlant.getHorse();
        }
        vehicles.work();
    }
    public void passRiver(){
        if (vehicles instanceof Horse || vehicles == null){
            vehicles = vehiclesPlant.getBoat();
        }
        vehicles.work();
    }
}

class vehiclesPlant {
    public static Horse horse = new Horse();
    private vehiclesPlant(){}
    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }
}
class Test{
    public static void main(String[] args) {
        Person person = new Person("唐僧",new Horse());
        person.passCommon();
        person.passRiver();
    }
}
