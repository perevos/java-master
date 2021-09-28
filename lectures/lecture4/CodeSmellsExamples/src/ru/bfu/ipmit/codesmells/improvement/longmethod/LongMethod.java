package ru.bfu.ipmit.codesmells.improvement.longmethod;

// корректировка кода с длинным методом
public class LongMethod {

    // Вывод характеристик массива в консоль
    public static void printArrayInfo(int[] array) {
        printInfo("Длина массива", array.length);
        printInfo("Минимальный элемент массива", getMinimum(array));
        printInfo("Максимальный элемент массива", getMaximum(array));
        printInfo("Сумма элементов массива", getSum(array));
    }

    private static void printInfo(String message, int value) {
        System.out.println(message + ": " + value);
    }

    private static int getSum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    private static int getMaximum(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    private static int getMinimum(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

}
