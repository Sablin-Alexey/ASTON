package org.example;


import org.example.MyExeption.MyArrayDataExeption;
import org.example.MyExeption.MyArraySizeExeption;

import static org.example.Converter.parsing;

public class Main {
    public static void main(String[] args) {
        String[][] forthArray = Creator.creatorNumbArrey(4);
        String[][] brokLengthArrey = Creator.creatorNumbArrey(5);
        String[][] brokCharArrey = Creator.creatorCharArrey(4);


        try {
            parsing(forthArray);
        } catch (MyArrayDataExeption exeption) {
            System.out.println("У массива не верные данные");
        } catch (MyArraySizeExeption exeption) {
            System.out.println("У массива не верный размер");
        }

        try {
            parsing(brokLengthArrey);
        } catch (MyArrayDataExeption exeption) {
            System.out.println("У массива не верные данные");
        } catch (MyArraySizeExeption exeption) {
            System.out.println("У массива не верный размер");
        }

        try {
            parsing(brokCharArrey);
        } catch (MyArrayDataExeption exeption) {
            System.out.println("У массива не верные данные");
        } catch (MyArraySizeExeption exeption) {
            System.out.println("У массива не верный размер");
        }
    }
}