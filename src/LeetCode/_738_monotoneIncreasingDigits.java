package LeetCode;

/**
 * 单调递增的数字
 *
 * @author xoke
 * @date 2022/11/28
 */
public class _738_monotoneIncreasingDigits {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了94.75%的用户
     * 内存消耗：38.8 MB, 在所有 Java 提交中击败了25.48%的用户
     */
    public int monotoneIncreasingDigits(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        int len = arr.length;
        int index = len;
        for (int i = len - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                arr[i]--;
                index = i + 1;
            }
        }
        for (int i = index; i < len; i++) {
            arr[i] = '9';
        }
        return Integer.parseInt(String.valueOf(arr));
    }
}
