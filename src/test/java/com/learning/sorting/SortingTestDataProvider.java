package com.learning.sorting;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Named;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class SortingTestDataProvider {

    protected static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(Named.of("Empty", ImmutableList.of()),
                        ImmutableList.of()),
                Arguments.of(Named.of("Single element", ImmutableList.of(10)),
                        ImmutableList.of(10)),
                Arguments.of(Named.of("All 0 element", ImmutableList.of(0, 0, 0, 0, 0)),
                        ImmutableList.of(0, 0, 0, 0, 0)),
                Arguments.of(Named.of("Sorted elements", ImmutableList.of(1, 2, 3, 4, 5)),
                        ImmutableList.of(1, 2, 3, 4, 5)),
                Arguments.of(Named.of("Reverse sorted elements", ImmutableList.of(5, 4, 3, 2, 1)),
                        ImmutableList.of(1, 2, 3, 4, 5)),
                Arguments.of(Named.of("All same elements", ImmutableList.of(10, 10, 10, 10, 10)),
                        ImmutableList.of(10, 10, 10, 10, 10)),
                Arguments.of(Named.of("Negative/Positive elements", ImmutableList.of(-1, -10, -3, 4, 9, 5, -2)),
                        ImmutableList.of(-10, -3, -2, -1, 4, 5, 9))
        );
    }
}
