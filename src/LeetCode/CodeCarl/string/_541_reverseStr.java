package LeetCode.CodeCarl.string;

/**
 * 反转字符串 II
 *
 * @author xoke
 * @date 2022/10/30
 */
public class _541_reverseStr {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了19.23%的用户
     */
    public String reverseStr(String s, int k) {
        int len = s.length();
        char[] arr = s.toCharArray();
        for (int i = 0; i < len; i += 2 * k) {
            reverse(arr, i, Math.min(i + k, len) - 1);
        }
        return new String(arr);
    }

    public void reverse(char[] arr, int left, int right) {
        while (left < right) {
            arr[left] ^= arr[right];
            arr[right] ^= arr[left];
            arr[left] ^= arr[right];
            left++;
            right--;
        }
    }
}
