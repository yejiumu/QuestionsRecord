package LeetCode;

/**
 * 重新排列数组
 *
 * @author xoke
 * @date 2022/8/29
 */
public class _1470_shuffle {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.5 MB, 在所有 Java 提交中击败了51.59%的用户
     */
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            // 直接后一位进行跨n位赋值
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }
}
