package LeetCode.剑指offer.I;

import java.util.Arrays;

/**
 * 把数组排成最小的数
 *
 * @author jiumu
 * @date 2023/2/15
 */
public class _45_minNumber {
    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了96.43%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了42.82%的用户
     */
    public String minNumber(int[] nums) {
        int len = nums.length;
        String[] strs = new String[len];
        for (int i = 0; i < len; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s);
        }
        return res.toString();
    }
}
