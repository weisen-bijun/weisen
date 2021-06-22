package com.chapter10.Homework08;

public enum Color implements get {
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private double redValue;
    private double greenValue;
    private double blueValue;

    Color(double redValue, double greenValue, double blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show(Color color) {
        switch (color){
            case RED :
                System.out.println(color);
                break;
            case BLUE :
                System.out.println(color);
                break;
            case BLACK :
                System.out.println(color);
                break;
            case YELLOW :
                System.out.println(color);
                break;
            default:
                System.out.println(color);
                break;
        }
    }

    @Override
    public String toString() {
        return "redValue=" + redValue + ", " +
                "greenValue=" + greenValue +
                ", blueValue=" + blueValue;
    }
}
interface get{
    void show(Color color);
}
class Test{
    public static void main(String[] args) {
        Color color = Color.BLUE;
        color.show(color);
    }
}
