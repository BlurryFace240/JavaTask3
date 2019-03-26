package com.company;

public class UsePoint {

    public static void main(String[] args)
    {
        Point p = new Point();
        p.setX(4);p.setY(5);p.setZ(6);
        System.out.println("X="+p.getX()+"  Y="+p.getY()+"  Z="+p.getZ());
        Point p1 = new Point(1,2,3);
        System.out.println(p1);
        Point p3 = new Point(7,8);
        System.out.println("X="+p3.getX()+"  Y="+p3.getY());
    }

}
