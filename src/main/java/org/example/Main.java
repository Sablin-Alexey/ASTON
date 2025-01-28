package org.example;

import org.example.Animal.Animals;
import org.example.Animal.Cat;
import org.example.Animal.Dog;
import org.example.Figures.Circle;
import org.example.Figures.Square;
import org.example.Figures.Triangle;


import static org.example.Animal.Cat.eat;
import static org.example.Animal.Cat.satietyInfo;

public class Main {
    public static int numbOfCat = 0;
    public static int numbOfDog = 0;
    public static int numbOfAnimals = 0;
    public static int bowl;

    public static void feed(int val) {
        bowl = val;
        System.out.println("насыпал корм в миску, сейчас в ней " + bowl + " корма");
    }
    public static void main(String[] args) {
        feed(100);
        Animals dog = new Dog("бобик");
        Cat[] cat = new Cat[6];
        cat[0] = new Cat("барсик");
        cat[1] = new Cat("марсик");
        cat[2] = new Cat("борис");
        cat[3] = new Cat("мурзик");
        cat[4] = new Cat("мистер кот");
        cat[5] = new Cat("Супер кот");

        for (int i = 0; i < cat.length; i++) {
            eat(cat[i]);
        }
        for (int i = 0; i < cat.length; i++) {
            satietyInfo(cat[i]);
        }
        dog.run(250);
        dog.swim(25);
        cat[0].swim(100);
        cat[0].run(100);
        System.out.println("Создано животных " + numbOfAnimals + '\n' +
                "Создано Собак " + numbOfDog + '\n' +
                "Создано Кошек " + numbOfCat + '\n');

        Square square = new Square("sqare1","green", "blue", 3);
        Circle circle = new Circle("circle1","red", "black", 6);
        Triangle triangle = new Triangle("triangle1","white", "red", 4,5,6);
        square.square();
        square.perimeter();
        circle.perimeter();
        circle.square();
        triangle.perimeter();
        triangle.square();
    }
}
