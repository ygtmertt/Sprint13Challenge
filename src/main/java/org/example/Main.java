package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runApplication();
    }

    public static void runApplication() {
        Healthplan hp1 = new Healthplan(1, "Standard Health", Plan.BASIC);
        System.out.println(hp1.toString());

        String[] healthplansArray = new String[2];
        Employee emp1 = new Employee(101, "Alice Johnson", "alice@example.com", "pass123", healthplansArray);
        emp1.addHealthPlan(0, hp1.getName());
        emp1.addHealthPlan(1, "Premium Health");
        emp1.addHealthPlan(1, "Another Plan");
        emp1.addHealthPlan(5, "Invalid Index Plan");
        System.out.println(emp1.toString());

        String[] devs = new String[2];
        Company comp1 = new Company(500, "Tech Corp", 500000, devs);
        comp1.addEmployee(0, "John Developer");
        comp1.addEmployee(0, "Another Developer");
        comp1.addEmployee(3, "Invalid Developer");
        System.out.println(comp1.toString());
    }
}
