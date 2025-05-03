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

    public TreeNode mirrorBinaryTree(TreeNode root) 
    {
        if (root == null) {
            return null;
        }

        TreeNode left = mirrorBinaryTree(root.left);
        TreeNode right = mirrorBinaryTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

}
