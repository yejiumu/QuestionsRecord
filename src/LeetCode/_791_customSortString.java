package LeetCode;

/**
 * 自定义字符串排序
 *
 * @author xoke
 * @date 2022/11/14
 */
public class _791_customSortString {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.7 MB, 在所有 Java 提交中击败了56.76%的用户
     */
    public String customSortString(String order, String s) {
        int[] count = new int[26];
        // 先统计个数
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        StringBuilder str = new StringBuilder();
        // 然后按要求顺序将所有字符进行拼接
        for (char ch : order.toCharArray()) {
            while (count[ch - 'a']-- > 0) {
                str.append(ch);
            }
        }
        // 不在要求顺序中的，按字典顺序
        for (int i = 0; i < 26; i++) {
            while (count[i]-- > 0) {
                str.append((char) (i + 'a'));
            }
        }
        return str.toString();
    }
}
