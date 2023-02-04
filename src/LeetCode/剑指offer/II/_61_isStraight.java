package LeetCode.剑指offer.II;

import java.util.Arrays;

/**
 * 扑克牌中的顺子
 *
 * @author jiumu
 * @date 2023/2/4
 */
public class _61_isStraight {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39 MB, 在所有 Java 提交中击败了57.37%的用户
     */
    public boolean isStraight(int[] nums) {
        // 先排序，大小王后的数字就是最小值，尾数就是最大值
        Arrays.sort(nums);
        int len = nums.length, joker = 0;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == 0) {
                // 将大小王跳过
                joker++;
            } else if (nums[i] == nums[i + 1]) {
                // 判重，相同直接返回false
                return false;
            }
        }
        // 判断最大值与最小值的差是否小于5即可，连续
        return nums[len - 1] - nums[joker] < 5;
    }
}
