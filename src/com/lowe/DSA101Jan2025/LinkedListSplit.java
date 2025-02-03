package com.lowe.DSA101Jan2025;

import java.util.*;

/*
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
        next = null;
    }
}

Use new ListNode(data) to create new node
*/
class Solution {

    public List<ListNode> linkedListSplit(ListNode head) {
        ListNode oddHead = null, oddTail = null;
        ListNode evenHead = null, evenTail = null;
        while(head!=null){
            if(head.val%2==1){
                if(oddHead == null){
                    oddHead = oddTail = head;
                }
                else{
                    oddTail.next = head;
                    oddTail= oddTail.next;
                }
            }
            else{
                if(evenHead == null){
                    evenHead = evenTail = head;
                }
                else{
                    evenTail.next = head;
                    evenTail = evenTail.next;
                }
            }
            head = head.next;
        }
        if(oddTail!=null){
            oddTail.next = null;

        }
        if(evenTail!=null){
            evenTail.next = null;
        }

        List<ListNode> res = new ArrayList<>();
        res.add(oddHead);
        res.add(evenHead);
        return res;

    }
};
