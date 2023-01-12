package LeetCode;

/**
 * 统计包含给定前缀的字符串
 *
 * @author xoke
 * @date 2023/1/12
 */
public class _2185_prefixCount {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了59.59%的用户
     */
    public int prefixCount(String[] words, String pref) {
        int res = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                res++;
            }
        }
        return res;
    }
}
