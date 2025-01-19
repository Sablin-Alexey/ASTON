package org.example;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        cmpareNumbers();
        checkSumRange(1, 19);
        checkPositivNumb(-4);
        checkPositivNumbRet(-4);
        printText("Help", 7);
        checkLeapYear(2004);
        arreyCorrection();
        createArrey();
        myltiplyBySix();
        arreyMarkX();
        createArreyByOrder(5,4);


    }

    public static void printThreeWords() {
        System.out.println("Orange\n" +
                "Banana\n" +
                "Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -100;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Желтый");
        }
    }

    public static void cmpareNumbers() {
        int a = 1;
        int b = 1;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static boolean checkSumRange(int a, int b) {
        int sum = a + b;
        if ((10 <= sum) & (sum <= 20)) {
            return true;

        } else return false;
    }

    public static void checkPositivNumb(int a) {
        if (a < 0) {
            System.out.println("Передано отрицательное число");
        } else System.out.println("Передано положительное число");
    }

    public static boolean checkPositivNumbRet(int a) {
        if (a < 0) {
            return true;
        } else return false;
    }

    public static void printText(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean checkLeapYear(int a) {
        if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0)) {
            return true;
        } else return false;
    }

    public static void arreyCorrection() {
        int[] array = {1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else array[i] = 0;


        }
    }

    public static void createArrey() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

    }

    public static void myltiplyBySix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }

    public static void arreyMarkX() {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (i == j) {
                    arr[i][j] = 1;
                    arr[i][arr.length - 1 - j] = 1;
                }
            }
        }
    }

    public static int[] createArreyByOrder(int len, int initialValue) {
        int[] arrey = new int[len];
        for (int i = 0; i < len; i++) {
            arrey[i] = initialValue;
        }
        return arrey;
    }


}








