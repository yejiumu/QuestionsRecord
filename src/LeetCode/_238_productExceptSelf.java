package LeetCode;

/**
 * 除自身以外数组的乘积
 *
 * @author xoke
 * @date 2022/9/3
 */
public class _238_productExceptSelf {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：49.1 MB, 在所有 Java 提交中击败了90.38%的用户
     * <p>
     * 这个代码太漂亮了
     */
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        // 前后缀和
        int left = 1, right = 1;
        for (int i = 0; i < len; i++) {
            // 将前 i 个的乘积(前缀和)进行赋值
            ans[i] = left;
            // 前缀和累乘
            left *= nums[i];
        }
        for (int i = len - 1; i > 0; i--) {
            // 后缀和累乘
            right *= nums[i];
            // 将后 i 个的乘积(后缀和)进行赋值
            ans[i - 1] *= right;
        }
        return ans;
    }
}
