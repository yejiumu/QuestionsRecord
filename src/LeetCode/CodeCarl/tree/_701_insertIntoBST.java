package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

/**
 * 二叉搜索树中的插入操作
 *
 * @author xoke
 * @date 2022/11/17
 */
public class _701_insertIntoBST {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了91.43%的用户
     */
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            // 遇到空，直接创建结点，然后返回
            return new TreeNode(val);
        }
        // 利用好二叉搜索树的特性
        if (root.val > val) {
            // 下述操作会将创建的结点进行拼接
            root.left = insertIntoBST(root.left, val);
        }
        if (root.val < val) {
            // 下述操作会将创建的结点进行拼接
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
