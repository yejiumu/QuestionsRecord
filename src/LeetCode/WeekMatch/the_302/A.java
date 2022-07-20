package LeetCode.WeekMatch.the_302;

import java.util.HashMap;
import java.util.Map;

public class A {
    public int[] numberOfPairs(int[] nums) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : map.keySet()) {
            ans[0] += map.get(num) / 2;
            ans[1] += map.get(num) % 2;
        }
        return ans;
    }
}
