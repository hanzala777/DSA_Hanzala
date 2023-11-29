package com.OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(5);
        box.h = 9.0;
        box.w = 10;

        System.out.println("Box1 l = " + box.l);
        System.out.println("Box1 h = " + box.h);
        System.out.println("Box1 w = " + box.w);

        System.out.println();

        Box2 box2 = new Box2(1,2,3,4);
        System.out.println("Box2 l = " + box2.l);
        System.out.println("Box2 h = " + box2.h);
        System.out.println("Box2 w = " + box2.w);
        System.out.println("Box2 weight = " + box2.weight);

        System.out.println();

        BoxPrice box3 = new BoxPrice(1,2,3,4,5);
        System.out.println("box3 l " + box3.l);
        System.out.println("box3 weight " + box3.weight);
        System.out.println("box3 cost " + box3.cost);

        System.out.println();

        BoxPrice box4 = new BoxPrice(box3);
        box4.cost = 82;
        System.out.println("box4 l " + box4.l);
        System.out.println("box4 weight " + box4.weight);
        System.out.println("box4 cost " + box4.cost);
    }
}
