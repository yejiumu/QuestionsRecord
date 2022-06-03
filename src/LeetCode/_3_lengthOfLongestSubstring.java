package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 无重复字符的最长子串
 */
public class _3_lengthOfLongestSubstring {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了60.28%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了73.19%的用户
     */
    public int lengthOfLongestSubstring(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> set = new HashSet<>();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int index = -1, ans = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                set.remove(s.charAt(i - 1));
            }
            while (index + 1 < len && !set.contains(s.charAt(index + 1))) {
                // 不断地移动右指针
                set.add(s.charAt(index + 1));
                index++;
            }
            // 第 i 到 index 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, index - i + 1);
        }
        return ans;
    }
}
