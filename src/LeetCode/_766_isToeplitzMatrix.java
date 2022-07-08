package LeetCode;

/**
 * 托普利茨矩阵
 */
public class _766_isToeplitzMatrix {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了88.27%的用户
     */
    public boolean isToeplitzMatrix(int[][] matrix) {
        // 简单的遍历，直接与左上角的进行比较
        // 本来还以为很复杂🤣
        int m = matrix.length, n = matrix[0].length;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
