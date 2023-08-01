package com.workintech.models;

public class ChildrensRoom extends Room{

    private PaintColor colorofwalls;
    private String name;
    private Bed bed;
    private Wardrobe wardrobe;
    private WritingDesk writingDesk;
    private int numberofbed;

    public ChildrensRoom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp, PaintColor colorofwalls,
                         String name, Bed bed, Wardrobe wardrobe, WritingDesk writingDesk, int numberofbed) {
        super(wall1, wall2, wall3, wall4, ceiling, lamp);
        this.colorofwalls = colorofwalls;
        this.name = name;
        this.bed = bed;
        this.wardrobe = wardrobe;
        this.writingDesk = writingDesk;
        this.numberofbed = numberofbed;
    }

    public PaintColor getColorofwalls() {
        return colorofwalls;
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

    public WritingDesk getWritingDesk() {
        return writingDesk;
    }

    public int getNumberofbed() {
        return numberofbed;
    }
}
