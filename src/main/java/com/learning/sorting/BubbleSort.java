package com.learning.sorting;

/**
 * <b>Algorithm</b>
 *      <p>In BubbleSort, largest number is pushed to the bottom of the input in every iteration of the input set. It is
 *      done by comparing two numbers (starting from first and second element of the input array) and swapping them if
 *      first element is greater than the second one.</p>
 *
 * <b>Pseudo Code</b>
 *      1. For end=length-1, end>0, end--
 *      2.      for i=0; i<end; i++
 *      3.          if input[i] > input[i+1]
 *      4.              swap value at i and i+1
 *      5.          end if
 *      6.      end for
 *      7. end for
 */
public class BubbleSort {

    /**
     * Method for performing the sorting.
     *
     * @param input the input array to sort.
     * @return array with sorted values
     */
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
