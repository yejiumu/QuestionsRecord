package LeetCode;

/**
 * 两数之和 II - 输入有序数组
 */
public class _167_twoSum {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了89.76%的用户
     * 内存消耗：44 MB, 在所有 Java 提交中击败了47.63%的用户
     */
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[]{-1, -1};
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                ans[0] = left + 1;
                ans[1] = right + 1;
                break;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return ans;
    }
}
