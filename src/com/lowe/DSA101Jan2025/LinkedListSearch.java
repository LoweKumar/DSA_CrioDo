package com.lowe.DSA101Jan2025;

// Class to represent a node in the linked list
class Node {
    int data;      // Data in the node
    Node next;     // Reference to the next node

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Class to represent the linked list
class LinkedList {
    Node head; // Head of the list

    // Constructor to initialize an empty linked list
    LinkedList() {
        head = null;
    }

    // Method to add a new node at the end of the linked list
    public void append(int data) {
        Node newNode = new Node(data);  // Create a new node

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
        } else {
            // Traverse to the end of the list
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            // Add the new node at the end
            current.next = newNode;
        }
    }

    // Method to search for a specific value in the linked list
    public boolean search(int target) {
        Node current = head; // Start from the head

        while (current != null) {
            if (current.data == target) {
                return true; // Target found
            }
            current = current.next; // Move to the next node
        }
        return false; // Target not found
    }

    // Method to perform the traversal and print each node's data
    public void traverse() {
        // If the list is empty
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        // Start from the head and move to the next node until the end
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> "); // Print the current node's data
            current = current.next; // Move to the next node
        }
        System.out.println("null"); // End of the list
    }
}

public class LinkedListSearch {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements to the linked list
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        // Traverse and print the linked list
        System.out.println("Linked List:");
        list.traverse();

        // Searching for an element in the linked list
        int target = 30;
        boolean found = list.search(target);
        if (found) {
            System.out.println("Element " + target + " found in the list.");
        } else {
            System.out.println("Element " + target + " not found in the list.");
        }

        // Searching for an element that doesn't exist
        target = 100;
        found = list.search(target);
        if (found) {
            System.out.println("Element " + target + " found in the list.");
        } else {
            System.out.println("Element " + target + " not found in the list.");
        }
    }
}

