package LeetCode.剑指offer.I;

import LeetCode.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 从上到下打印二叉树
 *
 * @author jiumu
 * @date 2023/2/14
 */
public class _32_1_levelOrder {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了96.79%的用户
     * 内存消耗：40.2 MB, 在所有 Java 提交中击败了96.44%的用户
     */
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        int len = list.size();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
