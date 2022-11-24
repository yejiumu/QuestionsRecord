package LeetCode.CodeCarl.greedy;

/**
 * 摆动序列
 *
 * @author xoke
 * @date 2022/11/24
 */
public class _376_wiggleMaxLength {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.1 MB, 在所有 Java 提交中击败了54.61%的用户
     */
    public int wiggleMaxLength(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return len;
        }
        int curDiff = 0, preDiff = 0;
        // 默认最右边有一个峰值
        int res = 1;
        for (int i = 1; i < len; i++) {
            curDiff = nums[i] - nums[i - 1];
            // 判断峰值
            if ((curDiff > 0 && preDiff <= 0) || (curDiff < 0 && preDiff >= 0)) {
                res++;
                preDiff = curDiff;
            }
        }
        return res;
    }
}
