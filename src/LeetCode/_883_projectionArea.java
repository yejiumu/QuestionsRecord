package LeetCode;

/**
 * 三维形体投影面积
 */
public class _883_projectionArea {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了69.63%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了38.04%的用户
     */
    public int projectionArea(int[][] grid) {
        int len = grid.length;
        // 三视图面积
        // xy为每个位置不为0的总和
        // yz为每列最大值的总和
        // xz为每行最大值的总和
        int xyArea = 0, yzArea = 0, xzArea = 0;
        // 遍历寻找每行每列最大值
        for (int i = 0; i < len; i++) {
            int xzHeight = 0, yzHeight = 0;
            for (int j = 0; j < len; j++) {
                // 判断是否不为0，不为0则自增
                xyArea += grid[i][j] != 0 ? 1 : 0;
                // 该行最大值
                xzHeight = Math.max(xzHeight, grid[i][j]);
                // 该列最大值
                yzHeight = Math.max(yzHeight, grid[j][i]);
            }
            // 将每行每列最大值分别对应相加
            yzArea += yzHeight;
            xzArea += xzHeight;
        }
        // 然后返回三个面积相加之和
        return xyArea + xzArea + yzArea;
    }
}
