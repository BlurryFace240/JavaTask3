package com.company;

public class UseGraphicObjects {
    public static void main(String[] args)
    {
        Square sq1 = new Square(4);
        Circle cl1 = new Circle(6);
        System.out.println("Square perimeter = "+sq1.calcSquarePerimeter());
        System.out.println("Circle perimeter = "+cl1.calcCirclePerimeter());
        System.out.println("Square Area = "+sq1.calcSquareArea());
        System.out.println("Circle Area = "+cl1.calcCircleArea());
        System.out.println("Square Area = "+sq1.Area());
        System.out.println("Circle Area = "+cl1.Area());
    }
}
