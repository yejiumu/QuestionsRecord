package LeetCode;

/**
 * 另一棵树的子树
 */
public class _572_isSubtree {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了70.11%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了62.83%的用户
     */
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        return isSubtreeWithRoot(root, subRoot) ||
                isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isSubtreeWithRoot(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        if (s.val != t.val) {
            return false;
        }
        return isSubtreeWithRoot(s.left, t.left) && isSubtreeWithRoot(s.right, t.right);
    }
}
