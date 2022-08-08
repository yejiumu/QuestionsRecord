package LeetCode.剑指offer.I;

import LeetCode.TreeNode;

/**
 * 二叉树的深度
 *
 * @author xoke
 * @date 2022/8/8
 */
public class _55_maxDepth {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了63.66%的用户
     */
    public int maxDepth(TreeNode root) {
        // 到树底了，深度为0
        if (root == null) {
            return 0;
        }
        // 返回左右子树中的最大深度(加一表示当前深度)
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
