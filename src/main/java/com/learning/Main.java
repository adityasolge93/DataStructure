package com.learning;

import com.learning.sorting.BubbleSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] input = { 89, 68, 27, 12, 27, 67, 62, 87, 50, 35};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sorted = bubbleSort.sort(input);

        Arrays.stream(sorted)
                .forEach(i -> System.out.print(i + ", "));
    }
}
