package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

/**
 * 对称二叉树
 *
 * @author xoke
 * @date 2022/11/12
 */
public class _101_isSymmetric {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.7 MB, 在所有 Java 提交中击败了56.38%的用户
     */
    public boolean isSymmetric(TreeNode root) {
        return isSame(root.left, root.right);
    }

    public boolean isSame(TreeNode left, TreeNode right) {
        if (left == null && right != null) {
            return false;
        } else if (left != null && right == null) {
            return false;
        } else if (left == null && right == null) {
            return true;
        } else if (left.val != right.val) {
            return false;
        }
        return isSame(left.left, right.right) && isSame(left.right, right.left);
    }
}
