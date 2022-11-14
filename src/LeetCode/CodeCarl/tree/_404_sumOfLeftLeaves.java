package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

/**
 * 左叶子之和
 *
 * @author xoke
 * @date 2022/11/14
 */
public class _404_sumOfLeftLeaves {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.2 MB, 在所有 Java 提交中击败了69.63%的用户
     */
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftV = 0;
        // 判断当前结点的左结点是否是叶子结点
        if (root.left != null && root.left.left == null && root.left.right == null) {
            leftV = root.left.val;
        }
        return leftV + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
