package com.lowe.DSA101Jan2025;

import java.util.*;

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
  // Implement your solution here
  public List<Long> inorderTraversal(TreeNode root) {
    List<Long> result = new ArrayList<>();
    inorder(root, result);
    return result;
  }
  public void inorder(TreeNode node, List<Long> result){
    if(node==null){
      return;
    }
    inorder(node.left, result);
    result.add(node.val);
    inorder(node.right, result);
  }
}
