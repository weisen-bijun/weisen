package com.chapter10.Homework07;

public class Car {
    private double temp;

    public Car(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    class Air{
        public void blow(){
            if (temp > 40){
                System.out.println("吹出冷风");
            }else if(temp < 0){
                System.out.println("吹出热风");
            }else{
                System.out.println("空调关闭");
            }
        }
    }
}
class test{
    public static void main(String[] args) {
        Car.Air car[] = {new Car(67).new Air(),new Car(-2).new Air(),new Car(33).new Air()};
        for (Car.Air blow : car){
            blow.blow();
        }
    }
}