package com.matthewgitata.learningjava.doublylinkedlist;

public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        DoublyLinkedList integers = new DoublyLinkedList();
        integers.insertAtHead(5);
        integers.insertAtHead(10);
        integers.insertAtHead(2);
        integers.insertAtHead(12);
        integers.insertAtHead(19);
        integers.insertAtHead(20);

        System.out.println(integers);
    }
}
