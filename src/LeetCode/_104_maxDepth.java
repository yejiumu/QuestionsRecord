package LeetCode;

/**
 * 二叉树的最大深度
 */
public class _104_maxDepth {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.8 MB, 在所有 Java 提交中击败了52.16%的用户
     */
    public int maxDepth(TreeNode root) {
        //如果遇到空，即到底了，返回0
        if (root == null) {
            return 0;
        } else {
            //如果不为空，往左子树和右子树继续递归遍历
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            //返回左右子树中最大的深度 + 1(根节点)
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }
}