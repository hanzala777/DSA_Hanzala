package com.OOP.Inheritance;

public class Box {
    double l;
    double h;
    double w;
    // in case of cube
    Box(double l){
        this.l = l;
    }
    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box other){
        this.l = other.l;
        this.h = other.h;
        this.w = other.w;
    }
}
