package LeetCode;

/**
 * 生成交替二进制字符串的最少操作数
 *
 * @author xoke
 * @date 2022/11/29
 */
public class _1758_minOperations {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了94.22%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了41.84%的用户
     */
    public int minOperations(String s) {
        int res = 0, index = 0;
        // 规定，按照0101...排列，统计不符合的个数（需要修改的个数）
        for (char ch : s.toCharArray()) {
            if (ch != (char) ('0' + index++ % 2)) {
                res++;
            }
        }
        // s.length() - res 为按照1010...排列的不符合的个数
        return Math.min(res, s.length() - res);
    }
}
