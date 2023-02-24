package com.matthewgitata.learningjava.algorithms;

public class BinarySearchTree {
    Node root;

    public void insert(int value) {
        insert(this.root, value);
    }

    private Node insert(Node root, int value) {
        if (root == null) {
            root = new Node();
            root.data = value;
        } else if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public boolean search(int value) {
        return search(this.root, value);
    }

    private boolean search(Node root, int value) {
        if (root != null) {
            if (root.data == value) {
                System.out.println("Value " + value + " found in BST!");
                return true;
            } else if (value < root.data) {
                return search(root.left, value);
            } else {
                return search(root.right, value);
            }
        }
        System.out.println("Value " + value + " not found in BST");
        return false;
    }
}