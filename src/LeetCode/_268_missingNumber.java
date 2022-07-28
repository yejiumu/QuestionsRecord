package LeetCode;

/**
 * 丢失的数字
 */
public class _268_missingNumber {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.3 MB, 在所有 Java 提交中击败了6.40%的用户
     */
    public int missingNumber(int[] nums) {
        int len = nums.length;
        // 公差为1的等差数列，可以直接计算n项和
        int sum = len * (len + 1) / 2;
        for (int num : nums) {
            // 将这n项和逐个减去数组中的数字
            sum -= num;
        }
        // 最后剩下来的就是丢失的数字
        return sum;
    }
}
