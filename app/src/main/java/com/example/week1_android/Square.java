package com.example.week1_android;

public class Square extends Shape {

    double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public double calculateArea(){
        return side * side;
    }
}
