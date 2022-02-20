package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角 II
 */
public class _119_getRow {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        int[][] arr = new int[rowIndex + 1][];
        for (int i = 0; i <= rowIndex; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
                if (i == rowIndex) {
                    ans.add(arr[i][j]);
                }
            }
        }
        return ans;
    }
}
