package LeetCode;

/**
 * 替换子串得到平衡字符串
 *
 * @author jiumu
 * @date 2023/2/13
 */
public class _1234_balancedString {
    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了96.72%的用户
     * 内存消耗：40.9 MB, 在所有 Java 提交中击败了100.00%的用户
     */
    public int balancedString(String s) {
        char[] ch = s.toCharArray();
        int[] cnt = new int['X'];
        for (char c : ch) {
            ++cnt[c];
        }
        int len = s.length(), m = len / 4;
        if (cnt['Q'] == m && cnt['W'] == m && cnt['E'] == m && cnt['R'] == m) {
            return 0;
        }
        int res = len, left = 0;
        for (int right = 0; right < len; right++) {
            --cnt[ch[right]];
            while (cnt['Q'] <= m && cnt['W'] <= m && cnt['E'] <= m && cnt['R'] <= m) {
                res = Math.min(res, right - left + 1);
                ++cnt[ch[left++]];
            }
        }
        return res;
    }
}
