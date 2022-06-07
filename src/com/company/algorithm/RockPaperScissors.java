package com.company.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class RockPaperScissors {
    public static void main(String[] args) {
        ArrayList<String[]> rockPaperScissors = rockPaperScissors(5);
//        System.out.println("rockPaperScissors = " + rockPaperScissors);
    }
    public static ArrayList<String[]> rockPaperScissors(int rounds) {
        // TODO:
        String[] strings = new String[]{"rock", "paper", "scissors"};
        ArrayList<String[]> arrayList = new ArrayList<>();
        String[] result = new String[rounds];

        perm(strings, arrayList, result, 0, rounds);
//        for (String[] strings1 : arrayList) {
//            String s = Arrays.toString(strings1);
//            System.out.println(s);
//        }
        return arrayList;
    }

    static void perm(String[] arr, ArrayList<String[]> arrayList, String[] output, int depth, int n) {
        if (depth == n) {
            print(arrayList, output, n);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            output[depth] = arr[i];
            perm(arr, arrayList, output, depth + 1, n);
        }
    }

    private static void print(ArrayList<String[]> arrayList, String[] output, int n) {
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
//            System.out.print(output[i] + " ");
            strings[i] = output[i];
        }
//        arrayList.add(output);
        // 위의 경우, 전부 scissors 가 들어있는 리스트가 반환되는 오류 발생.
        // 참조 배열이기 때문에 마지막 output 의 값이 바뀌면 이미 arrayList에
        // add 된 값도 변경되기 때문

        arrayList.add(strings);
//        System.out.println();
    }
}
