package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

/**
 * 二叉树的最近公共祖先
 *
 * @author xoke
 * @date 2022/11/17
 */
public class _236_lowestCommonAncestor {
    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了99.99%的用户
     * 内存消耗：42.5 MB, 在所有 Java 提交中击败了83.64%的用户
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q || root == null) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        if (left == null && right == null) {
            return null;
        } else if (left == null) {
            return right;
        } else {
            return left;
        }
    }
}
