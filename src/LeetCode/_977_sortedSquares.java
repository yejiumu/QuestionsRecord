package LeetCode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 有序数组的平方
 */
public class _977_sortedSquares {
    /**
     * 执行用时：29 ms, 在所有 Java 提交中击败了6.54%的用户
     * 内存消耗：43.2 MB, 在所有 Java 提交中击败了31.16%的用户
     *
     * sb了，想到排序要求O(N)就去用优先队列了，这个主要是数组
     */
//    public static int[] sortedSquares(int[] nums) {
//        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> a - b);
//        for (int num : nums) {
//            queue.add(num * num);
//        }
//        int[] ans = new int[queue.size()];
//        for (int i = 0; i < ans.length; i++) {
//            ans[i] = queue.poll();
//        }
//        return ans;
//    }

    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了28.19%的用户
     * 内存消耗：43.1 MB, 在所有 Java 提交中击败了38.61%的用户
     * <p>
     * 原地平方，后排序
     */
//    public static int[] sortedSquares(int[] nums) {
//        int len = nums.length;
//        for (int i = 0; i < len; i++) {
//            nums[i] = nums[i] * nums[i];
//        }
//        Arrays.sort(nums);
//        return nums;
//    }

    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：43 MB, 在所有 Java 提交中击败了54.54%的用户
     * <p>
     * 数组排序还是得靠双指针
     */
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0, j = n - 1, pos = n - 1; i <= j; ) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                ans[pos] = nums[i] * nums[i];
                ++i;
            } else {
                ans[pos] = nums[j] * nums[j];
                --j;
            }
            --pos;
        }
        return ans;
    }
}
