package com.gogettergeeks.tree;

import java.util.Objects;

/**
 * Represents a node in the Binary Tree. It contains left and right of type TreeNode itself.
 */
public class TreeNode<T extends Comparable<T>> implements Comparable<TreeNode<T>> {
    private T value;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T value) {
        this.value = value;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    public TreeNode<T> getLeft() {
        return this.left;
    }

    public TreeNode<T> getRight() {
        return this.right;
    }

    public T value() {
        return this.value;
    }

    @Override
    public int compareTo(TreeNode<T> node) {
        return value.compareTo(node.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TreeNode)) return false;
        TreeNode<?> treeNode = (TreeNode<?>) o;
        return Objects.equals(value, treeNode.value);
    }
}
