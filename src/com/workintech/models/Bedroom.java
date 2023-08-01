package com.workintech.models;

public class Bedroom extends Room {

    private String name;

    private  Bed bed;

    private Wardrobe wardrobe;

    public Bedroom(String name,Bed bed, Wardrobe wardrobe,Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp) {
        super(wall1,wall2,wall3,wall4,ceiling,lamp);
        this.name = name;
        this.bed = bed;
        this.wardrobe = wardrobe;
    }

    public String getName() {
        return name;
    }
    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }
}
