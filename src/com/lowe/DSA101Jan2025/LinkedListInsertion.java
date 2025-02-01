package com.lowe.DSA101Jan2025;

// Node class represents each node in the linked list
class Node {
    int data; // Data of the node
    Node next; // Reference to the next node in the list

    // Constructor to initialize the node with data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class manages the linked list
class LinkedList {
    Node head; // Reference to the first node of the linked list
    Node tail; // Reference to the last node of the linked list

    // Constructor to initialize the empty linked list
    public LinkedList() {
        head = null;
        tail = null;
    }

    // Insert a new node at the beginning of the linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) { // If the list is empty
            head = tail = newNode; // Set both head and tail to the new node
        } else {
            newNode.next = head; // Point the new node's next to the current head
            head = newNode; // Update head to the new node
        }
    }

    // Insert a new node at the end of the linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) { // If the list is empty
            head = tail = newNode; // Set both head and tail to the new node
        } else {
            tail.next = newNode; // Point the current tail's next to the new node
            tail = newNode; // Update the tail to the new node
        }
    }

    // Print the entire linked list
    public void printList() {
        if (head == null) { // If the list is empty
            System.out.println("The list is empty.");
            return;
        }

        Node current = head; // Start from the head
        while (current != null) { // Traverse the list
            System.out.print(current.data + " "); // Print the current node's data
            current = current.next; // Move to the next node
        }
        System.out.println(); // Print a newline after the list
    }
}

// Main class to test the linked list operations
public class LinkedListInsertion {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // Create a new linked list

        // Inserting nodes at the beginning
        list.insertAtBeginning(1); // List: 1
        list.printList();

        list.insertAtBeginning(2); // List: 2 1
        list.printList();

        // Inserting nodes at the end
        list.insertAtEnd(3); // List: 2 1 3
        list.printList();

        list.insertAtEnd(4); // List: 2 1 3 4
        list.printList();
    }
}
