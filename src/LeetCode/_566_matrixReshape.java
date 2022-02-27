package LeetCode;

import java.util.Arrays;

/**
 * 重塑矩阵
 */
public class _566_matrixReshape {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了28.91%的用户
     * 内存消耗：42.3 MB, 在所有 Java 提交中击败了14.36%的用户
     *
     * 思想还没到位，创建并遍历了一个一维数组进行储存这样就多用了一次双重for循环，浪费了时间
     */
//    public static int[][] matrixReshape(int[][] mat, int r, int c) {
//        int m = mat.length;
//        int n = mat[0].length;
//        if (r * c != m * n) {
//            return mat;
//        }
//        int[][] res = new int[r][c];
//        int[] arr = new int[r * c];
//        for (int i = 0; i < r * c; i++) {
//            arr[i] = mat[i / m][i % n];
//        }
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                res[r][c] = arr[r * i + j];
//            }
//        }
//        return res;
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.2 MB, 在所有 Java 提交中击败了16.82%的用户
     */
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length;
        int n = nums[0].length;
        //直接把空间和原数组不相同的pass掉
        if (m * n != r * c) {
            return nums;
        }
        int[][] ans = new int[r][c];
        for (int x = 0; x < m * n; ++x) {
            //这一步用的挺妙的，看成一维数组进行赋值操作
            ans[x / c][x % c] = nums[x / n][x % n];
        }
        return ans;
    }
}
