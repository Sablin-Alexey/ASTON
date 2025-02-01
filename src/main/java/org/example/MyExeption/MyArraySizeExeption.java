package org.example.MyExeption;

public class MyArraySizeExeption extends ArrayIndexOutOfBoundsException {
    public MyArraySizeExeption(String message) {
        super(message);
    }
}
