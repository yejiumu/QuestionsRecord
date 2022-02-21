package LeetCode;

import java.util.Arrays;

/**
 * “气球” 的最大数量
 */
public class _1189_maxNumberOfBalloons {
    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
    }

    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了72.84%的用户
     * 内存消耗：39.7 MB, 在所有 Java 提交中击败了58.18%的用户
     */
    public static int maxNumberOfBalloons(String text) {
        char[] ch = new char[26];
        for (int i = 0; i < text.length(); i++) {
            ch[text.charAt(i) - 'a']++;
        }
        int[] num = {ch[1], ch[0], ch['l' - 'a'] / 2, ch['o' - 'a'] / 2, ch['n' - 'a']};
        return Arrays.stream(num).min().getAsInt();
    }
}
