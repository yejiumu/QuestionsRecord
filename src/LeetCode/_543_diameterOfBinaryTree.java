package LeetCode;

/**
 * 二叉树的直径
 */
public class _543_diameterOfBinaryTree {
    // 定义全局变量，方便进行更新
    int max = 0;

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了5.17%的用户
     */
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }

    public int depth(TreeNode root) {
        // 判断当前结点
        if (root == null) {
            return 0;
        }
        // 分别统计左结点和右结点
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        // 取最大值
        max = Math.max(max, leftDepth + rightDepth);
        // 返回左右子数最大值
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
