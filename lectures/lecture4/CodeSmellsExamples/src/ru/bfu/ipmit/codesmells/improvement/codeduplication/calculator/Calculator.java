package ru.bfu.ipmit.codesmells.improvement.codeduplication.calculator;

public class Calculator {

    // сумма элементов двух массивов
    public static int getSum(int[] firstArray, int[] secondArray) {
        int firstSum = getSum(firstArray);
        int secondSum = getSum(secondArray);

        return firstSum + secondSum;
    }

    private static int getSum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }

        return sum;
    }

}
