package com.lowe.DSA201April2025;

import java.io.*;
import java.util.*;
import crio.ds.List.ListNode;
/*
// Definition for ListNode
public class ListNode {

    public int val;
    public ListNode next;
    ListNode() {}
    ListNode(int x) {
        val = x;
        next = null;
    }
};
*/
class Solution {
	public static ListNode listIntersectionPoint(ListNode head1, ListNode head2) 
    {
         if (head1 == null || head2 == null) {
            return null;
        }

        ListNode current1 = head1;
        ListNode current2 = head2;
        int len1 = 0;
        int len2 = 0;

        while (current1 != null) {
            len1++;
            current1 = current1.next;
        }
        while (current2 != null) {
            len2++;
            current2 = current2.next;
        }

        current1 = head1;
        current2 = head2;

        if (len1 > len2) {
            int diff = len1 - len2;
            for (int i = 0; i < diff; i++) {
                current1 = current1.next;
            }
        } else if (len2 > len1) {
            int diff = len2 - len1;
            for (int i = 0; i < diff; i++) {
                current2 = current2.next;
            }
        }

        while (current1 != null && current2 != null) {
            if (current1 == current2) {
                return current1;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return null;
	}
}
