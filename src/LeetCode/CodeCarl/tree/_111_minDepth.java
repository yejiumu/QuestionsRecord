package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

/**
 * 二叉树的最小深度
 *
 * @author xoke
 * @date 2022/11/11
 */
public class _111_minDepth {
    /**
     * 执行用时：9 ms, 在所有 Java 提交中击败了37.18%的用户
     * 内存消耗：61.4 MB, 在所有 Java 提交中击败了21.91%的用户
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftH = minDepth(root.left);
        int rightH = minDepth(root.right);
        return root.left == null || root.right == null ?
                leftH + rightH + 1 : Math.min(leftH, rightH) + 1;
    }
}
