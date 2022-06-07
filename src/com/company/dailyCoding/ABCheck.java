package com.company.dailyCoding;

public class ABCheck {
    public static void main(String[] args) {
        boolean output = ABCheck("TgDrnjAz6kAbdEaxFkrKIsa");
        System.out.println("output = " + output);
    }

    public static boolean ABCheck(String str) {
        // TODO:
        String lowerCase = str.toLowerCase();
        for (int i = 0; i < lowerCase.length(); i++) {
            if (lowerCase.charAt(i) == 'a') {
                if (i + 4 < lowerCase.length() && lowerCase.charAt(i + 4) == 'b') return true;
            } else if (lowerCase.charAt(i) == 'b'){
                if (i + 4 < lowerCase.length() && lowerCase.charAt(i + 4) == 'a') return true;
            }
        }
        return false;
    }
}
