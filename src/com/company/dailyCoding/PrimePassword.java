package com.company.dailyCoding;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class PrimePassword {
    public static void main(String[] args) {
        int output = primePassword(1033, 1033);
        System.out.println(output); // --> 0

        output = primePassword(3733, 8779);
        System.out.println(output); // --> 3 (3733 -> 3739 -> 3779 -> 8779)
    }

    public static int primePassword(int curPwd, int newPwd) {
        // TODO:
        if (curPwd == newPwd) return 0;
        Queue<int[]> queue = new LinkedList<>();

        boolean[] isVisited = new boolean[10000];
        isVisited[curPwd] = true;

        queue.offer(new int[]{0, curPwd});

        while (!queue.isEmpty()) {
            int[] data = queue.poll();
            int step = data[0];
            int num = data[1];

            for (int i = 0; i < 4; i++) {
                int[] digits = splitNumber(num);
                for (int j = 0; j < 10; j++) {
                    if (j != digits[i]) {
                        digits[i] = j;

                        int next = joinDigits(digits);
                        if (next == newPwd) return step + 1;
                        if (next > 1000 && isPrime(next) && !isVisited[next]) {
                            isVisited[next] = true;
                            queue.offer(new int[]{step + 1, next});
                        }
                    }
                }
            }
        }
        return -1;
    }

    private static int joinDigits(int[] digits) {
        String[] tempArr = new String[digits.length];

        for (int i = 0; i < digits.length; i++) {
            tempArr[i] = String.valueOf(digits[i]);
        }
        return Integer.parseInt(String.join("", tempArr));
    }

    private static int[] splitNumber(int num) {
        return Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
    }

    public static boolean isPrime(int n) {
        BigInteger bigInt = BigInteger.valueOf(n);
        return bigInt.isProbablePrime(100);
//        if (n <= 1) {
//            return false;
//        }
//        for (int i = 2; i < Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
    }
}
