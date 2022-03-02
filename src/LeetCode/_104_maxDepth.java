package LeetCode;

/**
 * 二叉树的最大深度
 */
public class _104_maxDepth {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了26.62%
     */
    public int maxDepth(TreeNode root) {
        //如果遇到空，即到底了，返回0
        if (root == null) {
            return 0;
        } else {
            //如果不为空，往左子树和右子树继续递归遍历
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            //返回左右子树中最大的深度 + 1(根节点)
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }
}

/*
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