package LeetCode;

/**
 * 翻转二叉树
 */
public class _226_invertTree {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：35.7 MB, 在所有 Java 提交中击败了74.31%的用户
     */
    public TreeNode invertTree(TreeNode root) {
        //如果该结点为空，直接返回null
        if (root == null) {
            return null;
        }
        //将该结点的左结点进行递归翻转
        TreeNode left = invertTree(root.left);
        //将该结点的右结点进行递归翻转
        TreeNode right = invertTree(root.right);
        //将翻转好的右结点赋给左结点
        root.left = right;
        //将翻转好的左结点赋给右结点
        root.right = left;
        return root;
    }
}
