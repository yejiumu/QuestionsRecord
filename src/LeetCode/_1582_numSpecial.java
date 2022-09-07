package LeetCode;

/**
 * 二进制矩阵中的特殊位置
 *
 * @author xoke
 * @date 2022/9/7
 */
public class _1582_numSpecial {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了33.82%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了53.21%的用户
     */
    public int numSpecial(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        // 统计各行各列的和
        int[] row = new int[n];
        int[] col = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                row[i] += mat[i][j];
                col[j] += mat[i][j];
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 判断当前行和当前列的和是否为 1即可
                // 如果为 1，即当前行和当前列没有其他 1
                // 如果不为 1，即当前行和当前列有其他 1
                if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1) {
                    ++ans;
                }
            }
        }
        return ans;
    }
}
