package LeetCode;

import java.util.Arrays;

/**
 * 寻找比目标字母大的最小字母
 */
public class _744_nextGreatestLetter {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.8 MB, 在所有 Java 提交中击败了31.75%的用户
     */
    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        if (target >= letters[len - 1]) {
            return letters[0];
        }
        int left = 0, right = len - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return letters[left];
    }
}
