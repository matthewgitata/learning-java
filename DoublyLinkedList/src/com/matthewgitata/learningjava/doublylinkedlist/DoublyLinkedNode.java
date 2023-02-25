package com.matthewgitata.learningjava.doublylinkedlist;

public class DoublyLinkedNode {
    private int data;
    private DoublyLinkedNode nextNode;
    private DoublyLinkedNode prevNode;

    public DoublyLinkedNode(int data) {
        this.data = data;
    }

    public DoublyLinkedNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyLinkedNode nextNode) {
        this.nextNode = nextNode;
    }

    public DoublyLinkedNode getPrevNode() {
        return prevNode;
    }

    public void setPreviousNode(DoublyLinkedNode prevNode) {
        this.prevNode = prevNode;
    }

    @Override
    public String toString() {
        return "Data: " + this.data;
    }
}
