package LeetCode.剑指offer.I;

import LeetCode.TreeNode;

import java.util.*;

/**
 * 从上到下打印二叉树 III
 *
 * @author jiumu
 * @date 2023/2/15
 */
public class _32_3_levelOrder {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了96.38%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了96.57%的用户
     */
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return list;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int count = 0;
        while (!queue.isEmpty()) {
            count++;
            int len = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (count % 2 == 0) {
                Collections.reverse(temp);
            }
            list.add(temp);
        }
        return list;
    }
}
