package LeetCode;

/**
 * 子数组异或查询
 *
 * @author xoke
 * @date 2022/9/5
 */
public class _1310_xorQueries {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：53.2 MB, 在所有 Java 提交中击败了50.87%的用户
     */
    public int[] xorQueries(int[] arr, int[][] queries) {
        // 数据长度和答案数组长度
        int len = arr.length + 1, arrLen = queries.length;
        // 前缀和与答案
        int[] dp = new int[len], ans = new int[arrLen];
        // 计算前缀和
        for (int i = 1; i < len; i++) {
            dp[i] = dp[i - 1] ^ arr[i - 1];
        }
        // [i , j]之间的值，直接 (i前缀和) ^ (j前缀和)
        // 前 i个数会因为异或，两两消除，最后得出[i , j]的值
        for (int i = 0; i < arrLen; i++) {
            ans[i] = dp[queries[i][1] + 1] ^ dp[queries[i][0]];
        }
        return ans;
    }
}
