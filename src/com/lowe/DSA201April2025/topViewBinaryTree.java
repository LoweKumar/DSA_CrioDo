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

    public ArrayList<Long> topViewBinaryTree(TreeNode root) 
    {
        ArrayList<Long> topView = new ArrayList<>();
        if (root == null) {
            return topView;
        }

        TreeMap<Integer, Long> nodeMap = new TreeMap<>();

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0)); 

        while (!queue.isEmpty()) {
            Pair currentPair = queue.poll();
            TreeNode currentNode = currentPair.node;
            int horizontalDistance = currentPair.hd;

            if (!nodeMap.containsKey(horizontalDistance)) {
                nodeMap.put(horizontalDistance, currentNode.val);
            }

            if (currentNode.left != null) {
                queue.offer(new Pair(currentNode.left, horizontalDistance - 1));
            }
            if (currentNode.right != null) {
                queue.offer(new Pair(currentNode.right, horizontalDistance + 1));
            }
        }

        topView.addAll(nodeMap.values());
        return topView;
        
        
    }
    private static class Pair {
        TreeNode node;
        int hd;

        Pair(TreeNode node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

}
