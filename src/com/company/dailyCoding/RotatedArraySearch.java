package com.company.dailyCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RotatedArraySearch {
    public static void main(String[] args) {
        int output = rotatedArraySearch(new int[]{4, 5, 6, 0, 1, 2, 3}, 2);
        System.out.println(output); // --> 5

        output = rotatedArraySearch(new int[]{4, 5, 6, 0, 1, 2, 3}, 100);
        System.out.println(output); // --> -1

        output = rotatedArraySearch(new int[]{10, 11, 12, 3, 6, 7, 8, 9}, 11);
        System.out.println(output); // --> 1
    }

    public static int rotatedArraySearch(int[] rotated, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < rotated.length; i++) {
//            map.put(i, rotated[i]);
//        }
//        int index = Arrays.binarySearch(rotated, target);
//        return index >= 0 ? index : -1;
        int index = -1;
        int high = rotated.length - 1;
        int low = 0;
        while (high >= low) {
            int mid = low + (high - low) / 2;
            if (rotated[mid] == target) {
                return mid;
            }
            if (rotated[low] < rotated[mid]) {
                if (target < rotated[mid] && rotated[low] <= target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target <= rotated[high] && rotated[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return index;
    }
}
