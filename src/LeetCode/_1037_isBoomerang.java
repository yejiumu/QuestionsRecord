package LeetCode;

/**
 * 有效的回旋镖
 */
public class _1037_isBoomerang {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.4 MB, 在所有 Java 提交中击败了9.32%的用户
     */
    public boolean isBoomerang(int[][] points) {
        // 向量相乘不为零，即不在同一直线上
        int[] v1 = {points[1][0] - points[0][0], points[1][1] - points[0][1]};
        int[] v2 = {points[2][0] - points[0][0], points[2][1] - points[0][1]};
        return v1[0] * v2[1] - v1[1] * v2[0] != 0;
    }
}
