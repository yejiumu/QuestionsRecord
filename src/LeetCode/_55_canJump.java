package LeetCode;

/**
 * 跳跃游戏
 *
 * @author xoke
 * @date 2022/9/24
 */
public class _55_canJump {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了94.36%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了91.44%的用户
     */
    public boolean canJump(int[] nums) {
        // 最大可到达距离
        int maxDist = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            // 如果当前位置已经超过了最大可到达距离，直接返回false
            if (i > maxDist) {
                return false;
            }
            // 更新最大可到达距离
            maxDist = Math.max(nums[i] + i, maxDist);
            // 最大可到达距离已经超过了终点，直接返回true
            if (maxDist >= len - 1) {
                return true;
            }
        }
        return true;
    }
}
