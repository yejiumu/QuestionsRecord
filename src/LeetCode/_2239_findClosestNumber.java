package LeetCode;

/**
 * 找到最接近 0 的数字
 */
public class _2239_findClosestNumber {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了76.25%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了12.90%的用户
     */
    public int findClosestNumber(int[] nums) {
        // 维护ans(绝对值最小且值最大的元素)以及dis(绝对值最小)两个变量即可
        // abs(num) < dis : ans更新为当前元素，dis也更新为当前最小绝对值
        // abs(num) == dis : ans更新为两者最大值，dis无需改变
        // abs(num) > dis : 无需变化
        int ans = nums[0];
        int dis = Math.abs(nums[0]);
        // 遍历数组
        for (int num : nums) {
            if (Math.abs(num) < dis) {
                dis = Math.abs(num);
                ans = num;
            } else if (Math.abs(num) == dis) {
                ans = Math.max(ans, num);
            }
        }
        return ans;
    }
}
