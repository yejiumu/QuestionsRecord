package LeetCode;

/**
 * 字符的最短距离
 */
public class _821_shortestToChar {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了98.08%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了43.15%的用户
     */
    public int[] shortestToChar(String s, char c) {
        int len = s.length();
        int[] ans = new int[len];
        // s[i] 到其左侧最近的字符 c 的距离
        // s[i] 到其右侧最近的字符 c 的距离

        // 我们可以从左往右遍历 s，若 s[i] = c 则记录下此时字符 c 的的下标 idx。
        // 遍历的同时更新 answer[i] = i - index。
        for (int i = 0, index = -len; i < len; i++) {
            if (s.charAt(i) == c) {
                index = i;
            }
            // 如果刚开始时没有找到index，将当前的ans[i]变大即可
            ans[i] = i - index;
        }
        // 我们可以从右往左遍历 s，若 s[i] = c 则记录下此时字符 c 的的下标 idx。
        // 遍历的同时更新 answer[i] = min(answer[i], index - i)。
        // 因为之前设置的是加len，所以这次index是两倍，因为要减去之前加的数值
        for (int i = len - 1, index = 2 * len; i >= 0; i--) {
            if (s.charAt(i) == c) {
                index = i;
            }
            // 如果刚开始时没有找到index，将当前的ans[i]更新为相减后比较的最小值
            ans[i] = Math.min(ans[i], index - i);
        }
        return ans;
    }
}
