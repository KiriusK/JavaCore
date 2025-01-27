package ru.gb.calc;

import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(OutputDecorator.decorate(calc.addition(2,6)));
        System.out.println(OutputDecorator.decorate(calc.substraction(8,6)));
        System.out.println(OutputDecorator.decorate(calc.multiplication(3,5)));
        System.out.println(OutputDecorator.decorate(calc.division(6,2)));
    }
}