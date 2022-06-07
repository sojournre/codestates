package com.company.dailyCoding;

import java.util.Scanner;

public class computeWhenDouble {
    public static int compute(double interestRate) {
        int year = 0;
        double rate = (1 + interestRate / 100);
        while (true) {
            double result = Math.pow(rate, year);
            if (result >= 2) break;
            year++;
        }
        
//        if () {
//
//        } else if () {
//
//        }

        return year;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ir = scanner.nextDouble();

        System.out.println("compute(ir) = " + compute(ir));
    }
}
