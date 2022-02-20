package LeetCode;

/**
 * 翻转二叉树
 */
@SuppressWarnings("all")
public class _226_invertTree {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：35.7 MB, 在所有 Java 提交中击败了74.31%的用户
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
