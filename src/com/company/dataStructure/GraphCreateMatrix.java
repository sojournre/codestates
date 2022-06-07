package com.company.dataStructure;

import java.util.Arrays;

public class GraphCreateMatrix {
    public static void main(String[] args) {
        int[][] edges = {
                {0, 2, 0},
                {2, 4, 1},
                {1, 3, 1},
                {2, 1, 0},
        };
        Solution solution = new Solution();
        int[][] matrix = solution.createMatrix(edges);
        System.out.println("matrix = " + Arrays.deepToString(matrix));
    }
}

class Solution {
    public int[][] createMatrix(int[][] edges) {
        // TODO:
        int max = 0;
        for (int i = 0; i < edges.length; i++) {
            max = Math.max(max, Math.max(edges[i][0], edges[i][1]));
        }

        int[][] matrix = new int[max + 1][max + 1];
        for (int i = 0; i < edges.length; i++) {
                matrix[edges[i][0]][edges[i][1]] = 1;
            if (edges[i][2] == 1) {
                matrix[edges[i][1]][edges[i][0]] = 1;
            }
        }
        return matrix;
    }
}