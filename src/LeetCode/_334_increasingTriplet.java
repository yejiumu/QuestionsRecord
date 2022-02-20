package LeetCode;

/**
 * 递增的三元子序列
 */
public class _334_increasingTriplet {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了76.93%的用户
     * 内存消耗：79.2 MB, 在所有 Java 提交中击败了26.25%的用户
     */
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int first = nums[0], second = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > second) {
                return true;
            } else if (num > first) {
                second = num;
            } else {
                first = num;
            }
        }
        return false;
    }
}
