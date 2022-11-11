package LeetCode;

/**
 * 判断字符串的两半是否相似
 *
 * @author xoke
 * @date 2022/11/11
 */
public class _1704_halvesAreAlike {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了95.38%的用户
     * 内存消耗：39.6 MB, 在所有 Java 提交中击败了77.17%的用户
     */
    public boolean halvesAreAlike(String s) {
        // 还是很简单，遍历统计即可
        int len = s.length();
        String first = s.substring(0, len / 2);
        String second = s.substring(len / 2);
        String standard = "aeiouAEIOU";
        int count1 = 0, count2 = 0;
        for (char ch : first.toCharArray()) {
            if (standard.indexOf(ch) != -1) {
                count1++;
            }
        }
        for (char ch : second.toCharArray()) {
            if (standard.indexOf(ch) != -1) {
                count2++;
            }
        }
        return count1 == count2;
    }
}
