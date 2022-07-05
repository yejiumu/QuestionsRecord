package LeetCode;

public class _485_findMaxConsecutiveOnes {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42 MB, 在所有 Java 提交中击败了70.97%的用户
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int len = nums.length;
        for (int i = 0; i < len; ) {
            // 遇到0直接跳过
            if (nums[i] != 1) {
                i++;
                continue;
            }
            // 记录1的连续个数
            int temp = 0;
            // 循环
            while (i < len && nums[i] == 1) {
                i++;
                temp++;
            }
            // 取最大值
            ans = Math.max(ans, temp);
        }
        return ans;
    }
}
