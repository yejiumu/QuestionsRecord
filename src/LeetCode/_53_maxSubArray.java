package LeetCode;

/**
 * 最大子数组和
 * <p>
 * 方法：动态规划
 */
public class _53_maxSubArray {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：50.1 MB, 在所有 Java 提交中击败了38.36%的用户
     */
    public int maxSubArray(int[] nums) {
        //pre为预处理数据，为连续和的最大值
        int pre = 0, res = nums[0];
        for (int num : nums) {
            //如果pre加上num > pre，则更新pre = pre + num
            //否则此时pre肯定为负数，将pre更新为num
            pre = Math.max(num + pre, num);
            //将pre和res比较，将其中大者赋值给res
            res = Math.max(pre, res);
        }
        //返回最大值
        return res;
    }
}
