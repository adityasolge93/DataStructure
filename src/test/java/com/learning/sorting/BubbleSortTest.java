package com.learning.sorting;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class BubbleSortTest {

    @ParameterizedTest
    @MethodSource("testData")
    public void sort_sortsTheInput(List<Integer> input, List<Integer> expected) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] actual = bubbleSort.sort(input.stream().mapToInt(i->i).toArray());

        assertThat(actual, is(expected.stream().mapToInt(i->i).toArray()));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(ImmutableList.of(), ImmutableList.of()),
                Arguments.of(ImmutableList.of(10), ImmutableList.of(10)),
                Arguments.of(ImmutableList.of(0, 0, 0, 0, 0), ImmutableList.of(0, 0, 0, 0, 0)),
                Arguments.of(ImmutableList.of(1, 2, 3, 4, 5), ImmutableList.of(1, 2, 3, 4, 5)),
                Arguments.of(ImmutableList.of(5, 4, 3, 2, 1), ImmutableList.of(1, 2, 3, 4, 5)),
                Arguments.of(ImmutableList.of(10, 10, 10, 10, 10), ImmutableList.of(10, 10, 10, 10, 10)),
                Arguments.of(ImmutableList.of(-1, -10, -3, 4, 9, 5, -2), ImmutableList.of(-10, -3, -2, -1, 4, 5, 9))
        );
    }
}