package com.company.algorithm;

public class Combination_boringBlackjack {
    public static void main(String[] args) {
        int[] cards = new int[]{2, 3, 4, 8, 13};
        int blackjack = boringBlackjack(cards);
        System.out.println("blackjack = " + blackjack);
    }
    public static int boringBlackjack(int[] cards) {
        // TODO:
        int count = 0;
        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                for (int k = j + 1; k < cards.length; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (isPrime(sum)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static boolean isPrime(int N) {
        if (N == 1) return false;
        else if (N == 2) {
            return true;
        } else if (N % 2 == 0) {
            return false;
        }
        int count = 0;
        for (int i = 3; i <= Math.sqrt(N); i += 2) {
            if (N % i == 0) {
                count++;
            }
        }
        return count == 0;
    }
}
