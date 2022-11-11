package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的层平均值
 *
 * @author xoke
 * @date 2022/11/11
 */
public class _637_averageOfLevels {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了95.06%的用户
     * 内存消耗：42.5 MB, 在所有 Java 提交中击败了89.82%的用户
     */
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size(), count = len;
            double sum = 0.0;
            while (count > 0) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                count--;
            }
            res.add(sum / len);
        }
        return res;
    }
}
