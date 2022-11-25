package LeetCode.CodeCarl.greedy;

/**
 * 跳跃游戏 II
 *
 * @author xoke
 * @date 2022/11/25
 */
public class _45_jump {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了42.89%的用户
     * 内存消耗：41.8 MB, 在所有 Java 提交中击败了63.40%的用户
     */
    public int jump(int[] nums) {
        // 当前可以到达的最大距离
        int curDist = 0;
        // 跳跃步数
        int step = 0;
        // 下次可以到达的最大距离
        int nextDist = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            // 维护可以到达的最大距离
            nextDist = Math.max(nextDist, i + nums[i]);
            // 如果到达目前可以到达的最大距离
            if (i == curDist) {
                // 用下次可以到达的最大距离进行更新
                curDist = nextDist;
                // 进行下次跳跃
                ++step;
            }
        }
        // 最后返回步数即可
        return step;
    }
}
