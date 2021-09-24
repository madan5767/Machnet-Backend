package com.assignment3;

@FunctionalInterface
interface Shape {
    Double calculate(double length, double breadth);
}

public class CalculateArea {

    public static void main(String[] args) {
        Shape calculateAreaOfRectangle = (double length, double breadth)-> length*breadth;
        Shape calculateAreaOfTriangle = (double base, double height)-> 0.5*(base*height);

        System.out.println("Area of Rectangle of length=12 and breadth=8 is: "+ calculateAreaOfRectangle.calculate(12,8));
        System.out.println("Area of Triangle of base=12 and height=8: "+ calculateAreaOfTriangle.calculate(12,8));
    }
}
