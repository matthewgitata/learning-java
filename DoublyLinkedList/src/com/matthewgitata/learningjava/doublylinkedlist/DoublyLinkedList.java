package com.matthewgitata.learningjava.doublylinkedlist;

import java.util.prefs.NodeChangeEvent;

public class DoublyLinkedList {
    private DoublyLinkedNode head;

    public void insertAtHead(int data) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);
        newNode.setNextNode(this.head);
        if (this.head != null) {
            this.head.setPreviousNode(newNode);
        }
        this.head = newNode;
    }

    public int length() {
        if (this.head == null) {
            return 0;
        }
        DoublyLinkedNode current = head;
        int length = 0;
        while (current != null) {
            length = length + 1;
            current = current.getNextNode();
        }
        return length;
    }

    @Override
    public String toString() {
        String result = "";
        DoublyLinkedNode current = this.head;
        while (current != null) {
            result = result + "\n" + current;
            current = current.getNextNode();
        }
        return result;
    }
}