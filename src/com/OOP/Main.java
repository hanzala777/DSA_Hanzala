package com.OOP;

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
        System.out.println("Box1 h = " + box2.h);
        System.out.println("Box1 w = " + box2.w);
        System.out.println("Box1 weight = " + box2.weight);
    }
}
