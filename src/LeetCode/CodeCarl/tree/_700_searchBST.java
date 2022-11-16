package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

/**
 * 二叉搜索树中的搜索
 *
 * @author xoke
 * @date 2022/11/16
 */
public class _700_searchBST {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.8 MB, 在所有 Java 提交中击败了63.16%的用户
     */
    public TreeNode searchBST_(TreeNode root, int val) {
        // 迭代实现
        TreeNode cur = root;
        while (cur != null) {
            if (cur.val == val) {
                return cur;
            } else if (cur.val > val) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return null;
    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了42.08%的用户
     */
    public TreeNode searchBST(TreeNode root, int val) {
        // 递归实现
        if (root == null || root.val == val) {
            return root;
        }
        if (root.val > val) {
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }
}
