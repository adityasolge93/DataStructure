package com.gogettergeeks.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Generate all the strings of n bits. For example, if n is 2, then following will be all possible strings
 * 0 0
 * 0 1
 * 1 0
 * 1 1
 */
public class BinaryStrings {
    private int num;
    private int[] binaryNum;
    private List<String> generatedList;

    public BinaryStrings(int num) {
        this.num = num;
        binaryNum = new int[num];
        this.generatedList = new ArrayList<>();
    }
    public List<String> generate() {
        binary(this.num);
        return generatedList;
    }

    private void binary(int num) {
        if (num <= 0) {
            generatedList.add(Arrays.toString(binaryNum));
            return;
        }

        binaryNum[num-1] = 0;
        binary(num-1);
        binaryNum[num-1] = 1;
        binary(num-1);
    }
}
