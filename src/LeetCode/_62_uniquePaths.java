package LeetCode;

/**
 * 不同路径
 *
 * @author xoke
 * @date 2022/8/2
 */
public class _62_uniquePaths {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了39.59%的用户
     */
    public int uniquePaths(int m, int n) {
        // 直接创建地图
        int[][] arr = new int[m][n];
        // 将右边界全部置为1
        for (int i = 0; i < m; i++) {
            arr[i][0] = 1;
        }
        // 将上边界全部置为1
        for (int j = 0; j < n; j++) {
            arr[0][j] = 1;
        }
        // 将右上边界置为1表示从该位置出来的路径条数
        // 下面接着从内部开始统计路径数量
        // 当前位置的路径数量arr[i][j] = 上方位置数量arr[i - 1][j] + 左方位置数量arr[i][j - 1]
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
        // 最后直接返回终点数量即可
        return arr[m - 1][n - 1];
    }
}
