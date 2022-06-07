package com.company.dailyCoding;

public class firstReverse {
    public static void main(String[] args) {
        String s = "codestates";
        String s1 = stringReverse(s);
        System.out.println("s1 = " + s1);
    }

    public static String stringReverse(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder reverse = stringBuilder.reverse();

        return String.valueOf(reverse);
    }
}
