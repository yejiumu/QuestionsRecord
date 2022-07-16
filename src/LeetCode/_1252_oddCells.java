package LeetCode;

public class _1252_oddCells {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了55.04%的用户
     * 内存消耗：39.6 MB, 在所有 Java 提交中击败了37.98%的用户
     */
    public int oddCells(int m, int n, int[][] indices) {
        // 数据量少，直接模拟
        int ans = 0;
        int[][] matrix = new int[m][n];
        for (int[] index : indices) {
            for (int i = 0; i < n; i++) {
                matrix[index[0]][i]++;
            }
            for (int i = 0; i < m; i++) {
                matrix[i][index[1]]++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((matrix[i][j] & 1) != 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
