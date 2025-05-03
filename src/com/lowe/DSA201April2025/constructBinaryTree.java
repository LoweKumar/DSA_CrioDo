package com.lowe.DSA201April2025;
import java.util.*;

// Definition of TreeNode
class TreeNode {
    public long val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (long x) {
        val = x;
        left = null;
        right = null;
    }
}

public class Solution {

    public TreeNode constructBinaryTreeFromPreorderAndInorderTraversal(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length) {
            return null; 
        }
        Map<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        int[] preIndex = {0}; 
        return buildTree(preorder, 0, preorder.length - 1, inorderMap, preIndex);
    }

    private TreeNode buildTree(int[] preorder, int inStart, int inEnd, Map<Integer, Integer> inorderMap, int[] preIndex) {
        if (inStart > inEnd) {
            return null; 
        }

        int rootVal = preorder[preIndex[0]];
        TreeNode root = new TreeNode(rootVal);
        preIndex[0]++; 
       
        int rootIndex = inorderMap.get(rootVal);

        root.left = buildTree(preorder, inStart, rootIndex - 1, inorderMap, preIndex);
        root.right = buildTree(preorder, rootIndex + 1, inEnd, inorderMap, preIndex);

        return root;
}
}
