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
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = build(nums, left, mid - 1);
        root.right = build(nums, mid + 1, right);

        return root;
    }
}
// Problem:
// Convert a sorted integer array into a height-balanced Binary Search Tree (BST).

// Approach:
// 1. Pick the middle element as the root.
// 2. Recursively build the left subtree using the left half.
// 3. Recursively build the right subtree using the right half.
// 4. This ensures the BST remains height-balanced.

// Time Complexity: O(n)
// Space Complexity: O(log n) (recursion stack)