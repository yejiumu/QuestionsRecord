package LeetCode.WeekMatch.the_321;

import java.util.Arrays;

/**
 * @author xoke
 * @date 2022/11/27
 */
public class D {
    // 超时，有点没办法，子数组还是有点不熟，虽然优化了一下
    public int countSubarrays(int[] nums, int k) {
        int len = nums.length;
        int res = 0;
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == k) {
                index = i;
                break;
            }
        }
        for (int i = 0; i < len; i++) {
            if (i > index) {
                break;
            }
            for (int j = index; j < len; j++) {
                if (sortAndSearch(nums, i, j) == k) {
                    ++res;
                }
            }
        }
        return res;
    }

    public int sortAndSearch(int[] nums, int left, int right) {
        int[] arr = Arrays.copyOfRange(nums, left, right + 1);
        Arrays.sort(arr);
        int len = arr.length;
        if (len == 0 || len % 2 == 1) {
            return arr[len / 2];
        }
        return arr[len / 2 - 1];
    }
}
