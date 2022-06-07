package com.company.dailyCoding;

import java.util.Arrays;

public class LetterCapitalize {
    public static void main(String[] args) {
        String str = "nEVER  gIVE uP";
        String letterCapitalize = letterCapitalize(str);
        System.out.println("letterCapitalize = " + letterCapitalize);
    }

    public static String letterCapitalize(String str) {
        // TODO:
        if (str.length() == 0) return "";
        String[] split = str.split(" ");

        for (int i = 0; i < split.length; i++) {
            if (!split[i].isEmpty()) {
                split[i] = Character.toUpperCase(split[i].charAt(0)) + split[i].substring(1);
            }

        }

//        String[] strings = Arrays.stream(split)
//                .forEach(s -> {
//                    if (s.)
//                })
//                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
//                .toArray(String[]::new);
        String joinStr = String.join(" ", split);

        return joinStr;
    }
}
