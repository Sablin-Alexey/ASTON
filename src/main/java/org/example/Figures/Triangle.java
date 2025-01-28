package org.example.Figures;

import static java.lang.Math.sqrt;

public class Triangle implements Figure{
    String name;
    String borderColor;
    String fillColor;
    int sizeA;
    int sizeB;
    int sizeC;
    int perim;

    public Triangle(String name, String borderColor, String fillColor, int sizeA, int sizeB, int sizeC) {
        this.name = name;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeC = sizeC;
        perim = sizeA+sizeB+sizeC;
    }

    @Override
    public void square() {
        System.out.println("Площать треугольника "+ this.name+ " "+ sqrt(perim*(perim-sizeA)*(perim-sizeB)*(perim-sizeC)));
    }

    @Override
    public void perimeter() {
        System.out.println("Перимет треугольника "+ this.name + " "+ perim);
    }
}
