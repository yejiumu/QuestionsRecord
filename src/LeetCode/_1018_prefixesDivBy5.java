package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 可被 5 整除的二进制前缀
 *
 * @author xoke
 * @date 2022/8/3
 */
public class _1018_prefixesDivBy5 {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了97.78%的用户
     * 内存消耗：42.5 MB, 在所有 Java 提交中击败了22.22%的用户
     */
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        int sum = 0;
        for (int num : nums) {
            // 因为这个二进制可能会很长，所以每次都对5进行取余
            sum = ((sum << 1) + num) % 5;
            list.add(sum == 0);
        }
        return list;
    }
}
