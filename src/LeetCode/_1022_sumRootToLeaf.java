package LeetCode;

/**
 * 从根到叶的二进制数之和
 */
public class _1022_sumRootToLeaf {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int val) {
        if (root == null) {
            return 0;
        }
        val = (val << 1) | root.val;
        if (root.left == null && root.right == null) {
            return val;
        }
        // 左右子树相加
        return dfs(root.left, val) + dfs(root.right, val);
    }
}
