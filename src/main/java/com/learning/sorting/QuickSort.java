package com.learning.sorting;

public class QuickSort {
    public int[] sort(int[] input) {
        quicksort(input, 0, input.length-1);

        return input;
    }

    private void quicksort(int[] input, int start, int end) {
        if (start > end) {
            return;
        }

        int partitionIndex = partition(input, start, end);
        quicksort(input, start, partitionIndex-1);
        quicksort(input, partitionIndex+1, end);
    }

    private int partition(int[] input, int start, int end) {
        int i = start;
        int j = end - 1;
        int pivot = input[end];

        while (i <= j) {
            if (input[j] < pivot) {
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
            } else {
                j--;
            }
        }

        int temp = input[end];
        input[end] = input[i];
        input[i] = temp;
        return i;
    }
}
