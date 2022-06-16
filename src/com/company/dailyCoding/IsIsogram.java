package com.company.dailyCoding;

import java.util.Arrays;
import java.util.stream.Stream;

public class IsIsogram {
    public static void main(String[] args) {
        boolean output = isIsogram("aba");
        System.out.println(output); // false
    }
    public static boolean isIsogram(String str) {
        // TODO:
        if (str.length() == 0) return true;

        char[] chars = str.toLowerCase().toCharArray();
        Arrays.sort(chars);

        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) return false;
        }
        return true;
    }
}
