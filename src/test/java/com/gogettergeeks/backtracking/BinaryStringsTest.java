package com.gogettergeeks.backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

public class BinaryStringsTest {

    @Test
    public void testGenerateWith2Bits() {
        BinaryStrings binaryStrings = new BinaryStrings(2);
        List<String> actual = binaryStrings.generate();
        assertThat(actual, containsInAnyOrder("[0, 0]", "[0, 1]", "[1, 0]", "[1, 1]"));
    }
}
