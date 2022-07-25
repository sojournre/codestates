package com.company.dailyCoding;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] output = quickSort(new int[]{3, 1, 21});
        System.out.println(Arrays.toString(output)); // --> [1, 3, 21]
    }

    public static int[] quickSort(int[] arr) {
        // TODO:
        int lo = 0;
        int hi = arr.length - 1;
        aux(arr, lo, hi);
        return arr;
    }

    public static void aux(int[] arr, int lo, int hi) {
        if (lo < hi) {
            int pivot = partition(arr, lo, hi);
            aux(arr, lo, pivot - 1);
            aux(arr, pivot + 1, hi);
        }
    }

    public static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[hi];
        int left = lo;
        int temp;
        for (int right = lo; right < hi; right++) {
            if (arr[right] < pivot) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }
        temp = arr[left];
        arr[left] = arr[hi];
        arr[hi] = temp;

        return left;
    }
}
