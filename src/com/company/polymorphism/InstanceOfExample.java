package com.company.polymorphism;

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal instanceof Object);

        Animal cat = new Cat();
        Cat cat1 = (Cat) new Animal();
        System.out.println();
    }
}

class Animal {};
class Bat extends Animal {};
class Cat extends Animal {};
