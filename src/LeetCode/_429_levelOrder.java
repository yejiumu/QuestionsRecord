package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * N 叉树的层序遍历
 *
 * @author xoke
 * @date 2022/11/11
 */
public class _429_levelOrder {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了85.36%的用户
     * 内存消耗：42.6 MB, 在所有 Java 提交中击败了23.60%的用户
     */
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                Node cur = queue.poll();
                temp.add(cur.val);
                for (Node node : cur.children) {
                    queue.offer(node);
                }
            }
            list.add(temp);
        }
        return list;
    }
}
