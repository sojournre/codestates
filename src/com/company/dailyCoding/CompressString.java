package com.company.dailyCoding;

import java.util.InputMismatchException;

public class CompressString {
    public static void main(String[] args) {
        String output = compressString("dsafdasfffffsgaaaaabbbscccdd");
        System.out.println(output); // --> "abc"

        output = compressString("wwwggoppopppp");
        System.out.println(output); // --> "3wggoppo4p"
    }
    public static String compressString(String str) {
        if (str.length() == 0) return "";
        int count = 1;
        StringBuilder output = new StringBuilder();
        char last = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                count++;
            } else {
                if (count >= 3) {
                    output.append("").append(count).append(last);
                } else {
                    for (int j = 0; j < count; j++) {
                        output.append(last);
                    }
                }
                count = 1;
                last = str.charAt(i);
            }
        }
        if (count >= 3) {
            output.append("").append(count).append(last);
        } else {
            for (int i = 0; i < count; i++) {
                output.append(last);
            }
        }
        return output.toString();
    }
}
