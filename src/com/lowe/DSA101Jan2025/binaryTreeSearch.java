package com.lowe.DSA101Jan2025;

/* 
// Definition of TreeNode
public class TreeNode {
    public long val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (long x) {
        val = x;
        left = null;
        right = null;
    }
}

Use new TreeNode(data) to create new Node
*/
public class Solution {
    public boolean binaryTreeSearching(TreeNode root, int k) {
        if(root==null) return false;
        if(root.val==k) return true;
        if(binaryTreeSearching(root.left, k)==true) return true;
        if(binaryTreeSearching(root.right, k)==true) return true;

        return false;
    }

}
