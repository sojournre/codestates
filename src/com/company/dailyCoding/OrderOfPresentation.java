package com.company.dailyCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrderOfPresentation {
    public static void main(String[] args) {
        int output = orderOfPresentation(3, new int[]{2, 3, 1});
        System.out.println(output); // 3

        output = orderOfPresentation(5, new int[]{1, 3, 2, 4, 5});
        System.out.println(output); // 6
    }

    public static int orderOfPresentation(int N, int[] K) {
        int order = 0;
        boolean[] isUsed = new boolean[N + 1];

        for (int i = 0; i < K.length; i++) {
            int num = K[i];
            isUsed[num] = true;
            boolean[] candidates = Arrays.copyOfRange(isUsed, 1, num);
            int validCnt = 0;
            for (boolean candidate : candidates) {
                if (!candidate) validCnt++;
            }
            int formerCnt = validCnt * factorial(N - i - 1);
            order += formerCnt;
        }
        return order;
    }

    private static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
