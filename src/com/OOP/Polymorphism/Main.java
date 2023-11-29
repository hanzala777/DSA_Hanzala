package com.OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
//        Parent obj = new Child();
//        Here, which method will be called depends on child known as UPCASTING
//        And the whole is called overriding
        Shapes shapes = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();
        Shapes rectangle = new Rectangle();

        shapes.area();
        circle.area();
        square.area();
        rectangle.area();
    }
}
