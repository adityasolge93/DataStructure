package com.learning.sorting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class QuickSortTest {

    @ParameterizedTest
    @MethodSource("com.learning.sorting.SortingTestDataProvider#testData")
    public void sort_sortsTheInput(List<Integer> input, List<Integer> expected) {
        QuickSort quickSort = new QuickSort();
        int[] actual = quickSort.sort(input.stream().mapToInt(i->i).toArray());

        assertThat(actual, is(expected.stream().mapToInt(i->i).toArray()));
    }
}