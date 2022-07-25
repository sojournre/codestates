package com.company.dailyCoding;

import java.util.LinkedList;
import java.util.Queue;

public class RobotPath {
    public static void main(String[] args) {
        int[][] room = new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 1, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 0}
        };
        int[] src = new int[]{4, 2};
        int[] dst = new int[]{2, 2};
        int output = robotPath(room, src, dst);
        System.out.println(output); // --> 8
    }

    static class Position {
        int x, y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        boolean isValid(int width, int height) {
            if (x < 0 || x >= width) return false;
            if (y < 0 || y >= height) return false;
            return true;
        }
    }

    public static int robotPath(int[][] room, int[] src, int[] dst) {
        int roomHeight = room.length;
        int roomWidth = room[0].length;

        Queue<Position> queue = new LinkedList<>();
        int[][] count = new int[roomHeight][roomWidth];
        boolean[][] visited = new boolean[roomHeight][roomWidth];

        queue.offer(new Position(src[1], src[0]));
        count[src[0]][src[1]] = 0;
        visited[src[0]][src[1]] = true;

        while (!queue.isEmpty()) {
            Position current = queue.poll();

            int currentCount = count[current.y][current.x];

            final int[][] moving = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
            for (int i = 0; i < moving.length; i++) {
                Position moved = new Position(current.x + moving[i][0], current.y + moving[i][1]);
                if (!moved.isValid(roomWidth, roomHeight)) continue;
                if (visited[moved.y][moved.x]) continue;
                if (room[moved.y][moved.x] == 1) continue;  // 1: 장애물, 0: 통로

                count[moved.y][moved.x] = currentCount + 1;
                visited[moved.y][moved.x] = true;
                queue.offer(moved);
            }
        }

        int answer = count[dst[0]][dst[1]];
        if (answer == 0) return -1;

        return answer;
    }
}
