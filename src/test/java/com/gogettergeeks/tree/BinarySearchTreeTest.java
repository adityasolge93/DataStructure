package com.gogettergeeks.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

class BinarySearchTreeTest {
    private BinarySearchTree<Integer> binarySearchTree;

    @BeforeEach
    public void setup() {
        binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(new TreeNode<>(8));
        binarySearchTree.add(new TreeNode<>(3));
        binarySearchTree.add(new TreeNode<>(10));
        binarySearchTree.add(new TreeNode<>(1));
        binarySearchTree.add(new TreeNode<>(6));
        binarySearchTree.add(new TreeNode<>(14));
        binarySearchTree.add(new TreeNode<>(4));
        binarySearchTree.add(new TreeNode<>(7));
        binarySearchTree.add(new TreeNode<>(13));
    }

    @Test
    public void inOrderReturnsListOfExpectedValueInOrder() {
        List<Integer> expected = new ArrayList<Integer>() {{
            add(1);
            add(3);
            add(4);
            add(6);
            add(7);
            add(8);
            add(10);
            add(13);
            add(14);
        }};

        List<Integer> actual = binarySearchTree.inOrder();
        assertThat(actual, contains(expected.toArray()));
    }

    @Test
    public void preOrderReturnsListOfExpectedValueInOrder() {
        List<Integer> expected = new ArrayList<Integer>() {{
            add(8);
            add(3);
            add(1);
            add(6);
            add(4);
            add(7);
            add(10);
            add(14);
            add(13);
        }};

        List<Integer> actual = binarySearchTree.preOrder();
        assertThat(actual, contains(expected.toArray()));
    }

    @Test
    public void postOrderReturnsListOfExpectedValueInOrder() {
        List<Integer> expected = new ArrayList<Integer>() {{
            add(1);
            add(4);
            add(7);
            add(6);
            add(3);
            add(13);
            add(14);
            add(10);
            add(8);
        }};

        List<Integer> actual = binarySearchTree.postOrder();
        assertThat(actual, contains(expected.toArray()));
    }

    @Test
    public void breadthFirstTraversalReturnsListOfExpectedValues() {
        List<Integer> expected = new ArrayList<Integer>() {{
            add(8);
            add(3);
            add(10);
            add(1);
            add(6);
            add(14);
            add(4);
            add(7);
            add(13);
        }};

        List<Integer> actual = binarySearchTree.breadthFirstTraversal();
        assertThat(actual, contains(expected.toArray()));
    }

    @Test
    public void depthFirstTraversalReturnsListOfExpectedValues() {
        List<Integer> expected = new ArrayList<Integer>() {{
            add(8);
            add(10);
            add(14);
            add(13);
            add(3);
            add(6);
            add(7);
            add(4);
            add(1);
        }};

        List<Integer> actual = binarySearchTree.depthFirstTraversal();
        actual.forEach(System.out::println);
        assertThat(actual, contains(expected.toArray()));
    }
}