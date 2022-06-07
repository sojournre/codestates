package com.company.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class GraphGetDirections {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[][] matrix = {
                {0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 1, 1, 0, 0},
                {0, 1, 1, 0, 0},
                {1, 1, 1, 1, 0}
        };
        int from = 1;
        int to = 4;
        boolean directions = solution1.getDirections(matrix, from, to);
        System.out.println("directions = " + directions);
    }
}

class Solution1 {
    public boolean getDirections(int[][] matrix, int from, int to) {
        // TODO:
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.add(from);
        visited[from] = true;

        while (!queue.isEmpty()) {
            int row = queue.poll();

            for (int i = 0; i < matrix[row].length; i++) {
                if (matrix[row][i] == 1 && !visited[i] && row != i) {
                    queue.add(i);
                    visited[i] = true;
                    if (i == to) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

