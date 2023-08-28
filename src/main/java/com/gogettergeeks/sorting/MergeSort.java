package com.gogettergeeks.sorting;

/**
 * <b>Algorithm</b>
 *      <p>In MergeSort, the input array is divided into half until single elements are reached and then
 *      those elements are merged together such that resulting array is sorted. The process is repeated until
 *      the entire array is sorted.</p>
 *
 * <b>Pseudo Code: For diving the array into half using recursion</b>
 *      1. if (start >= end)
 *      2.      return;
 *      3. else
 *      4.      middle = start+end/2;
 *      5.      mergeSort(input, start, middle);
 *      6.      mergeSort(input, middle+1, end);
 *      7.      merge(input, start, middle, end);
 *
 * <b>Pseudo Code: For merging the sorted array</b>
 *      1.  int i=start, j=middle+1, k=0;
 *      2.  mergedArray = new array of size ((end - start)+1);
 *      3.  while (i <= middle && j <= end)
 *      4.      if (input[i] < input[j])
 *      5.          mergedArray[k] = input[i];
 *      6.          i++;
 *      7.      else
 *      8.          mergedArray[k] = input[j];
 *      9.          j++;
 *      10.     end else
 *      11.     k++;
 *      12. end while
 *      13. while (i <= middle)
 *      14.     mergedArray[k] = input[i];
 *      15.     k++; i++;
 *      16. end while
 *      17. while (j <= end)
 *      18.     mergedArray[j] = input[k];
 *      19.     k++; j++;
 *      20. end while
 *      21. for (i=0, j=start; i < mergedArray.length; i++, j++)
 *      22.     input[j] = mergedArray[i];
 *      23. end for
 *      24. return input;
 */
public class MergeSort {

    /**
     * Method for performing the sorting.
     *
     * @param input the input array to sort.
     * @return array with sorted values
     */
    public int[] sort(int[] input) {
        mergeSort(input, 0, input.length-1);
        return input;
    }

    private void mergeSort(int[] input, int start, int end) {
        if (start >= end) {
            return;
        }
        int middle = (start + end)/2;
        mergeSort(input, start, middle);
        mergeSort(input, middle+1, end);
        merge(input, start, middle, end);
    }

    private int[] merge(int[] input, int start, int middle, int end) {
        int i=start, j=middle+1, k=0;
        int[] mergedArray = new int[(end - start) + 1];
        while (i <= middle && j <= end) {
            if (input[i] < input[j]) {
                mergedArray[k] = input[i];
                i++;
            } else {
                mergedArray[k] = input[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            mergedArray[k] = input[i];
            i++;
            k++;
        }

        while (j <= end) {
            mergedArray[k] = input[j];
            j++;
            k++;
        }

        for (i=0, j=start; i<mergedArray.length; i++, j++) {
            input[j] = mergedArray[i];
        }

        return input;
    }
}
