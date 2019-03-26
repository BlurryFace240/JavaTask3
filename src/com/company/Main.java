package com.company;

public class Main {

    public static void main(String[] args) {
        double avg=0d;
        Student st1 = new Student();
        Student st2 = new Student();
        st1.setData("Eugen",18);
        st2.setData("Xenia",19);
        avg=(st1.getAge()+st2.getAge())/2;
        System.out.println("The average age of 2 students is equal to = "+avg);


    }
}
