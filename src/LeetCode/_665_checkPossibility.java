package LeetCode;

/**
 * 非递减数列
 */
public class _665_checkPossibility {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.6 MB, 在所有 Java 提交中击败了42.27%的用户
     */
    public boolean checkPossibility(int[] nums) {
        int len = nums.length;
        // 计递减的个数
        int count = 0;
        // 遍历数组
        for (int i = 0; i < len - 1; i++) {
            if (nums[i + 1] < nums[i]) {
                // 如果递减，计数
                ++count;
                if (count > 1) {
                    // 如果计数大于1，直接返回false
                    return false;
                }
                if (i > 0 && nums[i + 1] < nums[i - 1]) {
                    // 当nums[i+1]<nums[i-1]，可能nums[i+2]<nums[i]，也就是低谷太低了
                    // 不能通过改变一个数值使得成非递减数列
                    // 所以直接假设nums[i+1]为nums[i]，再在下一次循环中判断后面的情况
                    nums[i + 1] = nums[i];
                }
            }
        }
        return true;
    }
}
