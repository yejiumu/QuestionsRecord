package LeetCode;

/**
 * 实现 strStr()
 */
public class _28_strStr {
    /**
     * 执行用时：393 ms, 在所有 Java 提交中击败了41.73%的用户
     * 内存消耗：40.9 MB, 在所有 Java 提交中击败了36.98%的用户
     */
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length(), nLen = needle.length();
        char[] hChar = haystack.toCharArray();
        char[] nChar = needle.toCharArray();
        //遍历寻找相同初始字母
        for (int i = 0; i <= hLen - nLen; i++) {
            int left = i, right = 0;
            //从该字母开始遍历
            while (right < nLen && hChar[left] == nChar[right]) {
                ++left;
                ++right;
            }
            //如果right等于匹配字符串的长度，说明前面已经全部相等
            if (right == nLen) {
                //直接返回i，即原字符串匹配该字符串相同的第一个位置
                return i;
            }
        }
        //全部遍历完后，直接返回-1
        return -1;
    }
}
