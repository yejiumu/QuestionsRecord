package LeetCode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 单词拆分
 *
 * @author xoke
 * @date 2022/12/3
 */
public class _139_wordBreak {
    /**
     * 执行用时：8 ms, 在所有 Java 提交中击败了34.09%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了45.44%的用户
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        int len = s.length();
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;
        // 背包
        for (int i = 1; i <= len; i++) {
            // 物品
            for (int j = 0; j < i && !dp[i]; j++) {
                if (set.contains(s.substring(j, i)) && dp[j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[len];
    }
}
