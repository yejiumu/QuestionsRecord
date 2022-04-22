package LeetCode;

/**
 * 旋转函数
 */
public class _396_maxRotateFunction {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：53.1 MB, 在所有 Java 提交中击败了61.17%的用户
     */
    public int maxRotateFunction(int[] nums) {
        // 记数组 nums 的元素之和为 numSum。根据公式，可以得到：
        // F(O)= 0 x nums[0] +1 x nums[1]+...+(n - 1) x nums[n - 1]
        // F(1)= 1 x nums[0]+ 2 x nums[1]+...+0 x nums[n - 1]
        //     = F(0)+ numSum - n x nums[n - 1]
        // 当 1 <= k <= n 时，F(k) = F(k−1) + numSum − n × nums[n−k]。
        // 我们可以不停迭代计算出不同的 F(k)，并求出最大值。
        int sum = 0, pre = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            // 求出F(0) 和 numSum
            pre += i * nums[i];
            sum += nums[i];
        }
        int ans = pre;
        for (int i = len - 1; i > 0; i--) {
            // 开始计算F(len - i)
            pre += sum - len * nums[i];
            // 比较大小
            ans = Math.max(ans, pre);
        }
        return ans;
    }
}
