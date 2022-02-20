package LeetCode;

/**
 * 截断句子
 */
public class _1816_truncateSentence {
    public String truncateSentence(String s, int k) {
        int n = s.length();
        int end = 0;
        for (int i = 1; i < n; i++) {
            if (' ' == s.charAt(i) || i == n - 1) {
                k--;
                if (k == 0) {
                    end = i;
                    break;
                }
            }

        }
        return s.substring(0, end + 1);
    }
}
