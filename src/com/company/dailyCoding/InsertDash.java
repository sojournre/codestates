package com.company.dailyCoding;

public class InsertDash {
    public static void main(String[] args) {
        String output = insertDash("454793");
        System.out.println("output = " + output);
    }
    public static String insertDash(String str) {
        // TODO:
        if (str.length() == 0) return null;
        int j = 0;
        String result = "" + str.charAt(0);
        StringBuffer stringBuffer = new StringBuffer(str);
        for (int i = 1; i < str.length(); i++) {
            int c1 = str.charAt(i - 1) - '0';
            int c2 = str.charAt(i) - '0';
            if (c1 % 2 == 1 && c2 % 2 == 1) {
                stringBuffer.insert(i + j, '-');
                j++;
            }
        }
        return String.valueOf(stringBuffer);

        // Reference
//        if(str.length() == 0) {
//            return null;
//        }
//        String result = "" + str.charAt(0);
//
//        for(int i = 1; i < str.length(); i++) {
//            int preNumber = Character.getNumericValue(str.charAt(i - 1));
//            int curNumber = Character.getNumericValue(str.charAt(i));
//            if(preNumber % 2 != 0 && curNumber % 2 != 0) {
//                result = result + "-";
//            }
//            result = result + str.charAt(i);
//        }
//        return result;
    }
}
