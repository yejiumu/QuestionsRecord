package LeetCode;

/**
 * 将一维数组转变成二维数组
 */
public class _2022_construct2DArray {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了99.92%的用户
     * 内存消耗：48.6 MB, 在所有 Java 提交中击败了47.11%的用户
     */
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[0][0];
        }
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[i * n + j];
            }
        }
        return result;
    }
}
