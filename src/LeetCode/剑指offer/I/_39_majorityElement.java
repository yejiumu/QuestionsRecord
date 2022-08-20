package LeetCode.剑指offer.I;

/**
 * 数组中出现次数超过一半的数字
 *
 * @author xoke
 * @date 2022/8/20
 */
public class _39_majorityElement {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了99.95%的用户
     * 内存消耗：45.1 MB, 在所有 Java 提交中击败了36.93%的用户
     */
    public int majorityElement(int[] nums) {
        // 记录重复的个数和此时的数字
        int count = 0, ans = 0;
        for (int num : nums) {
            // 如果此时个数为0，有可能是初始化或者是相同的和不相同的相互抵消后为0
            if (count == 0) {
                ans = num;
            }
            // 利用过半的特点，两两不相同就相互抵消，剩下的一定是那个数
            count += ans == num ? 1 : -1;
        }
        return ans;
    }
}
