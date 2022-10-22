package LeetCode.CodeCarl.array;

/**
 * 顺时针打印矩阵
 *
 * @author xoke
 * @date 2022/10/22
 */
public class _offer_I_29_spiralOrder {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了64.22%的用户
     * 内存消耗：42.7 MB, 在所有 Java 提交中击败了98.32%的用户
     */
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        int num = (right + 1) * (bottom + 1), index = 0;
        int[] res = new int[num];
        while (index < num) {
            // 上边界遍历
            for (int i = left; i <= right && index < num; i++) {
                res[index++] = matrix[top][i];
            }
            // 上边界下移
            top++;
            // 右边界遍历
            for (int i = top; i <= bottom && index < num; i++) {
                res[index++] = matrix[i][right];
            }
            // 右边界左移
            right--;
            // 下边界遍历
            for (int i = right; i >= left && index < num; i--) {
                res[index++] = matrix[bottom][i];
            }
            // 下边界上移
            bottom--;
            // 左边界遍历
            for (int i = bottom; i >= top && index < num; i--) {
                res[index++] = matrix[i][left];
            }
            // 左边界右移
            left++;
        }
        return res;
    }
}
