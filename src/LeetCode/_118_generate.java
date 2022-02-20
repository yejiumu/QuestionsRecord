package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 */
public class _118_generate {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：36 MB, 在所有 Java 提交中击败了87.14%的用户
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        int[][] arr = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            List<Integer> tmp = new ArrayList<>();
            arr[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
                tmp.add(arr[i][j]);
            }
            ans.add(tmp);
        }
        return ans;
    }
}
