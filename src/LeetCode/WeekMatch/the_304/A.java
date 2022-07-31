package LeetCode.WeekMatch.the_304;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author xoke
 * @date 2022/7/31
 */
public class A {
    public int minimumOperations(int[] nums) {
        if (nums.length == 1 && nums[0] != 0) {
            return 1;
        }
        Arrays.sort(nums);
        int len = nums.length;
        int index = 0;
        while (index < len && nums[index] == 0) {
            index++;
        }
        if (index == nums.length) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        int count = 0;
        int ans = nums[len - 1];
        ans -= nums[index];
        count++;
        for (int i = index + 1; i < len; i++) {
            if (ans == 0) {
                return count;
            }
            ans -= nums[i] - nums[i - 1];
            count++;
        }
        return count;
    }
}
