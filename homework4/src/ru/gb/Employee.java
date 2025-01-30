package ru.gb;

import ru.gb.enums.Genders;

import java.time.LocalDate;

public class Employee {

    private final Genders gender;
    private String name;
    private LocalDate birthdate;
    private double salary;

    public Employee(String name, LocalDate birthdate, double salary, Genders gender) {
        this.name = name;
        this.birthdate = birthdate;
        this.salary = salary;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int birthDateComparator(Employee employee) {
        return this.getBirthdate().compareTo(employee.getBirthdate());
    }
}
