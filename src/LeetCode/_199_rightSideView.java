package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的右视图
 *
 * @author xoke
 * @date 2022/11/11
 */
public class _199_rightSideView {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了81.58%的用户
     * 内存消耗：40.2 MB, 在所有 Java 提交中击败了43.77%的用户
     */
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        level(root, res);
        return res;
    }

    public void level(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            int temp = 0;
            while (len > 0) {
                TreeNode node = queue.poll();
                temp = node.val;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                --len;
            }
            list.add(temp);
        }
    }
}
