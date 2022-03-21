package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角 II
 */
public class _119_getRow {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.8 MB, 在所有 Java 提交中击败了50.95%的用户
     *
     * time:O(rowIndex^2)
     */
//    public List<Integer> getRow(int rowIndex) {
//        List<Integer> ans = new ArrayList<>();
//        int[][] arr = new int[rowIndex + 1][];
//        for (int i = 0; i <= rowIndex; i++) {
//            arr[i] = new int[i + 1];
//            for (int j = 0; j <= i; j++) {
//                if (j == 0 || j == arr[i].length - 1) {
//                    arr[i][j] = 1;
//                } else {
//                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
//                }
//                if (i == rowIndex) {
//                    ans.add(arr[i][j]);
//                }
//            }
//        }
//        return ans;
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.1 MB, 在所有 Java 提交中击败了32.99%的用户
     * <p>
     * time:O(rowIndex)
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>();
        res.add(1);
        for (int i = 1; i <= rowIndex; ++i) {
            res.add((int) ((long) res.get(i - 1) * (rowIndex - i + 1) / i));
        }
        return res;
    }
}
