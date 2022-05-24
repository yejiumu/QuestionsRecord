package LeetCode;

public class _1827_minOperations {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了84.56%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了97.00%的用户
     */
    public int minOperations(int[] nums) {
        int len = nums.length;
        int ans = 0;
        for (int i = 0; i < len - 1; i++) {
            // 如果右边小于左边
            if (nums[i + 1] <= nums[i]) {
                // 累加至少大于左边1的差值
                ans += nums[i] - nums[i + 1] + 1;
                // 如果右边赋值为左边加一
                nums[i + 1] = nums[i] + 1;
            }
        }
        // 返回累加结果
        return ans;
    }
}
