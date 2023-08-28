package com.gogettergeeks.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic BinaryTree implementation which supports core Binary Tree operations like add, traversal, and deletion.
 * @param <T> The data-type of the values stored by the BinaryTree, for example, Integer, Double, etc.
 */
public class BinaryTree<T extends Comparable<T>> {
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
