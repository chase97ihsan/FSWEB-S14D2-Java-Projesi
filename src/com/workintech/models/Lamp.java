package com.workintech.models;

public class Lamp {

    private LampType style;
    private boolean batery;
    private int globRating;

    public Lamp(LampType style, boolean batery, int globRating) {
        this.style = style;
        this.batery = batery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBatery() {
        return batery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
