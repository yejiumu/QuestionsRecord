package LeetCode;

/**
 * 长度为三且各字符不同的子字符串
 */
public class _1876_countGoodSubstrings {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.6 MB, 在所有 Java 提交中击败了54.65%的用户
     */
    public int countGoodSubstrings(String s) {
        // 先化为字符数组，易于提取元素进行操作
        char[] chars = s.toCharArray();
        int len = chars.length;
        int ans = 0;
        // 遍历数组，以长度为3进行两两比较
        for (int i = 0; i < len - 2; i++) {
            if (chars[i] != chars[i + 1] && chars[i + 1] != chars[i + 2]
                    && chars[i] != chars[i + 2]) {
                // 如果各不相等，ans自增
                ans++;
            }
        }
        // 返回ans
        return ans;
    }
}
