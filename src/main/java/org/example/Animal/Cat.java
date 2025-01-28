package org.example.Animal;

import org.example.Main;

import static org.example.Main.bowl;

public class Cat extends Animals {
    boolean satiety;
    String name;

    public Cat(String name) {
        this.name = name;
        this.satiety = false;
        Main.numbOfCat++;
    }

    public String getName() {
        return this.name;
    }

    public boolean isSatiety() {
        return this.satiety;
    }

    public static void eat(Cat cat) {
        System.out.println("в миске " + bowl);
        if (bowl >= 20) {
            bowl = bowl - 20;
            cat.satiety = true;
            System.out.println("Кот " + cat.getName() + " поел");
        } else {
            System.out.println("Кот " + cat.getName() + " не поел");
        }
    }

    public static void satietyInfo(Cat cat) {
        if (cat.isSatiety()) {
            System.out.println("Кот " + cat.getName() + " сыт");
        } else {
            System.out.println("Кот " + cat.getName() + " голоден");
        }
    }

    @Override
    public void run(float distance) {
        if (distance > 200) {
            System.out.println(this.name + " пробежал 200 m");
        } else {
            System.out.println(this.name + " пробежал " + distance + " m");
        }
    }

    @Override
    public void swim(float distance) {
        System.out.println("Кот не умеет плавать");
    }
}
