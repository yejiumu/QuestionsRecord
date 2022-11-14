package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

/**
 * 平衡二叉树
 *
 * @author xoke
 * @date 2022/11/14
 */
public class _110_isBalanced {
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftH = getHeight(root.left);
        if (leftH == -1) {
            return -1;
        }
        int rightH = getHeight(root.right);
        if (rightH == -1) {
            return -1;
        }
        return Math.abs(rightH - leftH) <= 1 ? 1 + Math.max(rightH, leftH) : -1;
    }
}
