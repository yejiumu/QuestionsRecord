package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 路径总和
 *
 * @author xoke
 * @date 2022/11/15
 */
public class _112_hasPathSum {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了22.78%的用户
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // 递归实现
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了15.87%的用户
     * 内存消耗：41 MB, 在所有 Java 提交中击败了93.22%的用户
     */
    public boolean hasPathSum_(TreeNode root, int targetSum) {
        // 层序遍历实现
        if (root == null) {
            return false;
        }
        Queue<TreeNode> queNode = new LinkedList<>();
        Queue<Integer> queVal = new LinkedList<>();
        queNode.offer(root);
        queVal.offer(root.val);
        while (!queNode.isEmpty()) {
            TreeNode node = queNode.poll();
            int value = queVal.poll();
            if (node.left == null && node.right == null) {
                if (value == targetSum) {
                    return true;
                }
                continue;
            }
            if (node.left != null) {
                queNode.offer(node.left);
                queVal.offer(node.left.val + value);
            }
            if (node.right != null) {
                queNode.offer(node.right);
                queVal.offer(node.right.val + value);
            }
        }
        return false;
    }
}
