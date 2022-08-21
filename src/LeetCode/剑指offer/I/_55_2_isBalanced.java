package LeetCode.剑指offer.I;

import LeetCode.TreeNode;

/**
 * 平衡二叉树
 *
 * @author xoke
 * @date 2022/8/21
 */
public class _55_2_isBalanced {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了56.07%的用户
     * 内存消耗：40.8 MB, 在所有 Java 提交中击败了85.09%的用户
     */
    public boolean isBalanced(TreeNode root) {
        // 空结点直接返回true
        if (root == null) {
            return true;
        }
        // 该结点的左右子树高度差小于等于一
        // 该结点的左右结点的左右子树也要满足条件
        return Math.abs(height(root.left) - height(root.right)) <= 1
                && isBalanced(root.left) && isBalanced(root.right);
    }

    // 查看当前二叉树的高度
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
