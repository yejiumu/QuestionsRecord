package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

/**
 * 二叉树的最大深度
 *
 * @author xoke
 * @date 2022/11/11
 */
public class _104_maxDepth {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41 MB, 在所有 Java 提交中击败了81.57%的用户
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int rightH = maxDepth(root.right);
        int leftH = maxDepth(root.left);
        return Math.max(rightH, leftH) + 1;
    }
}
