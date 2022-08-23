package LeetCode.剑指offer.I;

/**
 * 调整数组顺序使奇数位于偶数前面
 *
 * @author xoke
 * @date 2022/8/23
 */
public class _21_exchange {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：48.9 MB, 在所有 Java 提交中击败了92.76%的用户
     */
    public int[] exchange(int[] nums) {
        int len = nums.length;
        // 创建双指针
        int left = 0, right = len - 1;
        while (left < right) {
            // 循环，找到此时第一个偶数
            while (left < len && nums[left] % 2 == 1) {
                ++left;
            }
            // 循环，找到此时第一个奇数
            while (right > 0 && nums[right] % 2 == 0) {
                --right;
            }
            // 如果左指针还在右指针右边，进行替换
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        // 返回原数组
        return nums;
    }
}
