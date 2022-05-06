package LeetCode;

import java.util.Arrays;

public class _304_NumMatrix {
    /**
     * 执行用时：1763 ms, 在所有 Java 提交中击败了5.02%的用户
     * 内存消耗：69.1 MB, 在所有 Java 提交中击败了5.05%的用户
     * <p>
     * 暴力
     */
//    class NumMatrix {
//
//        int[][] matrix;
//
//        public NumMatrix(int[][] matrix) {
//            int row = matrix.length;
//            int col = matrix[0].length;
//            this.matrix = new int[row][col];
//            for (int i = 0; i < row; i++) {
//                this.matrix[i] = Arrays.copyOf(matrix[i], col);
//            }
//        }
//
//        public int sumRegion(int row1, int col1, int row2, int col2) {
//            int sum = 0;
//            for (int i = row1; i < row2; i++) {
//                for (int j = col1; j < col2; j++) {
//                    sum += matrix[i][j];
//                }
//            }
//            return sum;
//        }
//    }

    /**
     * 执行用时：129 ms, 在所有 Java 提交中击败了16.63%的用户
     * 内存消耗：63.7 MB, 在所有 Java 提交中击败了45.58%的用户
     * <p>
     * 这个类只有一个方法，所以肯定是一直调这个方法，
     * 所以这个方法复杂度不可以太高，构造器可以高点，因为只初始化一次
     */
    class NumMatrix {

        int[][] sums;

        public NumMatrix(int[][] matrix) {
            int row = matrix.length;
            int col = matrix[0].length;
            sums = new int[row][col + 1];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    //因为这个类是肯定不会调用自己的数组的，所以数组里存什么就以方法方便为主
                    //直接存前N项和(前缀和)
                    sums[i][j + 1] = matrix[i][j] + sums[i][j];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int sum = 0;
            for (int i = row1; i <= row2; i++) {
                //由上述，直接每行相减后求和即可
                sum += sums[i][col2 + 1] - sums[i][col1];
            }
            return sum;
        }
    }
}
