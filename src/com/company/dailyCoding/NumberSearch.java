package com.company.dailyCoding;

public class NumberSearch {
    public static void main(String[] args) {
        int output = numberSearch("Hello6 ");
        System.out.println(output); // --> 1

        output = numberSearch("Hello6 9World 2,");
        System.out.println(output); // --> 2

        output = numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output); // --> 2
    }
    public static int numberSearch(String str) {
        if (str.length() == 0) return 0;
        String trim = str.replace(" ", "");
        char[] chars = trim.toCharArray();
        double sum = 0;
        double charLength = 0;
        for (char c : chars) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            } else {
                charLength++;
            }
        }
        return (int) Math.round(sum / charLength);
    }
}
