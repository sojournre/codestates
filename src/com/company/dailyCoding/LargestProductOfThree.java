package com.company.dailyCoding;

public class LargestProductOfThree {
    public static void main(String[] args) {
//        int output = largestProductOfThree(new int[]{2, 1, 3, 7});
//        System.out.println(output); // --> 42 (= 2 * 3 * 7)

        int output = largestProductOfThree(new int[]{-1, 2, -5, 7});
        System.out.println(output); // --> 35 (= -1 * -5 * 7)
    }

    public static int largestProductOfThree(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int p3 = arr[i] * arr[j] * arr[k];
                    if (p3 > max) {
                        max = p3;
                    }
                }
            }
        }
        return max;
    }
}
