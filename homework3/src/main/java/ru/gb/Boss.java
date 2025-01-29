package ru.gb;

import java.time.LocalDate;

public class Boss extends Employee{

    public Boss(String name, LocalDate birthdate, double salary) {
        super(name, birthdate, salary);
    }

    public static void increaseSalary(Employee[] employs, double percent) {
        for(Employee employee:employs) {
            if (!(employee instanceof Boss)) {
                employee.setSalary(employee.getSalary()*(1 + percent/100));
            }
        }
    }


}
