package com.workintech.models;

public class WritingDesk {

    private double weight;
    private int height;
    private int width;
    private Lamp lamp;
    private int numberoflamps;

    public WritingDesk(double weight, int height, int width, Lamp lamp, int numberoflamps) {
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.lamp = lamp;
        this.numberoflamps = numberoflamps;
    }

    public double getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public int getNumberoflamps() {
        return numberoflamps;
    }
    public void add(){
        System.out.println("Writing desk was added into your Children room.");
    }
}
