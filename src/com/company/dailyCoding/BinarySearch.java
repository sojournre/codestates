package com.company.dailyCoding;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int output = binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6}, 2);
        System.out.println(output); // --> 2

        output = binarySearch(new int[]{4, 5, 6, 9}, 100);
        System.out.println(output); // --> -1

    }

    public static int binarySearch(int[] arr, int target) {
        // TODO:
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
//        int search = Arrays.binarySearch(arr, target);
//        if (search < 0) {
//            search = -1;
//        }
//        return search;
    }
}
