package LeetCode.CodeCarl.array;

import java.util.Arrays;

/**
 * 有序数组的平方
 *
 * @author xoke
 * @date 2022/10/19
 */
public class _977_sortedSquares {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了24.45%的用户
     * 内存消耗：43.2 MB, 在所有 Java 提交中击败了42.56%的用户
     */
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = nums[i] * nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
