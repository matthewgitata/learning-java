package com.matthewgitata.learningjava.linkedlist;

public class LinkedList {
    private Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public Node search(int value){
        Node current = this.head;
        while (current != null) {
            if (current.getData() == value) {
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }

    public int length() {
        int count = 0;
        Node current = this.head;
        while (current != null) {
            count++;
            current=current.getNextNode();
        }
        return count;
    }

    public void deleteHeadNode() {
        this.head = this.head.getNextNode();
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;

        while (current != null) {
            result += current.toString() + ", ";
            current = current.getNextNode();
        }
        result+="}";
        return result;
    }
}