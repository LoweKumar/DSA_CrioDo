package com.lowe.DSA201April2025;
import java.util.*;
import crio.ds.Tree.TreeNode;

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

    public TreeNode lowestCommonAncestorInBST(TreeNode root, TreeNode p, TreeNode q) 
    {
        if (root == null) {
            return null;
        }

        // If both p and q are smaller than root, then LCA lies in left
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestorInBST(root.left, p, q);
        }

        // If both p and q are greater than root, then LCA lies in right
        else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestorInBST(root.right, p, q);
        }

        // Else root is LCA
        else {
            return root;
        }
    }

}
