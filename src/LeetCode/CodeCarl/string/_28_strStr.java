package LeetCode.CodeCarl.string;

/**
 * 找出字符串中第一个匹配项的下标
 *
 * @author xoke
 * @date 2022/11/1
 */
public class _28_strStr {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.2 MB, 在所有 Java 提交中击败了88.39%的用户
     */
    public int strStr(String haystack, String needle) {
        int lenH = haystack.length(), lenN = needle.length();
        char[] hay = haystack.toCharArray(), need = needle.toCharArray();
        for (int i = 0; i <= lenH - lenN; i++) {
            int a = i, b = 0;
            while (b < lenN && hay[a] == need[b]) {
                a++;
                b++;
            }
            if (b == lenN) {
                return i;
            }
        }
        return -1;
    }
}
