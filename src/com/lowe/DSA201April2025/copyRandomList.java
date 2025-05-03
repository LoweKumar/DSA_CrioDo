package com.lowe.DSA201April2025;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import crio.ds.List.*;

/* Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/

public class Solution{


    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Map<Node, Node> nodeMap = new HashMap<>();
        Node current = head;
        while (current != null) {
            nodeMap.put(current, new Node(current.val, null, null));
            current = current.next;
        }

        current = head;
        while (current != null) {
            Node copyNode = nodeMap.get(current);
            copyNode.next = nodeMap.get(current.next);
            copyNode.random = nodeMap.get(current.random);
            current = current.next;
        }

        return nodeMap.get(head);
    }

}