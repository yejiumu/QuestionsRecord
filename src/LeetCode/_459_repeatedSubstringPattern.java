package LeetCode;

/**
 * 重复的子字符串
 */
public class _459_repeatedSubstringPattern {
    /**
     * 执行用时：9 ms, 在所有 Java 提交中击败了72.53%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了56.35%的用户
     */
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        // 此时这里i为相同字符串的长度，即两相邻字符串之间的间隔
        // 最长间隔为原字符串的一半(优化)
        for (int i = 1; i * 2 <= len; ++i) {
            // 原字符串长度一定是子字符串的整数倍
            if (len % i == 0) {
                // 默认可以匹配
                boolean match = true;
                // 从一个间隔后开始遍历
                // 如果是重复子字符串，当前元素一定等于一个间隔前位置的元素
                // 如果不是，直接更新match，并退出循环
                for (int j = i; j < len; ++j) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        match = false;
                        break;
                    }
                }
                // 判断是否匹配，如果匹配直接返回，不匹配接着找
                if (match) {
                    return true;
                }
            }
        }
        // 最后还没找到说明没有，直接返回false
        return false;
    }
}
