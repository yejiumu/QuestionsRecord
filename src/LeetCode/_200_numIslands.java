package LeetCode;

/**
 * 岛屿数量
 */
public class _200_numIslands {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了99.96%的用户
     * 内存消耗：49.5 MB, 在所有 Java 提交中击败了47.58%的用户
     */
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int res = 0;
        int row = grid.length;
        int col = grid[0].length;
        // 遍历数组
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // 遇到1(岛屿)，就加一，并进入bfs遍历将该岛屿的所有1变成0
                if (grid[i][j] == '1') {
                    ++res;
                    bfs(grid, i, j);
                }
            }
        }
        return res;
    }

    void bfs(char[][] grid, int i, int j) {
        int row = grid.length;
        int col = grid[0].length;
        // 设置递归结束条件
        if (i < 0 || j < 0 || i >= row || j >= col || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        bfs(grid, i - 1, j);
        bfs(grid, i + 1, j);
        bfs(grid, i, j - 1);
        bfs(grid, i, j + 1);
    }
}
