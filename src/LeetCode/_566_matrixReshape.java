package LeetCode;

import java.util.Arrays;

/**
 * 重塑矩阵
 */
public class _566_matrixReshape {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(matrixReshape(arr, 2, 4)));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat.length * mat[0].length) {
            return mat;
        }
        int[][] ans = new int[r][c];
        int[] arr = new int[r * c];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                arr[i * mat[0].length + j] = mat[i][j];
            }
        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = arr[i * ans[0].length + j];
            }
        }
        return ans;
    }
}
