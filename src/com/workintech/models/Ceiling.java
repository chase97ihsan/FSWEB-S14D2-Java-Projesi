package com.workintech.models;

public class Ceiling {

    private int height;
    private PaintColor paintedcolor;

    public Ceiling(int height, PaintColor paintedcolor) {
        this.height = height;
        this.paintedcolor = paintedcolor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedcolor() {
        return paintedcolor;
    }

    public void setPaintedcolor(PaintColor paintedcolor) {
        this.paintedcolor = paintedcolor;
    }

    public void create(){
        System.out.println("Ceiling Height: "+ getHeight()+", Paintedcolor: "+ getPaintedcolor());
    }
}
