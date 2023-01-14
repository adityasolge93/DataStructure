package com.learning.sorting;

import java.util.Arrays;

/**
 * <b>Algorithm</b>
 *      <p>In SelectionSort, on every iteration, minimum value element is identified and swapped with element
 *      in the beginning. With every iteration, the elements in the front are sorted and remaining array
 *      is the unsorted array.</p>
 *
 * <b>Pseudo Code</b>
 *      1.  int i=0;
 *      2.  while (i < input.length-1)
 *      3.      int j=i+1, minIndex = i;
 *      4.      while (j < input.length)
 *      5.          if (input[j] < input[minIndex])
 *      6.              minIndex = j;
 *      7.          end if
 *      8.          swap (input[i], input[minIndex])
 *      9.          i++;
 *      10.     end while
 *      11. end while
 */
public class SelectionSort {

    public int[] sort(int[] input) {
        int i=0;
        while (i < input.length-1) {
            System.out.println(Arrays.toString(input));
            int j = i+1;
            int minIndex = i;
            while (j < input.length) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
                j++;
            }

            int temp = input[i];
            input[i] = input[minIndex];
            input[minIndex] = temp;
            i++;
        }

        return input;
    }
}
