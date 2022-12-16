package LeetCode;

/**
 * 构成特定和需要添加的最少元素
 *
 * @author xoke
 * @date 2022/12/16
 */
public class _1785_minElements {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：54.7 MB, 在所有 Java 提交中击败了18.25%的用户
     */
    public int minElements(int[] nums, int limit, int goal) {
        // 先求和
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // 直接计算需要多少个limit即可
        long diff = Math.abs(sum - goal);
        return (int) ((diff + limit - 1) / limit);
    }
}
