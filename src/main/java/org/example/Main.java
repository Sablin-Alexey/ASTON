package org.example;


import static org.example.Converter.parsing;

public class Main {
    public static void main(String[] args) {
        String[][] forthArray = Creator.creatorNumbArrey(4);
        String[][] brokLengthArrey = Creator.creatorNumbArrey(5);
        String[][] brokCharArrey = Creator.creatorCharArrey(4);
        parsing(forthArray);
        parsing(brokLengthArrey);
        parsing(brokCharArrey);
    }
}