package LeetCode.WeekMatch.the_310;

import java.util.*;

/**
 * @author xoke
 * @date 2022/9/11
 */
public class A {
    public static void main(String[] args) {
        mostFrequentEven(new int[]{0, 1, 2, 2, 4, 4, 1});
    }

    public static int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if ((num % 2) == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        int max = 0, maxIndex = 0;
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for (int num : list) {
            if (map.get(num) > max) {
                maxIndex = num;
                max = map.get(num);
            }
        }
        return max == 0 ? -1 : maxIndex;
    }
}
