package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 错误的集合
 */
public class _645_findErrorNums {
    /**
     * 执行用时：14 ms, 在所有 Java 提交中击败了22.28%的用户
     * 内存消耗：43.2 MB, 在所有 Java 提交中击败了28.99%的用户
     *
     * 应该是api调用太多次了，时间就上来了
     */
//    public int[] findErrorNums(int[] nums) {
//        int[] err = new int[2];
//        int len = nums.length;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        for (int i = 1; i <= len; i++) {
//            int count = map.getOrDefault(i, 0);
//            if (count == 2) {
//                err[0] = i;
//            } else if (count == 0) {
//                err[1] = i;
//            }
//        }
//        return err;
//    }

    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.9 MB, 在所有 Java 提交中击败了64.66%的用户
     */
    public int[] findErrorNums(int[] nums) {
        // 最简单的数学方法
        int n = nums.length;
        int[] count = new int[n + 1];
        int total = (1 + n) * n / 2;
        int sum = 0, set = 0;
        for (int x : nums) {
            sum += x;
            if (count[x] == 0) {
                // 去重后的总和
                set += x;
            }
            count[x] = 1;
        }
        return new int[]{sum - set, total - set};
    }
}
