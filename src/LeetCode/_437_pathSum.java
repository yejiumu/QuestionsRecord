package LeetCode;

/**
 * 路径总和 III
 *
 * @author xoke
 * @date 2023/1/9
 */
public class _437_pathSum {
    /**
     * 执行用时：34 ms, 在所有 Java 提交中击败了10.65%的用户
     * 内存消耗：41.5 MB, 在所有 Java 提交中击败了13.04%的用户
     */
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        int res = rootSum(root, targetSum);
        res += pathSum(root.left, targetSum);
        res += pathSum(root.right, targetSum);
        return res;
    }

    public int rootSum(TreeNode root, long targetSum) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        int val = root.val;
        if (val == targetSum) {
            res++;
        }
        res += rootSum(root.left, targetSum - val);
        res += rootSum(root.right, targetSum - val);
        return res;
    }
}
