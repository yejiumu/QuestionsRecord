package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 矩阵置零
 */
public class _73_setZeroes {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了70.69%的用户
     * 内存消耗：42.9 MB, 在所有 Java 提交中击败了19.77%的用户
     */
    public void setZeroes(int[][] matrix) {
        //用于保存数组中零的位置
        List<int[]> list = new ArrayList<>();
        int rows = matrix.length, cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    //如果该位置为零，将新建一个数组并保存在列表中
                    int[] arr = new int[2];
                    arr[0] = i;
                    arr[j] = j;
                    list.add(arr);
                }
            }
        }
        //遍历列表的数组集合
        for (int[] arr : list) {
            //将原数组行列分开遍历，特定位置赋值为零
            for (int i = 0; i < rows; i++) {
                matrix[i][arr[1]] = 0;
            }
            for (int i = 0; i < cols; i++) {
                matrix[arr[0]][i] = 0;
            }
        }
    }
}
