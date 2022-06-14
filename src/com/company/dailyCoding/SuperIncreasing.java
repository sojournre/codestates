package com.company.dailyCoding;

public class SuperIncreasing {
    public static void main(String[] args) {
        boolean output = superIncreasing(new int[]{1, 3, 6, 13, 54});
        System.out.println(output); // --> true
    }
    public static boolean superIncreasing(int[] arr) {
        // TODO:
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
            if (arr[i + 1] <= sum) {
                return false;
            }
        }
        return true;
    }
}
