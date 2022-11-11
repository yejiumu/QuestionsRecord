package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 在每个树行中找最大值
 *
 * @author xoke
 * @date 2022/11/11
 */
public class _515_largestValues {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了84.49%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了54.81%的用户
     */
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size(), max = Integer.MIN_VALUE;
            while (len > 0) {
                TreeNode node = queue.poll();
                max = Math.max(max, node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                --len;
            }
            list.add(max);
        }
        return list;
    }
}
