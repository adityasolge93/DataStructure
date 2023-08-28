package com.gogettergeeks.backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

class KAryStringsTest {

    @Test
    public void testKAryStringsWithTwoCharactersAndThreeLength() {
        char[] characterSet = { 'a', 'b' };
        KAryStrings kAryStrings = new KAryStrings(characterSet, 3);
        List<String> actual = kAryStrings.generate();

        assertThat(actual,
            containsInAnyOrder(
        "[a, a, a]",
                "[a, a, b]",
                "[a, b, a]",
                "[a, b, b]",
                "[b, a, a]",
                "[b, a, b]",
                "[b, b, a]",
                "[b, b, b]"
            )
        );
    }
}