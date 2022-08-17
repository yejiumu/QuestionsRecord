package LeetCode.剑指offer.I;

/**
 * 连续子数组的最大和
 *
 * @author xoke
 * @date 2022/8/17
 */
public class _42_maxSubArray {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：47.9 MB, 在所有 Java 提交中击败了75.68%的用户
     */
    public int maxSubArray(int[] nums) {
        // 初始化
        int max = nums[0], pre = 0;
        for (int num : nums) {
            // pre为到当前位置的最大值
            pre = Math.max(num, pre + num);
            // 进行最大值比较
            max = Math.max(pre, max);
        }
        return max;
    }
}
