package com.company.dailyCoding;

import java.util.*;

public class boxPacking {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.paveBoxRef(new Integer[]{5,1,4,6,1,2,3,4,5});
        System.out.println("i = " + i);

    }
}

class Solution {
    public int paveBox(Integer[] boxes) {
        // TODO:
        int maxCnt = 0;
        int count = 0;
        int max = boxes[0];
        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i] <= max) count++;
            else {
                max = boxes[i];
//                precnt = Math.max(precnt, count);
                count = 1;
            }
            maxCnt = Math.max(maxCnt, count);
        }
        return maxCnt;
    }

    public int paveBoxRef(Integer[] boxes) {
        ArrayList<Integer> answer = new ArrayList<>();
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(boxes));

        while (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) > arrayList.get(0)) {
                    answer.add(i);
                    arrayList = arrayList.subList(i, arrayList.size());
                    break;
                }
                if (i == arrayList.size() - 1) {
                    answer.add(arrayList.size());
                    arrayList.clear();
                }
            }
        }
        return answer.stream().max(Integer::compare).orElse(-1);
    }
}