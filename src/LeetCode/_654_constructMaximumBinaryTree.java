package LeetCode;

import java.util.Arrays;

/**
 * 最大二叉树
 *
 * @author xoke
 * @date 2022/11/16
 */
public class _654_constructMaximumBinaryTree {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了87.94%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了79.46%的用户
     */
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        // 下标优化实现
        // return travel(nums, 0, nums.length);
        TreeNode node = new TreeNode(0);
        if (nums.length == 1) {
            node.val = nums[0];
            return node;
        }
        int max = 0, index = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        node.val = max;
        if (index > 0) {
            node.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, index));
        }
        if (index < len - 1) {
            node.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, index + 1, len));
        }
        return node;
    }

    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了87.94%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了27.62%的用户
     */
    public TreeNode travel(int[] nums, int left, int right) {
        if (left >= right) {
            return null;
        }
        int maxIndex = left;
        for (int i = left + 1; i < right; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        TreeNode node = new TreeNode(nums[maxIndex]);
        node.left = travel(nums, left, maxIndex);
        node.right = travel(nums, maxIndex + 1, right);
        return node;
    }
}
