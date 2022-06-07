package com.company.dailyCoding;

public class firstCharacter {
    public static String firstCharacter(String str) {
        // TODO:
        String ans = "";
        String[] split = str.split(" ");
        for (String s : split) {
            ans += s.charAt(0);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "The community at Code States might be the biggest asset";
        String s = firstCharacter(str);
        System.out.println("s = " + s);
    }
}