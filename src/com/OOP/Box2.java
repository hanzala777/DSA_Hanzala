package com.OOP;

public class Box2 extends Box{
    double weight;
    Box2(double l, double weight) {
        super(l);
        this.weight = weight;
    }
    Box2(double l, double h, double w, double weight){
        super(l,h,w);
        this.weight = weight;
    }
}
