package LeetCode.剑指offer.II;

/**
 * 排序数组中两个数字之和
 *
 * @author xoke
 * @date 2022/8/1
 */
public class _006_twoSum {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了43.50%的用户
     */
    public int[] twoSum(int[] numbers, int target) {
        // 因为有序，所以直接双指针，分别指向最大值和最小值
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum > target) {
                // 如果当前和大于target，右指针向中间移(即减小)
                right--;
            } else if (sum < target) {
                // 如果当前和小于target，左指针向中间移(即增大)
                left++;
            } else {
                // 如果等于，直接返回
                return new int[]{left, right};
            }
        }
        return new int[0];
    }
}
