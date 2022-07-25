package com.company.dailyCoding;

public class Power {
    public static void main(String[] args) {
        long output = power(3, 40);
        System.out.println(output); // --> 19334827
    }

    public static long power(int base, int exponent) {
        long mul = 0L;
        if (exponent == 0) return 1L;
        long temp = power(base, exponent / 2);
        if (exponent % 2 == 0) {
            mul = temp * temp;
        } else {
            mul = base * temp * temp;
        }
        mul = mul % 94906249;

//        long mul = 0L;
//        if (exponent == 0) return 1L;
//        mul = base * power(base, exponent - 1);
//        mul = mul % 94906249;
//        return mul;
        return mul;
    }
}
