package com.gogettergeeks.problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Question Link:
 *      <a href="https://www.geeksforgeeks.org/minimum-time-required-so-that-all-oranges-become-rotten/">
 *          Rotten Orange
 *      </a>
 */
public class RottenOrange {
    static class CoordinateAndTime {
        private int x;
        private int y;
        private int time;

        public CoordinateAndTime(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getTime() {
            return time;
        }
    }

    public int maxTimeToRot(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        Queue<CoordinateAndTime> rottenOrangeQueue = new LinkedList<>();
        for (int i=0; i < rows; i++) {
            for (int j=0; j < cols; j++) {
                if (arr[i][j] == 2) {
                    rottenOrangeQueue.add(new CoordinateAndTime(i, j, 0));
                }
            }
        }

        int time = -1;
        while (!rottenOrangeQueue.isEmpty()) {
            CoordinateAndTime currentRottenOrange = rottenOrangeQueue.poll();
            int x = currentRottenOrange.getX();
            int y = currentRottenOrange.getY();
            int currentTime = currentRottenOrange.getTime();
            if ((x -1) >=0 && arr[x-1][y] == 1) {
                arr[x-1][y] = 2;
                rottenOrangeQueue.add(new CoordinateAndTime(x-1, y, currentTime+1));
            }

            if ((x+1) < rows && arr[x+1][y] == 1) {
                arr[x+1][y] = 2;
                rottenOrangeQueue.add(new CoordinateAndTime(x+1, y, currentTime+1));
            }

            if ((y -1) >=0 && arr[x][y-1] == 1) {
                arr[x][y-1] = 2;
                rottenOrangeQueue.add(new CoordinateAndTime(x, y-1, currentTime+1));
            }

            if ((y+1) < cols && arr[x][y+1] == 1) {
                arr[x][y+1] = 2;
                rottenOrangeQueue.add(new CoordinateAndTime(x, y+1, currentTime+1));
            }

            if (currentTime > time) {
                time = currentTime;
            }
        }

        return time;
    }

    public static void main(String[] args) {
        int arr[][] = {
            { 2, 1, 0, 2, 1 },
            { 1, 0, 1, 2, 1 },
            { 1, 0, 0, 2, 1 }
        };

        RottenOrange rottenOrange = new RottenOrange();
        int time = rottenOrange.maxTimeToRot(arr);
        System.out.println(time);
    }
}
