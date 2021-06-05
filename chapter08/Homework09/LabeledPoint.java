package com.chapter08.Homework09;

public class LabeledPoint extends Point{
    private String Label;

    public LabeledPoint(String label,double x, double y) {
        super(x, y);
        Label = label;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }
}
