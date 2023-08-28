package com.gogettergeeks.sorting;

/**
 * <b>Algorithm</b>
 *      <p>In QuickSort, pivot element is chosen (it can be any element but usually first or last or middle element is
 *      chosen as the pivot), and then the pivot is placed in its original place by putting all smaller elements to its
 *      left and all greater elements to its right. The array is then divided into two arrays of smaller elements and
 *      greater elements and the same procedure is applied on both the arrays.</p>
 *
 * <b>Pseudo Code: For putting pivot in its original position</b>
 *      1.  int i=startIndex, j=endIndex-1, pivot=last element of the array
 *      2.  while (i <= j)
 *      3.      if (input[j] < pivot)
 *      4.          swap (i, j)
 *      5.          i++
 *      5.      else
 *      6.          j--
 *      7.  end while
 *      8.  swap (i, pivot)
 *      10. Return i as the Paritition Point.
 *
 * <b>Pseudo Code: Recursive sorting</b>
 *      1. if (startIndex > endIndex)
 *      2.      return;
 *      3. int partitionIndex = partition(input, start, end);
 *      4. quicksort(input, startIndex, partitionIndex-1);
 *      5. quicksort(input, partitionIndex+1, endIndex);
 */
public class QuickSort {

    /**
     * Method for performing the sorting.
     *
     * @param input the input array to sort.
     * @return array with sorted values
     */
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
