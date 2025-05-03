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
*/
public class Solution {
    TreeNode commonAncestor(TreeNode root, TreeNode p , TreeNode q) 
    {
         if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        TreeNode leftLCA = commonAncestor(root.left, p, q);
        TreeNode rightLCA = commonAncestor(root.right, p, q);

        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        if (leftLCA != null) {
            return leftLCA;
        }
        else {
            return rightLCA;
        }
    }
}
