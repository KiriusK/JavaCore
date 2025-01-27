package ru.gb.calc;

/**
 * Class for decorating calculator output
 */
public class OutputDecorator {
    /**
     * Method decorating input number and return string
     * @param inputNum Number
     * @return String
     */
    public static String decorate(Number inputNum) {
        return "Результат: " + inputNum;
    }
}
