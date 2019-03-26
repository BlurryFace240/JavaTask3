package com.company;

public class UseEmployee {
    public static void main(String[] args)
    {
        System.out.println("====================================Employee=============================================");
        Employee e1 = new Employee();
        System.out.println("Tariff per Hour= "+e1.getTariffPerHour());
        System.out.println("Salary= "+e1.getSalary(e1.getTariffPerHour(),e1.hours));
        System.out.println("=====================================Manager=============================================");
        Manager m1 = new Manager();
        System.out.println("Tariff per Hour= "+m1.getTariffPerHour(e1.getTariffPerHour()));
        System.out.println("Salary= "+m1.getSalary(e1.getSalary(e1.getTariffPerHour(),e1.hours)));
    }
}
