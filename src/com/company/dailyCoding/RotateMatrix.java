package com.company.dailyCoding;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int K = 1;

        System.out.println(matrix[0][0]); // --> 1
        System.out.println(matrix[3][2]); // --> 15

        int[][] rotatedMatrix = rotateMatrix(matrix, K);
        System.out.println(rotatedMatrix[0][0]); // --> 13
        System.out.println(rotatedMatrix[3][2]); // --> 8
    }

    public static int[][] rotateMatrix(int[][] matrix, int K) {
        // TODO:
        if (matrix == null) return null;
        int N = matrix.length;
        int M = matrix[0].length;

        int  numberOftimes = K % 4;
        if (numberOftimes == 0) return matrix;
        int[][] rotated = numberOftimes % 2 == 1 ? new int[M][N] : new int[N][M];

        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated[i].length; j++) {
                if (numberOftimes == 1) {
                    rotated[i][j] = matrix[N - j - 1][i];
                } else if (numberOftimes == 2) {
                    rotated[i][j] = matrix[N - i - 1][M - j - 1];
                } else {
                    rotated[i][j] = matrix[j][M - i - 1];
                }
            }
        }
//        for (int k = 0; k < K; k++) {
//            for (int i = 0; i < N / 2; i++) {
//                for (int j = i; j < N - i - 1; j++) {
//                    int temp = matrix[i][j];
//
//                    matrix[i][j] = matrix[N - 1 - j][i];
//                    matrix[N - 1 - j][i] = matrix[N - 1 - i][N - 1 - j];
//                    matrix[N - 1 - i][N - 1 - j] = matrix[j][N - 1 - i];
//                    matrix[j][N - 1 - i] = temp;
//                }
//            }
//        }
        return rotated;
    }
}
