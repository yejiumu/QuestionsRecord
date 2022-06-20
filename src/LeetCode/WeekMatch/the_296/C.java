package LeetCode.WeekMatch.the_296;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C {
    public int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for (int num : nums) {
            map.put(num, i++);
        }
        for (int[] operation : operations) {
            int index = map.get(operation[0]);
            map.remove(operation[0]);
            map.put(operation[1], index);
        }
        for (int num : map.keySet()) {
            nums[map.get(num)] = num;
        }
        return nums;
    }
}
