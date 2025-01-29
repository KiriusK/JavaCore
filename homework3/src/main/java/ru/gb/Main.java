package ru.gb;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Employee empl1 = new Employee("Vasily", LocalDate.of(2000, 1, 1), 50000);
        Employee empl2 = new Employee("Sergey", LocalDate.of(1999, 12, 11), 60000);
        Employee empl3 = new Employee("Andrey", LocalDate.of(1989, 10, 11), 80000);
        Boss boss1 = new Boss("Kirill", LocalDate.of(1985, 5, 1), 180000);
        System.out.println(empl2.birthDateComparator(empl1));

        Employee[] employs = {empl1, empl2, empl3, boss1};
        for (Employee employee:employs) {
            System.out.println(employee.getSalary());
        }

        Boss.increaseSalary(employs, 25);

        for (Employee employee:employs) {
            System.out.println(employee.getSalary());
        }

    }
}