package LeetCode;

import java.util.Arrays;

/**
 * 寻找比目标字母大的最小字母
 */
public class _744_nextGreatestLetter {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.5 MB, 在所有 Java 提交中击败了77.56%的用户
     */
    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        // 如果大于等于最大的字母，直接返回第一个字母即可
        if (target >= letters[len - 1]) {
            return letters[0];
        }
        int left = 0, right = len - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                // 如果mid大于target，[left, mid)
                right = mid;
            } else {
                // 如果mid小于等于target，(mid, right]
                left = mid + 1;
            }
        }
        // 此时left = right，一个点
        return letters[left];
    }
}
