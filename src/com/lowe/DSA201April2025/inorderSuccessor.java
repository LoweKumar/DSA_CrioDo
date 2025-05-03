package com.lowe.DSA201April2025;

import java.util.*;
import crio.ds.Tree.TreeNode;
/*
// Definition for TreeNode
public class TreeNode {
    public long val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode next;
    public TreeNode (long x) {
        val = x;
        left = null;
        right = null;
        next = null;
    }
}
*/
class Solution{
	public int inorderSuccessor(TreeNode root,TreeNode givenNode)
	{
       if(givenNode == null) return -1;

        
        if (givenNode.right != null) {
            TreeNode current = givenNode.right;
            while (current.left != null) {
                current = current.left;
            }
            return (int) current.val;
        }
        
        TreeNode successor = null;
        TreeNode current = root;
        while (current != null) {
            if (givenNode.val < current.val) {
                successor = current;
                current = current.left;
            } else if (givenNode.val > current.val) {
                current = current.right;
            } else {
                break;
            }
        }
        if (successor != null)
            return (int)successor.val;
        else
            return -1;
	}
}
