package ru.bfu.ipmit.codesmells.examples.codeduplication.calculator;

public class Calculator {

    // сумма элементов двух массивов
    public static int getSum(int[] firstArray, int[] secondArray) {
        // сумма элементов первого массива
        int firstSum = 0;
        for (int element : firstArray) {
            firstSum += element;
        }
        // сумма элементов второго массива
        int secondSum = 0;
        for (int element : secondArray) {
            secondSum += element;
        }

        return firstSum + secondSum;
    }

}
