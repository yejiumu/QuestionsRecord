package LeetCode.WeekMatch.the_302;

import java.util.*;

public class B {
    /**
     * 执行用时：75 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：57.8 MB, 在所有 Java 提交中击败了100.00%的用户
     */
    public int maximumSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int val = getIndexOfSum(num);
            if (map.containsKey(val)) {
                ans = Math.max(map.get(val) + num, ans);
            }
            map.put(val, num);
        }
        return ans;
    }

    public int getIndexOfSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
