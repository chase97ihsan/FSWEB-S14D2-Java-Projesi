package com.workintech.main;

import com.workintech.models.*;

public class Main {

    public static void workWithData(){
        Bedroom bedroom1=new Bedroom("Yatakodam1",new Bed("Ortopedic",2,1,1,1),
                new Wardrobe(2,2,200),new Wall("doğu"),new Wall("batı"),new Wall("kuzey"),
                new Wall("güney"),new Ceiling(3, PaintColor.GREEN),
                new Lamp(LampType.NEONLAMP,false,10));

        System.out.println(bedroom1.getName()+" features:");
        bedroom1.getWall1().create();
        bedroom1.getWall2().create();
        bedroom1.getBed().make();
        bedroom1.getCeiling().create();
        bedroom1.getLamp().turnOn();
        bedroom1.getWardrobe().add();
        System.out.println("-------------------");
        System.out.println("Style of bed is: "+ bedroom1.getBed().getStyle());
        System.out.println("Number of pillows on my bed: "+ bedroom1.getBed().getPillows());
        bedroom1.getCeiling().setPaintedcolor(PaintColor.PURPLE);
        System.out.println("New color of my ceiling: "+bedroom1.getCeiling().getPaintedcolor());
        System.out.println("---------------------------------");

        ChildrensRoom childrensRoom=new ChildrensRoom(new Wall("doğu"),new Wall("batı"),
                new Wall("kuzey"),new Wall("kuzey"),new Ceiling(4,PaintColor.BROWN),
                new Lamp(LampType.LEDLAMP,false,8),PaintColor.PURPLE,"MY FIRST CHILDROOM",
                new Bed("Ortopedic",1,1,1,10),new Wardrobe(1,2,100),
                new WritingDesk(70,2,1,new Lamp(LampType.LASERLAMP,true,9),1),2);

        System.out.println(childrensRoom.getName()+" features:");
        childrensRoom.getWall1();
        childrensRoom.getWall2();
        childrensRoom.getBed().make();
        System.out.println("Number of bed: "+ childrensRoom.getNumberofbed());
        childrensRoom.getCeiling().create();
        childrensRoom.getWritingDesk().add();
        System.out.println("Number of lamp that is on writingdesk: "+childrensRoom.getWritingDesk().getNumberoflamps());
    }
    public static void main(String[] args) {
        workWithData();
    }
}