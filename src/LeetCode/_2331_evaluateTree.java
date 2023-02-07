package LeetCode;

/**
 * 计算布尔二叉树的值
 *
 * @author jiumu
 * @date 2023/2/7
 */
public class _2331_evaluateTree {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了87.11%的用户
     */
    public boolean evaluateTree(TreeNode root) {
        return dfs(root);
    }

    public boolean dfs(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val == 1;
        }
        boolean left = dfs(root.left);
        boolean right = dfs(root.right);
        return root.val == 2 ? left || right : left && right;
    }
}
