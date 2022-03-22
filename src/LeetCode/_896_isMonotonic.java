package LeetCode;

/**
 * 单调数列
 */
public class _896_isMonotonic {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了43.68%的用户
     * 内存消耗：51.4 MB, 在所有 Java 提交中击败了38.30%的用户
     */
    public boolean isMonotonic(int[] nums) {
        //定义两个初始量，默认递增和递减都是true
        boolean inc = true, dec = true;
        int n = nums.length;
        for (int i = 0; i < n - 1; ++i) {
            //如果出现减小的情况，将递增更新为false
            if (nums[i] > nums[i + 1]) {
                inc = false;
            }
            //如果出现增加的情况，将递减更新为false
            if (nums[i] < nums[i + 1]) {
                dec = false;
            }
        }
        //最后将递减和递增进行或操作，只有出现增加和减少两种情况才会返回false，即不单调
        return inc || dec;
    }
}
