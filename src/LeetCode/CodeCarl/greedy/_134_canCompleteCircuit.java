package LeetCode.CodeCarl.greedy;

/**
 * 加油站
 *
 * @author xoke
 * @date 2022/11/25
 */
public class _134_canCompleteCircuit {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了78.60%的用户
     * 内存消耗：61.1 MB, 在所有 Java 提交中击败了39.53%的用户
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // 当前总和和全局总和
        int curSum = 0, totalSum = 0;
        int start = 0, len = gas.length;
        for (int i = 0; i < len; i++) {
            // 两个总和都进行累加
            curSum += gas[i] - cost[i];
            totalSum += gas[i] - cost[i];
            // 如果当前总和 < 0，那么肯定不是从[0, i]出发的
            if (curSum < 0) {
                // 出发位置进行更新
                start = i + 1;
                // 当前总和进行重置
                curSum = 0;
            }
        }
        // 如果全局总和 < 0，那肯定无法走完一圈
        if (totalSum < 0) {
            return -1;
        }
        return start;
    }

    // 暴力会超时
    public int canCompleteCircuit_(int[] gas, int[] cost) {
        int len = cost.length;
        for (int i = 0; i < len; i++) {
            // 记录剩余油量
            int rest = gas[i] - cost[i];
            int index = (i + 1) % len;
            // 模拟以i为起点行驶一圈
            while (rest > 0 && index != i) {
                rest += gas[index] - cost[index];
                index = (index + 1) % len;
            }
            // 如果以i为起点跑一圈，剩余油量>=0，返回该起始位置
            if (rest >= 0 && index == i) {
                return i;
            }
        }
        return -1;
    }
}
