package com.company;

class Square extends GraphicObject
{
    static double sideLength=0d;

    public Square() {}

    public Square(double sideLength)
    {
        this.sideLength=sideLength;
    }

    double calcSquarePerimeter()
    {
        return sideLength*4;
    }

    double calcSquareArea()
    {
        return Math.pow(sideLength,2);//sideLength*=sideLength;
    }

    @Override
    double Area() {
        return Math.pow(this.sideLength,2);
    }
}
