package com.learning;

import com.learning.sorting.BubbleSort;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Main main = new Main();
            main.sortDriver();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private void sortDriver() throws IOException {
        String fileName = Objects.requireNonNull(
                this.getClass().getClassLoader().getResource("random-numbers.txt")
        ).getFile();

        List<Integer> data = new ArrayList<>();
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNextInt()) {
            data.add(scanner.nextInt());
        }

        int[] input = data.stream().mapToInt(Integer::intValue).toArray();
        BubbleSort bubbleSort = new BubbleSort();
        int[] sorted = bubbleSort.sort(input);

        System.out.println(Arrays.toString(sorted));
    }
}
