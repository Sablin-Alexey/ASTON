package org.example;

import java.util.Random;

public class Creator {
    public static String[][] creatorNumbArrey(int value) {
        String[][] arrey = new String[value][value];
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                arrey[i][j] = String.format("%.0f", (Math.random() * 10));
            }
        }
        System.out.println("Создан числовой массив");
        for (int i = 0; i < arrey.length; i++) {
            for (int j = 0; j < arrey.length; j++) {
                System.out.print(arrey[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return arrey;
    }
    public static String[][] creatorCharArrey(int value) {
        char a;
        Random rn = new Random();
        int maximumSymbolAscii= 126;
        int minimumSymbolAscii = 58;
        String[][] arrey = new String[value][value];
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                a = (char) (rn.nextInt(maximumSymbolAscii - minimumSymbolAscii + 1) + minimumSymbolAscii);
                arrey[i][j] = String.valueOf(a);
            }
        }
        System.out.println("Создан массив символов");
        for (int i = 0; i < arrey.length; i++) {
            for (int j = 0; j < arrey.length; j++) {
                System.out.print(arrey[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return arrey;
    }
}
