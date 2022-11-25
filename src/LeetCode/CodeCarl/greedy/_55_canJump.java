package LeetCode.CodeCarl.greedy;

/**
 * 跳跃游戏
 *
 * @author xoke
 * @date 2022/11/25
 */
public class _55_canJump {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了93.95%的用户
     * 内存消耗：42.3 MB, 在所有 Java 提交中击败了12.82%的用户
     */
    public boolean canJump(int[] nums) {
        // 可以到达的最大范围
        int cover = 0;
        // 长度为1，直接返回true就行
        if (nums.length == 1) {
            return true;
        }
        // 遍历从当前位置到可以到达的最大位置，并且维护最大位置
        for (int i = 0; i <= cover; i++) {
            // 维护最大位置
            cover = Math.max(cover, i + nums[i]);
            // 如果当前最大位置已经可以到达数组最后，直接返回true
            if (cover >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
