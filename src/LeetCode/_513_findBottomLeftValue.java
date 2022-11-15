package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 找树左下角的值
 *
 * @author xoke
 * @date 2022/11/15
 */
public class _513_findBottomLeftValue {
    int res = 0;
    int maxDepth = Integer.MIN_VALUE;

    public int findBottomLeftValue(TreeNode root) {
        // 递归实现
        travel(root, 0);
        return res;
    }

    public void travel(TreeNode root, int depth) {
        if (root.left == null && root.right == null) {
            if (depth > maxDepth) {
                res = root.val;
                maxDepth = depth;
            }
        }
        if (root.left != null) {
            travel(root.left, depth + 1);
        }
        if (root.right != null) {
            travel(root.right, depth + 1);
        }
    }

    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了60.37%的用户
     * 内存消耗：41 MB, 在所有 Java 提交中击败了65.88%的用户
     */
    public int findBottomLeftValue_(TreeNode root) {
        // 层序遍历实现
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int res = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                if (i == 0) {
                    res = node.val;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return res;
    }
}
