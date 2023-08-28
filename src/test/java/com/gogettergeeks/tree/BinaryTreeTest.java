package com.gogettergeeks.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

class BinaryTreeTest {
    private BinaryTree<Integer> binaryTree;

    @BeforeEach
    public void setup() {
        binaryTree = new BinaryTree<>();
        binaryTree.add(new TreeNode<>(8));
        binaryTree.add(new TreeNode<>(3));
        binaryTree.add(new TreeNode<>(10));
        binaryTree.add(new TreeNode<>(1));
        binaryTree.add(new TreeNode<>(6));
        binaryTree.add(new TreeNode<>(14));
        binaryTree.add(new TreeNode<>(4));
        binaryTree.add(new TreeNode<>(7));
        binaryTree.add(new TreeNode<>(13));
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

        List<Integer> actual = binaryTree.inOrder();
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

        List<Integer> actual = binaryTree.preOrder();
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

        List<Integer> actual = binaryTree.postOrder();
        assertThat(actual, contains(expected.toArray()));
    }
}