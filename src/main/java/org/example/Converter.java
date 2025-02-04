package org.example;

import org.example.MyExeption.MyArrayDataExeption;
import org.example.MyExeption.MyArraySizeExeption;

public class Converter {
    static int sum;
    static int value;

    public static void parsing(String[][] arrey) throws MyArraySizeExeption, MyArrayDataExeption {
        if (arrey.length > 4) {
            throw new MyArraySizeExeption("Массив больше чем 4Х4");
        }
        for (int i = 0; i < arrey.length; i++) {
            for (int j = 0; j < arrey.length; j++) {
                try {
                    value = Integer.parseInt(arrey[i][j]);
                    sum = sum + value;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataExeption("В ячейке [" + i + "]" + "[" + j + "]" + " не число");
                }
            }
        }
        System.out.println("Сумма всех элементов массива" + sum);
    }
}
