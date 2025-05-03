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




   public ArrayList<Long> binaryTreeBoundaryTraversal(TreeNode root) {
        ArrayList<Long> boundary = new ArrayList<>();
        if (root == null) return boundary;

        if (!isLeaf(root)) {
            boundary.add(root.val);
        }

        addLeftBoundary(root.left, boundary);
        addLeaves(root, boundary);
        addRightBoundary(root.right, boundary);

        return boundary;
    }

    private void addLeftBoundary(TreeNode node, ArrayList<Long> boundary) {
        while (node != null) {
            if (!isLeaf(node)) {
                boundary.add(node.val);
            }
            node = (node.left != null) ? node.left : node.right;
        }
    }

    private void addRightBoundary(TreeNode node, ArrayList<Long> boundary) {
        Stack<Long> stack = new Stack<>();
        while (node != null) {
            if (!isLeaf(node)) {
                stack.push(node.val);
            }
            node = (node.right != null) ? node.right : node.left;
        }
        while (!stack.isEmpty()) {
            boundary.add(stack.pop());
        }
    }

    private void addLeaves(TreeNode node, ArrayList<Long> boundary) {
        if (node == null) return;

        if (isLeaf(node)) {
            boundary.add(node.val);
            return;
        }

        addLeaves(node.left, boundary);
        addLeaves(node.right, boundary);
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

}
