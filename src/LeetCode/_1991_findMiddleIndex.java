package LeetCode;

/**
 * 找到数组的中间位置
 */
public class _1991_findMiddleIndex {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.8 MB, 在所有 Java 提交中击败了32.73%的用户
     */
    public int findMiddleIndex(int[] nums) {
        // 先计算出总和
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int sum = 0;
        int len = nums.length;
        // 遍历数组
        for (int i = 0; i < len; i++) {
            // 如果当前元素前的所有元素和的两倍加当前元素等于总和，该元素就是中间位置
            if (2 * sum + nums[i] == total) {
                // 返回当前元素的下标
                return i;
            }
            // 累加
            sum += nums[i];
        }
        // 没有则返回-1
        return -1;
    }
}
