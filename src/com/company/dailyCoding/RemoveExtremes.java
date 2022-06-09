package com.company.dailyCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveExtremes {
    public static void main(String[] args) {
        String[] output = removeExtremes(new String[]{"a", "b", "c", "def"});
//        String[] output = removeExtremes(new String[]{"where", "is", "the", "longest", "word"});
        System.out.println(Arrays.toString(output)); // --> ["a"', "b"]
    }
    public static String[] removeExtremes(String[] arr) {
        // TODO:
        if (arr.length == 0) return null;
        int maxLength = arr[0].length();
        int maxIndex = 0;
        int minLength = arr[0].length();
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            int length = arr[i].length();
            if (length >= maxLength) {
                maxLength = length;
                maxIndex = i;
            }
            if (length <= minLength) {
                minLength = length;
                minIndex = i;
            }
        }
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        if (maxIndex > minIndex) {
            list.remove(maxIndex);
            list.remove(minIndex);
        } else {
            list.remove(minIndex);
            list.remove(maxIndex);
        }

        return list.toArray(new String[0]);
    }
}
