package com.company.abstraction;

abstract class Animal {
    public abstract void cry();
}
interface Pet {void play();}

class Dog extends Animal implements Pet {

    @Override
    public void cry() {
        System.out.println("멍멍!");
    }

    @Override
    public void play() {
        System.out.println("원반 던지기");
    }
}

class Cat extends Animal implements Pet {

    @Override
    public void cry() {
        System.out.println("야옹~!");
    }

    @Override
    public void play() {
        System.out.println("쥐 잡기");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.cry();
        dog.play();
        cat.cry();
        cat.play();
    }
}
