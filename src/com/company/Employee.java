package com.company;

public class Employee {
    private double tariffPerHour = 5.5d;
    public int hours=10;

    public double getSalary(double tariffPerHour,int hours)
    {
        return tariffPerHour*hours;
    }

    public double getTariffPerHour() {
        return tariffPerHour;
    }
}
