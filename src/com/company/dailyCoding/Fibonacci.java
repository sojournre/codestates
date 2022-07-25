package com.company.dailyCoding;

import java.security.PublicKey;
import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        int output = fibonacci(0);
        System.out.println(output); // --> 0

        output = fibonacci(1);
        System.out.println(output); // --> 1

        output = fibonacci(5);
        System.out.println(output); // --> 5

        output = fibonacci(9);
        System.out.println(output); // --> 34
    }
    public static int fibonacci(int num) {
        ArrayList<Integer> memo = new ArrayList<>();
        memo.add(0);
        memo.add(1);

        return aux(memo, num);

//        int[] fib = new int[num + 1];
//        if (num == 0) {
//            fib[0] = 0;
//            return 0;
//        }
//        if (num == 1) {
//            fib[num] = 1;
//            return 1;
//        }
//
//        if (fib[num] == 0) {
//            fib[num] = fibonacci(num - 1) + fibonacci(num - 2);
//            return fib[num];
//        } else {
//            return fib[num];
//        }
    }

    public static int aux(ArrayList<Integer> memo, int num) {
        if (memo.size() <= num) {
            memo.add(aux(memo, num - 1) + aux(memo, num - 2));
        }
        return memo.get(num);
    }
}
