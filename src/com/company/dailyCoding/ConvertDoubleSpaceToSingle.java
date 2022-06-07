package com.company.dailyCoding;

public class ConvertDoubleSpaceToSingle {
    public static void main(String[] args) {
        String str = "string  with  double  spaces";
        String s = convertDoubleSpaceToSingle(str);
        System.out.println("s = " + s);

    }
    public static String convertDoubleSpaceToSingle(String str) {
        // TODO:
        String replace = str.replace("  ", " ");

        return replace;
    }
}
