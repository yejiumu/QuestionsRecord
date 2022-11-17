package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

/**
 * @author xoke
 * @date 2022/11/17
 */
public class _235_lowestCommonAncestor {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了99.98%的用户
     * 内存消耗：42.1 MB, 在所有 Java 提交中击败了79.38%的用户
     */
    public TreeNode lowestCommonAncestor_(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (root.val > p.val && root.val > q.val) {
                root = root.left;
            } else if (root.val < q.val && root.val < p.val) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }

    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了40.26%的用户
     * 内存消耗：42.6 MB, 在所有 Java 提交中击败了25.09%的用户
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root.val > p.val && root.val > q.val) {
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            if (left != null) {
                return left;
            }
        }
        if (root.val < q.val && root.val < p.val) {
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if (right != null) {
                return right;
            }
        }
        return root;
    }
}
