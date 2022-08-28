package LeetCode.剑指offer.I;

import LeetCode.TreeNode;

/**
 * 二叉树的最近公共祖先
 *
 * @author xoke
 * @date 2022/8/28
 */
public class _68_2_lowestCommonAncestor {
    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了91.56%的用户
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 该结点为空或者找到指定结点直接返回
        if (root == null || root == p || root == q) {
            return root;
        }
        // 递归遍历左右子树
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // 如果左子树为空，返回右子树
        if (left == null) {
            return right;
        }
        // 如果右子树为空，返回左子树
        if (right == null) {
            return left;
        }
        // 如果都不为空，返回目前结点，已经找到了
        return root;
    }
}
