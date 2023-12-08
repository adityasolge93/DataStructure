package com.gogettergeeks.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Generic BinaryTree implementation which supports core Binary Tree operations like add, traversal, and deletion.
 * @param <T> The data-type of the values stored by the BinaryTree, for example, Integer, Double, etc.
 */
public class BinarySearchTree<T extends Comparable<T>> {
    private TreeNode<T> root;
    private List<T> traverseList;

    public void add(TreeNode<T> node) {
        if (root == null) {
            root = node;
            return;
        }

        TreeNode<T> temp = root;
        while (true) {
            if (node.compareTo(temp) > 0) {
                if (temp.getRight() == null) {
                    temp.setRight(node);
                    break;
                } else {
                    temp = temp.getRight();
                }
            } else {
                if (temp.getLeft() == null) {
                    temp.setLeft(node);
                    break;
                } else {
                    temp = temp.getLeft();
                }
            }
        }
    }

    public List<T> inOrder() {
        traverseList = new ArrayList<>();
        traverseInOrder(this.root);
        return traverseList;
    }

    public List<T> preOrder() {
        traverseList = new ArrayList<>();
        traversePreorder(this.root);
        return traverseList;
    }

    public List<T> postOrder() {
        traverseList = new ArrayList<>();
        traversePostorder(this.root);
        return traverseList;
    }

    public List<T> breadthFirstTraversal() {
        traverseList = new ArrayList<>();

        if (root == null) {
            return traverseList;
        }

        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode<T> current = queue.poll();
            traverseList.add(current.value());

            if (current.getLeft() != null) {
                queue.add(current.getLeft());
            }

            if (current.getRight() != null) {
                queue.add(current.getRight());
            }
        }

        return traverseList;
    }

    public List<T> depthFirstTraversal() {
        traverseList = new ArrayList<>();

        if (root == null) {
            return traverseList;
        }

        Stack<TreeNode<T>> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode<T> current = stack.pop();
            traverseList.add(current.value());

            if (current.getLeft() != null) {
                stack.add(current.getLeft());
            }

            if (current.getRight() != null) {
                stack.add(current.getRight());
            }
        }

        return traverseList;
    }

    private void traverseInOrder(TreeNode<T> node) {
        if (node == null) {
            return;
        }

        traverseInOrder(node.getLeft());
        traverseList.add(node.value());
        traverseInOrder(node.getRight());
    }

    private void traversePreorder(TreeNode<T> node) {
        if (node == null) {
            return;
        }

        traverseList.add(node.value());
        traversePreorder(node.getLeft());
        traversePreorder(node.getRight());
    }

    private void traversePostorder(TreeNode<T> node) {
        if (node == null) {
            return;
        }

        traversePostorder(node.getLeft());
        traversePostorder(node.getRight());
        traverseList.add(node.value());
    }
}
