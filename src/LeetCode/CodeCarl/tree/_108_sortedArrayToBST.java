package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

/**
 * 将有序数组转换为二叉搜索树
 *
 * @author xoke
 * @date 2022/11/18
 */
public class _108_sortedArrayToBST {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了45.38%的用户
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return travel(nums, 0, nums.length - 1);
    }

    public TreeNode travel(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = travel(nums, left, mid - 1);
        root.right = travel(nums, mid + 1, right);
        return root;
    }
}
