package LeetCode.WeekMatch.the_303;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xoke
 * @date 2022/7/24
 */
public class B {
    public int equalPairs(int[][] grid) {
        int len = grid.length;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                boolean flag = true;
                for (int k = 0; k < len; k++) {
                    if (grid[i][k] != grid[k][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
