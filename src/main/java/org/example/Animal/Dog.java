package org.example.Animal;

import org.example.Main;

public class Dog extends Animals {
    String name;

    public Dog(String name) {
        this.name = name;
        Main.numbOfDog++;
    }

    @Override
    public void run(float distance) {
        if (distance > 500) {
            System.out.println(this.name + " пробежал 500 m");
        } else {
            System.out.println(this.name + " пробежал " + distance + " m");
        }
    }

    @Override
    public void swim(float distance) {
        if (distance >= 10) {
            System.out.println(this.name + " проплыл 10 m");
        } else {
            System.out.println(this.name + " проплыл " + distance + " m");
        }
    }
}
