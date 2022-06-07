package com.company.dailyCoding;

import java.util.*;

public class queuePrinter {
    public static void main(String[] args) {
        int bufferSize = 2;
        int capacities = 10;
        int[] documents = new int[]{7, 4, 5, 6};
        int output = queuePrinter(bufferSize, capacities, documents);
        System.out.println("output = " + output);
    }
    public static int queuePrinter(int bufferSize, int capacities, int[] documents) {
        // TODO:
        // 1. queue 를 bufferSize 로 만든다.
        // 2. queue 에 순서대로 document 를 넣어준다.
        // 3. 1초를 올려준다.
        // 4. queue 에 다음 document 를 넣어주는데 capacities 랑 비교한다.
        // 5-1. queue 가 꽉 차 있다면 하나를 빼준다. 기존 queue 더한 것과 document 를 합친 것
        //    이 capacities 보다 작다면 document 추가.
        // 5-2 . 아니면 0 추가
        // 6. 1초를 올려준다.
        // 7. document 가 다 빌 때까지 루프를 돌린다.
        // 8. 마지막 초에다가 bufferSize 를 더한 값을 리턴한다.

/*        List<Integer> queue = new ArrayList<>(bufferSize);
        int sec = 1;
        queue.add(documents[0]);

        int sum = 0;
        if (queue.size() == bufferSize) queue.remove(0);

        while (true) {
            for (int i = 0; i < documents.length; i++) {
            sum = queue.stream().mapToInt(Integer::intValue).sum();
            if (queue.size() == bufferSize) queue.remove(0);
            if (sum + documents[i] <= capacities && i < documents.length - 1) queue.add(documents[i]);
            else queue.add(0);
            }
            sec++;
            if (sum == 0) break;;
        }
        return sec;*/
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;

        for (int i = 0; i < bufferSize; i++) {
            queue.add(0);
        }

        queue.poll();
        queue.add(documents[0]);
        documents = Arrays.copyOfRange(documents, 1, documents.length);
        count++;

        while (documents.length != 0 || queue.stream().mapToInt(Integer::intValue).sum() != 0) {
            if (documents.length != 0) {
                int sum = queue.stream().mapToInt(Integer::intValue).sum();
                if (sum + documents[0] > capacities) {
                    queue.poll();
                    sum = queue.stream().reduce(0, Integer::sum);
                    if (sum + documents[0] <= capacities) {
                        queue.add(documents[0]);
                        documents = Arrays.copyOfRange(documents, 1, documents.length);
                        count++;
                    } else {
                        queue.add(0);
                        count++;
                    }
                } else {
                    queue.poll();
                    queue.add(documents[0]);
                    documents = Arrays.copyOfRange(documents, 1, documents.length);
                    count++;
                }
            } else {
                queue.poll();
                queue.add(0);
                count++;
            }
        }
        return count;
    }
}
