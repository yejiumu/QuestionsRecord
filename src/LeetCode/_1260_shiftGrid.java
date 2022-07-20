package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _1260_shiftGrid {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了74.04%的用户
     * 内存消耗：42.1 MB, 在所有 Java 提交中击败了53.73%的用户
     */
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        // 先创建一个全为0的二维列表
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(0);
            }
            ans.add(row);
        }
        // 二维数组变一维数组，二维列表进行替换
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int index = (i * n + j + k) % (m * n);
                ans.get(index / n).set(index % n, grid[i][j]);
            }
        }
        return ans;
    }
}
