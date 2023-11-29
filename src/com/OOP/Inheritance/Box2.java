package com.OOP.Inheritance;

public class Box2 extends Box{
    double weight;
    Box2(double l, double h, double w, double weight){
        super(l,h,w);
        this.weight = weight;
    }
    Box2(double side, double weight){
        super(side);
        this.weight = weight;
    }
    Box2(Box2 other){
        super(other);
        this.weight = other.weight;
    }
}
