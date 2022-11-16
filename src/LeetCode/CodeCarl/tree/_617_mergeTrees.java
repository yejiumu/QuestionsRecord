package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 合并二叉树
 *
 * @author xoke
 * @date 2022/11/16
 */
public class _617_mergeTrees {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了5.33%的用户
     */
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        // 递归实现
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        // 前序遍历
        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }

    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了13.09%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了68.82%的用户
     */
    public TreeNode mergeTrees_(TreeNode root1, TreeNode root2) {
        // 迭代实现
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root1);
        queue.offer(root2);
        while (!queue.isEmpty()) {
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();
            node1.val += node2.val;
            if (node1.left != null && node2.left != null) {
                queue.offer(node1.left);
                queue.offer(node2.left);
            }
            if (node1.right != null && node2.right != null) {
                queue.offer(node1.right);
                queue.offer(node2.right);
            }
            if (node1.left == null && node2.left != null) {
                node1.left = node2.left;
            }
            if (node1.right == null && node2.right != null) {
                node1.right = node2.right;
            }
        }
        return root1;
    }
}
