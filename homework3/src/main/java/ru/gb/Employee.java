package ru.gb;

import java.time.LocalDate;

public class Employee {

    private String name;
    private LocalDate birthdate;
    private double salary;

    public Employee(String name, LocalDate birthdate, double salary) {
        this.name = name;
        this.birthdate = birthdate;
        this.salary = salary;
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
