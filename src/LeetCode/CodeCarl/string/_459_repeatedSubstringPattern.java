package LeetCode.CodeCarl.string;

/**
 * 重复的子字符串
 *
 * @author xoke
 * @date 2022/11/1
 */
public class _459_repeatedSubstringPattern {
    /**
     * 执行用时：10 ms, 在所有 Java 提交中击败了57.27%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了81.30%的用户
     */
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = 1; i * 2 <= len; i++) {
            if (len % i == 0) {
                boolean match = true;
                for (int j = i; j < len; j++) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        return false;
    }
}
