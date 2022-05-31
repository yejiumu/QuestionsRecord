package LeetCode;

/**
 * 找到最高海拔
 */
public class _1732_largestAltitude {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39 MB, 在所有 Java 提交中击败了72.17%的用户
     */
    public int largestAltitude(int[] gain) {
        int len = gain.length;
        // 从海拔为0开始，先于第一个点的相对海拔进行比较
        int max = Math.max(gain[0], 0);
        // 前缀和，每次加上前面那个数即可
        for (int i = 1; i < len; i++) {
            // 计算每个海拔的高度
            gain[i] = gain[i] + gain[i - 1];
            // 依次进行比较
            max = Math.max(max, gain[i]);
        }
        // 返回最大值
        return max;
    }
}
