package com.company.dailyCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PowerSet {
    public static void main(String[] args) {
        ArrayList<String> output1 = powerSet("abc");
        System.out.println(output1); // ["", "a", "ab", "abc", "ac", "b", "bc", "c"]

        ArrayList<String> output2 = powerSet("jjump");
        System.out.println(output2); // ["", "j", "jm", "jmp", "jmpu", "jmu", "jp", "jpu", "ju", "m", "mp", "mpu", "mu", "p", "pu", "u"]
    }

    public static ArrayList<String> powerSet(String str) {
        ArrayList<String> list = new ArrayList<>();
        String[] split = str.split("");
        String strings = Arrays.stream(split).distinct().sorted().collect(Collectors.joining());

        dfs(list, strings, 0, "");

        return list;
    }

    public static void dfs(ArrayList<String> list, String str, int index, String path) {
        list.add(path);

        for (int i = index; i < str.length(); i++) {
            dfs(list, str, i + 1, path + str.charAt(i));
        }
    }
}
