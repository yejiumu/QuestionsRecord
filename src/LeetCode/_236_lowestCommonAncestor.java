package LeetCode;

/**
 * 二叉树的最近公共祖先
 *
 * @author xoke
 * @date 2022/9/24
 */
public class _236_lowestCommonAncestor {
    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了99.99%的用户
     * 内存消耗：43.1 MB, 在所有 Java 提交中击败了16.05%的用户
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 终止条件：叶结点、找到 p或者 q
        if (root == null || root == p || root == q) {
            return root;
        }
        // 该结点的左右子树递归
        // 返回的可能是叶结点、p、q或者祖先
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // 如果left为空，直接返回另一结点即可，不管right是什么
        if (left == null) {
            return right;
        }
        // 如果right为空，返回left，因为left不为空
        if (right == null) {
            return left;
        }
        // 都不为空，说明找到 p和 q了，该结点就是祖先结点
        return root;
    }
}
