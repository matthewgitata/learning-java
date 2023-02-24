package com.matthewgitata.learningjava.algorithms;

public class Algorithms {
    public static void main(String[] args) {
        Node rootNode = new Node();
        rootNode.data = 5;
        Node nodeTwo = new Node();
        nodeTwo.data = 2;
        Node nodeFour = new Node();
        nodeFour.data = 4;
        Node nodeNine = new Node();
        nodeNine.data = 9;
        Node nodeTen = new Node();
        nodeTen.data = 10;
        Node nodeSeven = new Node();
        nodeSeven.data = 7;

        rootNode.left = nodeTwo;
        rootNode.right = nodeFour;
        nodeTwo.left = nodeNine;
        nodeTwo.right = nodeTen;
        nodeFour.left = nodeSeven;

        BinaryTree tree = new BinaryTree();
        tree.root = rootNode;

        tree.preOrderTraversal();
        System.out.println();
        tree.inOrderTraversal();
        System.out.println();
        tree.postOrderTraversal();
    }
}