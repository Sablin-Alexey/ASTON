package org.example;

import static org.example.Employee.printInfo;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivan", "Ivanov", "Ivanovich", "Director", "badmail@bm.com", 788733, 20, 100500);
        employees[1] = new Employee("Victor", "Ivanov", "Ivanovich", "Manager", "badmail2@bm.com", 78753, 21, 500);
        employees[2] = new Employee("Stepan", "Ivanov", "Ivanovich", "Seller", "badmail3@bm.com", 74433, 22, 100);
        employees[3] = new Employee("Svetlana", "Ivanova", "Ivanovna", "Doctor", "badmail4@bm.com", 700047, 23, 10050);
        employees[4] = new Employee("Ivana", "Ivanova", "Ivanovna", "Driver", "badmail5@bm.com", 55733, 24, 100501);
        printInfo(employees[0]);

        Park park = new Park("Central", 35, "Amusment park");
        Park.Attraction attraction = new Park("Western", 200, "Children's park").new Attraction("Trampoline", "Every day, from 9 to 15", 200);
        System.out.println(attraction.getName() + '\n' +
                attraction.getSchedule() + '\n' +
                attraction.getPriceInRubles() + " rub");
    }
}