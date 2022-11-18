package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

/**
 * 删除二叉搜索树中的节点
 *
 * @author xoke
 * @date 2022/11/18
 */
public class _450_deleteNode {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.1 MB, 在所有 Java 提交中击败了17.83%的用户
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            TreeNode temp = root.right;
            while (temp != null) {
                temp = temp.left;
            }
            root.val = temp.val;
            root.right = deleteNode(root.right, temp.val);
        }
        return root;
    }
}
