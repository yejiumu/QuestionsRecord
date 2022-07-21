package LeetCode;

public class _724_pivotIndex {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.1 MB, 在所有 Java 提交中击败了52.48%的用户
     */
    public int pivotIndex(int[] nums) {
        // 提前计算数组总和
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int len = nums.length;
        int half = 0;
        for (int i = 0; i < len; i++) {
            // 判断当前是否为中间线
            if (half * 2 + nums[i] == sum) {
                // 是则直接返回当前下标
                return i;
            }
            half += nums[i];
        }
        // 否则返回-1
        return -1;
    }
}
