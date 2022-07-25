package com.company.dailyCoding;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] output = radixSort(new int[]{3, 1, 21});
        System.out.println(Arrays.toString(output)); // --> [1, 3, 21]
    }

    public static int[] radixSort(int[] arr) {
        // TODO:
        int n = arr.length;
        int m = getMax(arr, n);

        for (int exp = 1; m / exp > 0 ; exp *= 10) {
            countSort(arr, n, exp);
        }
        return arr;
    }

    static int getMax(int[] arr, int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static void countSort(int[] arr, int n, int exp) {
        int[] output = new int[n];
        int i;
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (int j = 0; j < n; j++) {
            count[(arr[j] / exp) % 10]++;
        }

        for (int j = 1; j < 10; j++) {
            count[j] += count[j - 1];
        }

        for (int j = n - 1; j >= 0; j--) {
            output[count[(arr[j] / exp) % 10] - 1] = arr[j];
            count[(arr[j] / exp) % 10]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
    }
}
