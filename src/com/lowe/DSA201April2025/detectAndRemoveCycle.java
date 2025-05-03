package com.lowe.DSA201April2025;

import crio.ds.List.ListNode;
/*
public class ListNode {
   public int val;
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}
*/

public class Solution {
    public boolean detectAndRemoveCycle(ListNode head) 
    {
          if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode meetingPoint = null;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                meetingPoint = slow;
                break;
            }
        }

        if (meetingPoint == null) {
            return false;
        }

        
        ListNode ptr1 = head;
        ListNode ptr2 = meetingPoint;

        
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        ListNode temp = ptr2;
        while (temp.next != ptr1) {
            temp = temp.next;
        }

        temp.next = null;

        return true;

    }
}
