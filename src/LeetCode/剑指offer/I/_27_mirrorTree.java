package LeetCode.剑指offer.I;

import LeetCode.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 二叉树的镜像
 *
 * @author xoke
 * @date 2022/8/15
 */
public class _27_mirrorTree {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.8 MB, 在所有 Java 提交中击败了74.90%的用户
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

    public TreeNode mirrorTree1(TreeNode root) {
        // 栈
        if (root == null) {
            return null;
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            TreeNode node = deque.pop();
            if (node.left != null) {
                deque.add(node.left);
            }
            if (node.right != null) {
                deque.add(node.right);
            }
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
        return root;
    }
}
