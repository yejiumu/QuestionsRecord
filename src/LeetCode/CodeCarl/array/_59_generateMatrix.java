package LeetCode.CodeCarl.array;

/**
 * 螺旋矩阵 II
 *
 * @author xoke
 * @date 2022/10/22
 */
public class _59_generateMatrix {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.3 MB, 在所有 Java 提交中击败了75.09%的用户
     */
    public int[][] generateMatrix(int n) {
        // 设定左右上下边界
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int[][] matrix = new int[n][n];
        int num = 1, target = n * n;
        while (num <= target) {
            // 上边界遍历
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            // 上边界下移
            top++;
            // 右边界遍历
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            // 右边界左移
            right--;
            // 下边界遍历
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            // 下边界上移
            bottom--;
            // 左边界遍历
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            // 左边界右移
            left++;
        }
        return matrix;
    }
}
