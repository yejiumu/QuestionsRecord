package LeetCode;

/**
 * 逐步求和得到正数的最小值
 */
public class _1413_minStartValue {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39 MB, 在所有 Java 提交中击败了18.04%的用户
     */
    public int minStartValue(int[] nums) {
        int len = nums.length;
        int min = Math.min(nums[0], 0);
        // 遍历数组，求得最小前缀和
        for (int i = 1; i < len; i++) {
            nums[i] = nums[i] + nums[i - 1];
            min = Math.min(nums[i], min);
        }
        // 判断最小前缀和
        if (min >= 1) {
            // 如果最小前缀和都大于等于1，返回1即可
            return 1;
        } else {
            // 如果最小前缀和小于等于1，返回1-min
            return 1 - min;
        }
    }
}
