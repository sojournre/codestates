package com.company.algorithm;

import java.util.ArrayList;

public class GCD_divideChocolateStick {
    public ArrayList<Integer[]> divideChocolateStick(int M, int N) {
        // TODO:

        return null;
    }

    public int[] commonDivisor(int a, int b) {
        int[] div1 = divisor(a);
        return div1;
    }

    private int[] divisor(int a) {
        int size = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                size++;
            }
        }

        int[] div = new int[size];
        int count = 0;

        for (int i = 1; i <= a; i++) {

        }
        return div;
    }
}
