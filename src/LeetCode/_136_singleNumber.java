package LeetCode;

/**
 * 只出现一次的数字
 */
public class _136_singleNumber {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.8 MB, 在所有 Java 提交中击败了5.04%的用户
     */
    public int singleNumber(int[] nums) {
        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}



