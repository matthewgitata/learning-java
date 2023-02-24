package com.matthewgitata.learningjava.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    public void preOrderTraversal() {
        preOrderTraversal(this.root);
    }

    private void preOrderTraversal(Node root) {
        if (root == null) {
            System.out.println("Empty Binary Tree!");
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            System.out.print(currentNode.data + " ");
            if (currentNode.left != null) {
                preOrderTraversal(currentNode.left);
            }
            if (currentNode.right != null) {
                preOrderTraversal(currentNode.right);
            }
        }
    }

    public void inOrderTraversal() {
        inOrderTraversal(this.root);
    }

    private void inOrderTraversal(Node root) {
        if (root == null) {
            System.out.println("Empty Binary Tree!");
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            if (currentNode.left != null) {
                inOrderTraversal(currentNode.left);
            }
            System.out.print(currentNode.data + " ");
            if (currentNode.right != null) {
                inOrderTraversal(currentNode.right);
            }
        }
    }

    public void postOrderTraversal() {
        postOrderTraversal(this.root);
    }

    private void postOrderTraversal(Node root) {
        if (root == null) {
            System.out.println("Empty Binary Tree!");
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            if (currentNode.left != null) {
                postOrderTraversal(currentNode.left);
            }
            if (currentNode.right != null) {
                postOrderTraversal(currentNode.right);
            }
            System.out.print(currentNode.data + " ");
        }
    }


}