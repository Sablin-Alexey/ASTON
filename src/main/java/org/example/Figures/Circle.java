package org.example.Figures;

public class Circle implements Figure {
    String name;
    String borderColor;
    String fillColor;
    int radius;

    public Circle(String name, String borderColor, String fillColor, int radius) {
        this.name = name;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
        this.radius = radius;
    }

    @Override
    public void square() {
        System.out.println("Площать круга " + this.name + " " + 3.14 * radius * radius);
    }

    @Override
    public void perimeter() {
        System.out.println("Длинна окружности круга " + this.name + " " + 3.14 * radius * 2);
    }

    @Override
    public String toString() {
        return "Круг " + name + '\n' +
                "Цвет границ " + borderColor + '\n' +
                "Цвет заливки " + fillColor + '\n';
    }
}
