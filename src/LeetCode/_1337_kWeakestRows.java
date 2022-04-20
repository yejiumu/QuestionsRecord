package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 矩阵中战斗力最弱的 K 行
 */
public class _1337_kWeakestRows {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了99.56%的用户
     * 内存消耗：42.6 MB, 在所有 Java 提交中击败了25.57%的用户
     */
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        int[][] ans = new int[m][2];
        for (int i = 0; i < m; i++) {
            // 二分找1的个数
            int left = 0, right = n - 1, pos = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (mat[i][mid] == 1) {
                    pos = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            // 将行数和该行1的个数进行赋值
            ans[i][0] = i;
            ans[i][1] = pos;
        }
        // 按1的个数进行排序(从大到小)
        Arrays.sort(ans, (a, b) -> a[1] - b[1]);
        // 创建k个大小的数组
        int[] res = new int[k];
        // 依次进行赋值
        for (int i = 0; i < k; i++) {
            res[i] = ans[i][0];
        }
        // 然后返回即可
        return res;
    }
}
