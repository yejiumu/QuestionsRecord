package LeetCode.CodeCarl.greedy;

/**
 * 最大子数组和
 *
 * @author xoke
 * @date 2022/11/24
 */
public class _53_maxSubArray {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：50.7 MB, 在所有 Java 提交中击败了54.31%的用户
     */
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int res = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            if (sum > res) {
                res = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return res;
    }
}
