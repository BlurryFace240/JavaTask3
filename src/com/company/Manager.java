package com.company;

public class Manager extends Employee {
    public double getSalary(double salary)
    {
        return salary+(salary/2);
    }

    public double getTariffPerHour(double tariffPerHour) {
        return tariffPerHour+(tariffPerHour/2);
    }
}
