package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 打家劫舍 III
 *
 * @author xoke
 * @date 2023/1/8
 */
public class _337_rob {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了39.52%的用户
     * 内存消耗：40.9 MB, 在所有 Java 提交中击败了67.56%的用户
     */
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

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.8 MB, 在所有 Java 提交中击败了92.04%的用户
     */
//    public int rob(TreeNode root) {
//        int[] res = robAction(root);
//        return Math.max(res[0], res[1]);
//    }
    public int[] robAction(TreeNode root) {
        int[] res = new int[2];
        if (root == null) {
            return res;
        }
        int[] left = robAction(root.left);
        int[] right = robAction(root.right);
        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        res[1] = root.val + left[0] + right[0];
        return res;
    }
}
