package LeetCode;

/**
 * 最长回文子串
 */
public class _5_longestPalindrome {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了99.86%的用户
     * 内存消耗：40.8 MB, 在所有 Java 提交中击败了82.97%的用户
     * <p>
     * 一直是噩梦，现在终于理解了，万岁！！！
     */
    public String longestPalindrome(String s) {
        // 判空
        if (s == null || s.length() < 1) {
            return "";
        }
        int len = s.length();
        char[] ch = s.toCharArray();
        int[] range = new int[2];
        // 遍历数组，寻找最长回文
        for (int i = 0; i < len; i++) {
            // 把回文看成中间的部分全是同一字符，左右部分相对称
            // 找到下一个与当前字符不同的字符
            i = find(ch, i, range);
        }
        return s.substring(range[0], range[1] + 1);
    }

    // 寻找回文的函数
    public int find(char[] ch, int low, int[] range) {
        int len = ch.length;
        // 统计中间可能的相同数值
        int high = low;
        while (high < len - 1 && ch[low] == ch[high]) {
            ++high;
        }
        // 记录下相同元素的最后一个的下标
        int lastSame = high;
        // 开始向两边扩散
        while (low > 0 && high < len - 1 && ch[low - 1] == ch[high + 1]) {
            --low;
            ++high;
        }
        // 记录最大长度
        if (high - low > range[1] - range[0]) {
            range[0] = low;
            range[1] = high;
        }
        // 返回记录下的相同元素的最后一个的下标
        return lastSame;
    }
}
