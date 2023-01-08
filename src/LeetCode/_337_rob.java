package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xoke
 * @date 2023/1/8
 */
public class _337_rob {
    Map<TreeNode, Integer> map = new HashMap<>();

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.val;
        }
        if (map.containsKey(root)) {
            return map.get(root);
        }
        int val1 = root.val;
        if (root.left != null) {
            val1 += rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null) {
            val1 += rob(root.right.left) + rob(root.right.right);
        }
        int val2 = rob(root.left) + rob(root.right);
        map.put(root, Math.max(val1, val2));
        return Math.max(val1, val2);
    }
}
