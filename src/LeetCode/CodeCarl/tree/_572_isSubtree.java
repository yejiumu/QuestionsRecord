package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

/**
 * 另一棵树的子树
 *
 * @author xoke
 * @date 2022/11/12
 */
public class _572_isSubtree {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了92.46%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了71.54%的用户
     */
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // 递归法
        if (root == null) {
            return false;
        }
        return compare(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean compare(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        } else if (root != null && subRoot == null) {
            return false;
        } else if (root == null && subRoot != null) {
            return false;
        } else if (root.val != subRoot.val) {
            return false;
        }
        return compare(root.left, subRoot.left) && compare(root.right, subRoot.right);
    }
}
