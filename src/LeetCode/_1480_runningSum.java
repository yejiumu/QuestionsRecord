package LeetCode;

/**
 * 一维数组的动态和
 */
public class _1480_runningSum {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了81.13%的用户
     */
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        // 前缀和，每次加上前面那个数即可
        for (int i = 1; i < len; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        // 原地操作，返回原数组即可
        return nums;
    }
}
