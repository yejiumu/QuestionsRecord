package LeetCode.CodeCarl.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 螺旋矩阵
 *
 * @author xoke
 * @date 2022/10/22
 */
public class _54_spiralOrder {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.1 MB, 在所有 Java 提交中击败了98.38%的用户
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        // 限定左右上下边界
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        int num = (right + 1) * (bottom + 1);
        while (num >= 1) {
            // 上边界遍历
            for (int i = left; i <= right && num >= 1; i++) {
                list.add(matrix[top][i]);
                num--;
            }
            // 上边界下移
            top++;
            // 右边界遍历
            for (int i = top; i <= bottom && num >= 1; i++) {
                list.add(matrix[i][right]);
                num--;
            }
            // 右边界左移
            right--;
            // 下边界遍历
            for (int i = right; i >= left && num >= 1; i--) {
                list.add(matrix[bottom][i]);
                num--;
            }
            // 下边界上移
            bottom--;
            // 左边界遍历
            for (int i = bottom; i >= top && num >= 1; i--) {
                list.add(matrix[i][left]);
                num--;
            }
            // 左边界右移
            left++;
        }
        return list;
    }
}
