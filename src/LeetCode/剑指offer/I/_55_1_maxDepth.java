package LeetCode.剑指offer.I;

import LeetCode.TreeNode;

/**
 * 二叉树的深度
 *
 * @author xoke
 * @date 2022/8/28
 */
public class _55_1_maxDepth {
    public int maxDepth(TreeNode root) {
        // 到树底了，深度为0
        if (root == null) {
            return 0;
        }
        // 返回左右子树中的最大深度(加一表示当前深度)
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
