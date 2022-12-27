package com.learning.sorting;

public class BubbleSort {
    public int[] sort(int[] input) {
        for (int end = input.length-1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (input[i] > input[i+1]) {
                    int temp = input[i];
                    input[i] = input[i+1];
                    input[i+1] = temp;
                }
            }
        }

        return input;
    }
}
