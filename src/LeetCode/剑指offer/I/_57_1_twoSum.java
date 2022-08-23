package LeetCode.剑指offer.I;

/**
 * 和为s的两个数字
 *
 * @author xoke
 * @date 2022/8/20
 */
public class _57_1_twoSum {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了99.90%的用户
     * 内存消耗：60.1 MB, 在所有 Java 提交中击败了45.53%的用户
     */
    public int[] twoSum(int[] nums, int target) {
        // 直接双指针，从两边向中间进行寻找
        int left = 0, right = nums.length - 1;
        while (left < right) {
            // 此时的和
            int temp = nums[left] + nums[right];
            // 与target进行对比
            if (temp < target) {
                // 小于就left右移
                ++left;
            } else if (temp > target) {
                // 大于就right左移
                --right;
            } else {
                // 此时就是第一个遇到的答案，直接返回即可
                return new int[]{nums[left], nums[right]};
            }
        }
        return new int[0];
    }
}
