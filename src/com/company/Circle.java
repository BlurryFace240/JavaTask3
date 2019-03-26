package com.company;

public class Circle extends GraphicObject{

    static double radius=0d;

    public Circle() {}

    public Circle(double radius)
    {
        this.radius=radius;
    }

    double calcCirclePerimeter()
    {
        return 2*radius*Math.PI;
    }

    double calcCircleArea()
    {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    double Area() {
        return Math.PI*Math.pow(this.radius,2);
    }
}
