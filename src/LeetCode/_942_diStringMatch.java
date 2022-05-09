package LeetCode;

/**
 * 增减字符串匹配
 */
public class _942_diStringMatch {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了87.44%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了71.82%的用户
     */
    public int[] diStringMatch(String s) {
        int len = s.length();
        // 双指针贪心
        int left = 0, right = len;
        int[] perm = new int[len + 1];
        for (int i = 0; i < len; i++) {
            perm[i] = s.charAt(i) == 'I' ? left++ : right--;
        }
        perm[len] = left;
        return perm;
    }
}
