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

    // Method to remove the first occurrence of a value in the linked list
    public boolean removeByValue(int target) {
        if (head == null) {
            return false; // List is empty, nothing to remove
        }

        // If the head node contains the target value
        if (head.data == target) {
            head = head.next; // Remove the head node by moving head to the next node
            return true;
        }

        // Traverse the list to find the target value
        Node current = head;
        while (current.next != null) {
            if (current.next.data == target) {
                current.next = current.next.next; // Remove the node by skipping it
                return true;
            }
            current = current.next;
        }
        return false; // Value not found
    }

    // Method to remove a node by its position (index) in the linked list
    public boolean removeByPosition(int position) {
        if (head == null || position < 0) {
            return false; // List is empty or invalid position
        }

        // If the position is 0, remove the head node
        if (position == 0) {
            head = head.next;
            return true;
        }

        Node current = head;
        int index = 0;

        // Traverse to the node just before the position
        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        // If the position is beyond the end of the list
        if (current == null || current.next == null) {
            return false; // Position out of bounds
        }

        // Remove the node by skipping it
        current.next = current.next.next;
        return true;
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

public class LinkedListRemoval {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements to the linked list
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        // Traverse and print the linked list
        System.out.println("Linked List before removal:");
        list.traverse();

        // Remove a node by value
        int targetValue = 30;
        boolean isRemoved = list.removeByValue(targetValue);
        if (isRemoved) {
            System.out.println("Node with value " + targetValue + " removed.");
        } else {
            System.out.println("Node with value " + targetValue + " not found.");
        }

        // Traverse and print the linked list after removal
        System.out.println("Linked List after removing value " + targetValue + ":");
        list.traverse();

        // Remove a node by position (index)
        int position = 2;
        isRemoved = list.removeByPosition(position);
        if (isRemoved) {
            System.out.println("Node at position " + position + " removed.");
        } else {
            System.out.println("Node at position " + position + " not found.");
        }

        // Traverse and print the linked list after removal by position
        System.out.println("Linked List after removing position " + position + ":");
        list.traverse();
    }
}
