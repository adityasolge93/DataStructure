package com.gogettergeeks.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of characters and a positive integer k, print all possible strings of length k that can be formed
 * from the given set. For example, if set of characters are ['a', 'b'] and k is 3, then following is the output
 * [a, a, a]
 * [a, a, b]
 * [a, b, a]
 * [a, b, b]
 * [b, a, a]
 * [b, a, b]
 * [b, b, a]
 * [b, b, b]
 */
public class KAryStrings {
    private List<String> generated;

    private char[] str;
    private int k;
    private char[] characterSet;

    public KAryStrings(char[] characterSet, int k) {
        this.characterSet = characterSet;
        this.k = k;
        str = new char[k];
        generated = new ArrayList<>();
    }

    public List<String> generate() {
        kAry(characterSet, k);
        return generated;
    }

    private void kAry(char[] characterSet, int k) {
        if (k <= 0) {
            generated.add(Arrays.toString(str));
            return;
        }

        for (int i=0; i < characterSet.length; i++) {
            str[k-1] = characterSet[i];
            kAry(characterSet, k-1);
        }
    }
}
