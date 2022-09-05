package LeetCode;

import java.util.Arrays;

/**
 * 和有限的最长子序列
 *
 * @author xoke
 * @date 2022/9/5
 */
public class _2389_answerQueries {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了83.31%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了94.76%的用户
     */
    public int[] answerQueries(int[] nums, int[] queries) {
        int numsLen = nums.length, queryLen = queries.length;
        int[] ans = new int[queryLen];
        // 直接排序，因为题目要求长度，所以顺序不重要，这样应该是贪心
        Arrays.sort(nums);
        // 计算前缀和
        for (int i = 1; i < numsLen; i++) {
            nums[i] += nums[i - 1];
        }
        // 循环
        for (int i = 0; i < queryLen; i++) {
            // 因为有序，所以这里也可以用二分查找
            for (int j = 0; j < numsLen; j++) {
                if (nums[j] > queries[i]) {
                    break;
                }
                ans[i] = j + 1;
            }
        }
        return ans;
    }
}
