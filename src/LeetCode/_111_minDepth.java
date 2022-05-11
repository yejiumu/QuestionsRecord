package LeetCode;

/**
 * 二叉树的最小深度
 */
public class _111_minDepth {
    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了64.49%的用户
     * 内存消耗：61.3 MB, 在所有 Java 提交中击败了21.34%的用户
     */
    public int minDepth(TreeNode root) {
        // 当前节点为空
        if (root == null) {
            return 0;
        }
        // 当前节点左右节点为空，为叶子节点
        if (root.left == null && root.right == null) {
            return 1;
        }
        int min = Integer.MAX_VALUE;
        if (root.left != null) {
            // 如果左节点不为空，继续递归左子树，寻找最小值
            min = Math.min(minDepth(root.left), min);
        }
        if (root.right != null) {
            // 如果右节点不为空，继续递归右子树，寻找最小值
            min = Math.min(minDepth(root.right), min);
        }
        // 加上根节点
        return min + 1;
    }
}
