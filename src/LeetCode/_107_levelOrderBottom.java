package LeetCode;

import java.util.*;

/**
 * 二叉树的层次遍历II
 *
 * @author xoke
 * @date 2022/11/11
 */
public class _107_levelOrderBottom {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了91.78%的用户
     * 内存消耗：41.5 MB, 在所有 Java 提交中击败了64.26%的用户
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // 在二叉树的层次遍历的基础上，将列表进行翻转即可
        List<List<Integer>> list = new ArrayList<>();
        level(root, list);
        Collections.reverse(list);
        return list;
    }

    public void level(TreeNode root, List<List<Integer>> list) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> temp = new ArrayList<>();
            while (len > 0) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                len--;
            }
            list.add(temp);
        }
    }
}
