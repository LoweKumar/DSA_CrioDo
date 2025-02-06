package com.lowe.DSA101Jan2025;

import java.util.*;

public class TreeNode {
    public long val;
    public TreeNode left;
    public TreeNode right;

    // Constructor to initialize a node
    public TreeNode(long x) {
        val = x;
        left = null;
        right = null;
    }
}

class Solution {
    
    // Method to perform preorder traversal of the binary tree
    public List<Long> binaryTreePreorderTraversal(TreeNode root) {
        List<Long> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }
    
    // Helper method for recursive preorder traversal
    private void preorderHelper(TreeNode node, List<Long> result) {
        // Base case: If the node is null, just return
        if (node == null) {
            return;
        }
        
        // Visit the root node (add the value to the result list)
        result.add(node.val);
        
        // Recursively traverse the left subtree
        preorderHelper(node.left, result);
        
        // Recursively traverse the right subtree
        preorderHelper(node.right, result);
    }

    public static void main(String[] args) {
        // Example Binary Tree:
        //        1
        //       / \
        //      2   3
        //     / \   \
        //    4   5   6
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        Solution solution = new Solution();
        List<Long> preorder = solution.binaryTreePreorderTraversal(root);
        
        // Print the result of preorder traversal
        System.out.println(preorder);
    }
}

