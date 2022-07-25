package com.company.dailyCoding;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tiling {
    public static void main(String[] args) {
        int output = tiling(2);
        System.out.println(output); // --> 2

        output = tiling(4);
        System.out.println(output); // --> 5
    }

    public static int tiling(int num) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2));

//        list.add(0);
//        list.add(1);
//        list.add(2);

        return aux(num, list);
    }

    private static Integer aux(int num, List<Integer> list) {
        if (list.size() <= num) {
            list.add(aux(num - 1, list) + aux(num - 2, list));
        }
        return list.get(num);
    }
}
