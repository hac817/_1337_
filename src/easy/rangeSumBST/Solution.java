package easy.rangeSumBST;


/*
Given the root node of a binary search tree and two integers low and high,
return the sum of values of all nodes with a value in the inclusive range [low, high].
 */

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */



class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> traversal = new ArrayList<>();
        inorderTraversal(root, traversal);

        int sum = 0;
        for (var num : traversal) {
            if (num < low) continue;
            if (num > high) break;

            sum += num;
        }
        return sum;
    }

    private void inorderTraversal(TreeNode curr, List<Integer> listSoFar) {
        if (curr == null) return;

        inorderTraversal(curr.left, listSoFar);
        listSoFar.add(curr.val);
        inorderTraversal(curr.right, listSoFar);
    }
}