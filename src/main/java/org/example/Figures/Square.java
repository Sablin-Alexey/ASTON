package org.example.Figures;

public class Square implements Figure {
    String name;
    String borderColor;
    String fillColor;
    int size;

    public Square(String name, String borderColor, String fillColor, int size) {
        this.name = name;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
        this.size = size;

    }

    @Override
    public void square() {
        System.out.println("Площать квадрата "+ this.name+ " "+ size*size);    }

    @Override
    public void perimeter() {
        System.out.println("Периметр  квадрата "+ this.name+ " "+ size*4);
    }
}
