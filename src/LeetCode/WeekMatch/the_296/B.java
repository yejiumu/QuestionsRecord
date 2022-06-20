package LeetCode.WeekMatch.the_296;

import java.util.Arrays;

/**
 * 6091. 划分数组使最大差为 K
 */
public class B {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        int pre = nums[0], ans = 0;
        for (int i = 1; i < len; i++) {
            if (nums[i] - pre > k) {
                pre = nums[i];
                ans++;
            }
        }
        return ans + 1;
    }
}
