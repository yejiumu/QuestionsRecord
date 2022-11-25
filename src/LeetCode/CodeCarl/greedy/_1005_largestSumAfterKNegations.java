package LeetCode.CodeCarl.greedy;

import java.util.Arrays;

/**
 * K 次取反后最大化的数组和
 *
 * @author xoke
 * @date 2022/11/25
 */
public class _1005_largestSumAfterKNegations {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了97.78%的用户
     * 内存消耗：40.8 MB, 在所有 Java 提交中击败了78.36%的用户
     */
    public int largestSumAfterKNegations(int[] nums, int k) {
        // 排序，让负值在前面
        Arrays.sort(nums);
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (k > 0 && nums[i] < 0) {
                // 将负值取反
                nums[i] = -nums[i];
                k--;
            }
            // 累加求和
            sum += nums[i];
        }
        // 再进行排序
        Arrays.sort(nums);
        // 如果此时k余2为0，可以抵消；余2为1，总和减去两倍的最小值
        return sum - (k % 2 == 0 ? 0 : 2 * nums[0]);
    }
}
