package org.example;

public class Creator {
    public static String[][] creatorNumbArrey(int value) {
        String[][] arrey = new String[value][value];
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                arrey[i][j] = String.format("%.0f", (Math.random() * 10));
            }
        }
        return arrey;
    }

    public static String[][] creatorCharArrey(int value) {
        char a;
        String[][] arrey = new String[value][value];
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                a = (char) Math.round((Math.random() * 10));
                arrey[i][j] = String.valueOf(a);
            }
        }
        return arrey;
    }
}
