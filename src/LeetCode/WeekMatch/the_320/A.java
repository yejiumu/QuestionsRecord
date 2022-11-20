package LeetCode.WeekMatch.the_320;

import java.util.Arrays;

/**
 * @author xoke
 * @date 2022/11/20
 */
public class A {
    public int unequalTriplets(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length, count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (nums[i] != nums[j] && nums[j] != nums[k]) {
                        ++count;
                    }
                }
            }
        }
        return count;
    }
}
