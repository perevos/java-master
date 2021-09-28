package ru.bfu.ipmit.codesmells.improvement.codeduplication;

import ru.bfu.ipmit.codesmells.improvement.codeduplication.calculator.Calculator;

// устранение дублирования в коде (класс Calculator)
class CodeDuplication {

    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6};

        int sum = Calculator.getSum(firstArray, secondArray);

        System.out.println(sum);
    }


}
