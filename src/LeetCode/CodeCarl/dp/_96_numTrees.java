package LeetCode.CodeCarl.dp;

/**
 * 不同的二叉搜索树
 *
 * @author xoke
 * @date 2022/11/30
 */
public class _96_numTrees {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.5 MB, 在所有 Java 提交中击败了13.62%的用户
     */
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // dp[i] += dp[以j为头结点左子树节点数量] * dp[以j为头结点右子树节点数量]
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}
