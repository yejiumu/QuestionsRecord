package LeetCode.剑指offer.I;

/**
 * 0～n-1中缺失的数字
 *
 * @author xoke
 * @date 2022/8/12
 */
public class _53_2_missingNumber {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了78.80%的用户
     */
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int total = len * (len - 1) / 2;
        for (int num : nums) {
            total -= num;
        }
        return total;
    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.8 MB, 在所有 Java 提交中击败了92.03%的用户
     */
    public int missingNumber_(int[] nums) {
        // 因为有序，所以二分快多了
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
