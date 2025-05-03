package com.lowe.DSA201April2025;

/*
public class ListNode {
   public int val; 
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}
*/
import java.io.*;
import java.util.*;
import crio.ds.List.ListNode;
class Solution {
  public static ListNode sumLists1( ListNode head1 , ListNode head2) 
  {
       
        ListNode reversedHead1 = reverseList(head1);
        ListNode reversedHead2 = reverseList(head2);

        ListNode sumReversed = addReversedLists(reversedHead1, reversedHead2);
        return reverseList(sumReversed);
  }
   private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
     private static ListNode addReversedLists(ListNode head1, ListNode head2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (head1 != null || head2 != null || carry != 0) {
            int sum = carry;
            if (head1 != null) {
                sum += head1.val;
                head1 = head1.next;
            }
            if (head2 != null) {
                sum += head2.val;
                head2 = head2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummyHead.next;
    }
}