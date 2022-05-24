package LeetCode;

/**
 * 单值二叉树
 */
public class _965_isUnivalTree {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.7 MB, 在所有 Java 提交中击败了92.44%的用户
     */
    public boolean isUnivalTree(TreeNode root) {
        // 该结点为空，返回true就OK了
        if (root == null) {
            return true;
        }
        // 判断该结点的左右结点
        if (root.left != null) {
            // 持续递归
            if (root.val != root.left.val || !isUnivalTree(root.left)) {
                // 有不同就返回false
                return false;
            }
        }
        if (root.right != null) {
            // 持续递归
            // 有不同就返回false
            return root.val == root.right.val && isUnivalTree(root.right);
        }
        // 最后返回true
        return true;
    }
}
