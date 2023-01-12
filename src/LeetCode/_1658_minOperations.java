package LeetCode;

import java.util.Arrays;

/**
 * 将 x 减到 0 的最小操作数
 *
 * @author xoke
 * @date 2023/1/12
 */
public class _1658_minOperations {
    /**
     * 执行用时：11 ms, 在所有 Java 提交中击败了52.07%的用户
     * 内存消耗：50.9 MB, 在所有 Java 提交中击败了27.61%的用户
     */
    public int minOperations(int[] nums, int x) {
        int len = nums.length;
        // 先求得数组总和
        int sum = Arrays.stream(nums).sum();
        // 如果总和都小于X，直接返回-1
        if (sum < x) {
            return -1;
        }
        // 标记区间的右边界
        int right = 0;
        // 中间区间的左右两个区间的总和
        int lsum = 0, rsum = sum;
        int res = len + 1;
        for (int left = -1; left < len; left++) {
            if (left != -1) {
                lsum += nums[left];
            }
            while (right < len && lsum + rsum > x) {
                rsum -= nums[right];
                right++;
            }
            if (lsum + rsum == x) {
                res = Math.min(res, (left + 1) + (len - right));
            }
        }
        return res > len ? -1 : res;
    }
}
