package com.company.dailyCoding;

import java.util.HashMap;

public class ConvertListToObject {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"make", "Ford"},
                {"model", "Mustang"},
                {"year", "1964"},
                {"make", "Bill"},
        };

        HashMap<String, String> listToHashMap = convertListToHashMap(arr);
        System.out.println("listToHashMap.toString() = " + listToHashMap.toString());
    }

    public static HashMap<String, String> convertListToHashMap(String[][] arr) {
        // TODO:
        HashMap<String, String> hashMap = new HashMap<>();

        if (arr.length == 0) return hashMap;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 0 && !hashMap.containsKey(arr[i][0])) {
                hashMap.put(arr[i][0], arr[i][1]);
            }
        }
        return hashMap;
    }
}
