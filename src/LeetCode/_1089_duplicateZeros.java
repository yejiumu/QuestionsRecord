package LeetCode;

/**
 * 复写零
 */
public class _1089_duplicateZeros {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.8 MB, 在所有 Java 提交中击败了41.05%的用户
     */
    public void duplicateZeros(int[] arr) {
        // 双指针
        int len = arr.length, i = 0, j = 0;
        while (j < len) {
            // 遇到0跳过，右指针右移
            if (arr[i] == 0) {
                j++;
            }
            i++;
            j++;
        }
        i--;
        j--;
        while (i >= 0) {
            if (j < len) {
                arr[j] = arr[i];
            }
            if (arr[i] == 0 && --j >= 0) {
                arr[j] = 0;
            }
            i--;
            j--;
        }
    }
}
