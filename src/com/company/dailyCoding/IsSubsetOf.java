package com.company.dailyCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IsSubsetOf {
    public static void main(String[] args) {
        int[] base = new int[]{1, 2, 3, 4, 5};
        int[] sample = new int[]{1, 3};
        boolean output = isSubsetOf(base, sample);
        System.out.println(output); // --> true

        sample = new int[]{6, 7};
        output = isSubsetOf(base, sample);
        System.out.println(output); // --> false

        base = new int[]{10, 99, 123, 7};
        sample = new int[]{11, 100, 99, 123};
        output = isSubsetOf(base, sample);
        System.out.println(output); // --> false
    }

    public static boolean isSubsetOf(int[] base, int[] sample) {
        List<Integer> intList = Arrays.stream(base).boxed().collect(Collectors.toList());
        for (int i : sample) {
            if (!intList.contains(i)) return false;
        }
//        for (int i = 0; i < sample.length; i++) {
//            int finalI = i;
//            if (IntStream.of(base).noneMatch(x -> x == sample[finalI])) return false;
//        }
        return true;
    }
}
