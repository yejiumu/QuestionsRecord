package LeetCode;

/**
 * 解码异或后的数组
 *
 * @author xoke
 * @date 2022/9/25
 */
public class _1720_decode {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.9 MB, 在所有 Java 提交中击败了78.66%的用户
     */
    public int[] decode(int[] encoded, int first) {
        int len = encoded.length;
        int[] ans = new int[len + 1];
        ans[0] = first;
        for (int i = 0; i < len; i++) {
            // 题目求 ans[i] XOR ans[i + 1] == encoded[i]
            // 所以直接进行或运算就 OK了
            ans[i + 1] = ans[i] ^ encoded[i];
        }
        return ans;
    }
}
