package LeetCode;

import java.util.Arrays;

/**
 * 丢失的数字
 */
public class _268_missingNumber {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.3 MB, 在所有 Java 提交中击败了6.40%的用户
     */
    public int missingNumber(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int num : nums) {
            max = Math.max(max, num);
            sum += num;
        }
        return (nums.length + 1) * nums.length / 2 - sum;
    }
}
