package ru.gb.calc;

/**
 * Class gived four simple mathematic operation
 */
public class Calculator {
    /**
     * Method for addition two numbers
     * @param a type int
     * @param b type int
     * @return type int
     */
    public int addition(int a, int b) {
        return a + b;
    }
    /**
     * Method for substraction two numbers
     * @param a type int
     * @param b type int
     * @return type int
     */
    public int substraction(int a, int b) {
        return a - b;
    }
    /**
     * Method for multiplication two numbers
     * @param a type int
     * @param b type int
     * @return type int
     */
    public int multiplication(int a, int b) {
        return a * b;
    }
    /**
     * Method for division two numbers
     * @param a type int
     * @param b type int
     * @return type double
     */
    public double division(int a, int b) {
        if (b != 0) {
            return a / b;
        }
        return 0;
    }
}
