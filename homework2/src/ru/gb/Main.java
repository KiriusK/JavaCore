package ru.gb;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,3,2,4,0,6,-9,0,7,9,0};
        System.out.println("задача 1: " + countEven(arr));
        System.out.println("задача 2: " + minMaxDifferent(arr));
        System.out.println("задача 3: " + twoZero(arr));

    }

    public static int countEven(int[] inputArr) {
        int counter = 0;
        for(int e:inputArr) {
            if (e % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int minMaxDifferent(int[] inputArr) {
        if (inputArr.length == 2) {
            return Math.abs(inputArr[0] - inputArr[1]);
        } else if (inputArr.length == 1) {
            System.out.println("Недостаточная длина массива");
            return 0;
        }else {
            int min = inputArr[0];
            int max = inputArr[1];
            for (int e: inputArr) {
                max = Math.max(e, max);
                min = Math.min(e, min);
            }
            return max - min;
        }
    }

    public static boolean twoZero(int[] inputArr) {
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == 0 && (i+1) < inputArr.length && inputArr[i+1] == 0) {
                return true;
            }
        }
        return false;
    }

}