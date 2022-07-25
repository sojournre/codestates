package com.company.dailyCoding;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] output = bubbleSort(new int[]{2, 1, 3});
        System.out.println(Arrays.toString(output)); // --> [1, 2, 3]        int[] output = bubbleSort(new int[]{2, 1, 3});
        output = bubbleSort(new int[]{5, 1, 4, 2, 8});
        System.out.println(Arrays.toString(output)); // --> [1, 2, 3]
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return arr;
    }
}
