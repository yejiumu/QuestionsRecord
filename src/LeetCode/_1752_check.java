package LeetCode;

/**
 * 检查数组是否经排序和轮转得到
 *
 * @author xoke
 * @date 2022/11/28
 */
public class _1752_check {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.4 MB, 在所有 Java 提交中击败了37.67%的用户
     */
    public boolean check(int[] nums) {
        int index = 0, len = nums.length;
        // 找到转折点
        for (int i = 1; i < len; i++) {
            if (nums[i - 1] > nums[i]) {
                index = i;
                break;
            }
        }
        // 如果为开头，直接返回true
        if (index == 0) {
            return true;
        }
        // 判断转折点后的单调性
        for (int i = index + 1; i < len; i++) {
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }
        // 最后判断连接处的大小
        return nums[0] >= nums[len - 1];
    }
}
