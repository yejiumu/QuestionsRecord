package LeetCode.剑指offer.I;

import LeetCode.TreeNode;

/**
 * 对称的二叉树
 *
 * @author xoke
 * @date 2022/8/16
 */
public class _28_isSymmetric {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.7 MB, 在所有 Java 提交中击败了44.13%的用户
     */
    public boolean isSymmetric(TreeNode root) {
        // 递归判断对称结点
        return check(root, root);
    }

    public boolean check(TreeNode p, TreeNode q) {
        // 都为空，直接返回true
        if (p == null && q == null) {
            return true;
        }
        // 只有一个为空。直接返回false
        if (p == null || q == null) {
            return false;
        }
        // 然后比较值，以及递归比较左右子数
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }
}
