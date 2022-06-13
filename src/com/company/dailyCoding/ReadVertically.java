package com.company.dailyCoding;

import java.util.Arrays;

public class ReadVertically {
    public static void main(String[] args) {
        String[] input = new String[]{
                "hi",
                "wolrd",
        };
        String output = readVertically(input);
        System.out.println(output); // --> "hweolllrod"

    }
    public static String readVertically(String[] arr) {
        // TODO:
        int row, col, max = 0;
        String rv = "";
        row = arr.length;

        for (String s : arr) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        col = max;

        char[][] arr2 = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j < arr[i].length()) {
                    arr2[i][j] = arr[i].charAt(j);
                } else {
                    arr2[i][j] = '0';
                }
            }
        }
        System.out.println("Arrays.deepToString(arr2) = " + Arrays.deepToString(arr2));

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (arr2[j][i] != '0') {
                    rv += arr2[j][i];
                }
            }
        }
//        rv = rv.trim();

        return rv;
    }
}
