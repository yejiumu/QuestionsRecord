package LeetCode;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/**
 * 二叉树的序列化与反序列化
 *
 * @author jiumu
 * @date 2023/1/13
 */
public class _297_Codec {
    /**
     * 执行用时：16 ms, 在所有 Java 提交中击败了54.90%的用户
     * 内存消耗：43.6 MB, 在所有 Java 提交中击败了46.23%的用户
     */
    public class Codec {
        public String serialize(TreeNode root) {
            if (root == null) {
                return "";
            }
            StringBuilder res = new StringBuilder();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node != null) {
                    res.append(node.val);
                    queue.offer(node.left);
                    queue.offer(node.right);
                } else {
                    res.append("null");
                }
                res.append(",");
            }
            return res.toString();
        }

        public TreeNode deserialize(String data) {
            if (Objects.equals(data, "")) {
                return null;
            }
            String[] dataList = data.split(",");
            TreeNode root = new TreeNode(Integer.parseInt(dataList[0]));
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int index = 1;
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (!"null".equals(dataList[index])) {
                    node.left = new TreeNode(Integer.parseInt(dataList[index]));
                    queue.offer(node.left);
                }
                index++;
                if (!"null".equals(dataList[index])) {
                    node.right = new TreeNode(Integer.parseInt(dataList[index]));
                    queue.offer(node.right);
                }
                index++;
            }
            return root;
        }
    }
}