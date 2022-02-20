package LeetCode;

import java.util.Arrays;

/**
 * K 次取反后最大化的数组和
 */
public class _1005_largestSumAfterKNegations {
    public static void main(String[] args) {
        int[] arr = {4,2,3};
        System.out.println(largestSumAfterKNegations(arr, 1));
    }
    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && k > 0) {
                nums[i] = -1 * nums[i];
                k--;
            }
            sum += nums[i];
        }
        Arrays.sort(nums);
        return sum - (k % 2 == 0 ? 0 : 2 * nums[0]);
    }
}
