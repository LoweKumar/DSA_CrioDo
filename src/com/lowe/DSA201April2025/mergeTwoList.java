package com.lowe.DSA201April2025;

import java.io.*;
import java.util.*;
import crio.ds.List.ListNode;
/*
public class ListNode {
   public int val; 
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}
*/
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
          if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode mergedHead;
        if (l1.val <= l2.val) {
            mergedHead = l1;
            l1 = l1.next;
        } else {
            mergedHead = l2;
            l2 = l2.next;
        }

        ListNode current = mergedHead;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        }

        if (l2 != null) {
            current.next = l2;
        }

        return mergedHead;
    }
}