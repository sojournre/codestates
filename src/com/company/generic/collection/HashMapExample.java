package com.company.generic.collection;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        String str = "banana";
        HashMap<Character, Integer> hashMap = new HashMap<>();

        char[] ch = str.toCharArray();

        for (char c : ch) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }
        System.out.println("hashMap = " + hashMap);
//        for (int i = 0; i < ; i++) {
//
//        }
    }
}
