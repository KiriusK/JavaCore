package ru.gb;

import ru.gb.enums.Genders;

import java.time.LocalDate;

public class Boss extends Employee{

    public Boss(String name, LocalDate birthdate, double salary, Genders gender) {
        super(name, birthdate, salary, gender);
    }

    public static void increaseSalary(Employee[] employs, double percent) {
        for(Employee employee:employs) {
            if (!(employee instanceof Boss)) {
                employee.setSalary(employee.getSalary()*(1 + percent/100));
            }
        }
    }


}
