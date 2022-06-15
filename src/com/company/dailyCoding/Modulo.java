package com.company.dailyCoding;

public class Modulo {
    public static void main(String[] args) {
        Integer output = modulo(25, 0);
        System.out.println(output); // --> 1
    }
    public static Integer modulo(int num1, int num2) {
        // TODO:
        if (num1 == 0) return 0;
        if (num2 == 0) return null;

        while (num1 >= num2) {
            num1 -= num2;
        }
        return num1;
    }
}
