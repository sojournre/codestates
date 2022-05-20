package com.company;

import java.util.Arrays;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class EnumExample {
    public static void main(String[] args) {
        Level level = Level.MEDIUM;

        switch(level) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

        System.out.println("level.ordinal() = " + level.ordinal());
        System.out.println("level.valueOf(\"LOW\") = " + level.valueOf("LOW"));
        System.out.println("level.values() = " + Arrays.toString(level.values()));

    }
}

@FunctionalInterface
interface Runnable {
    public abstract void run();

//    public abstract void walk();
}