package LeetCode;

/**
 * 旋转图像
 */
public class _48_rotate {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.4 MB, 在所有 Java 提交中击败了14.10%的用户
     */
    public void rotate(int[][] matrix) {
        // 矩阵的长和宽
        int len = matrix.length;
        // 因为四处都进行翻转，所以只用四分之一的区域即可
        // 行都可以用len / 2表示
        for (int i = 0; i < len / 2; i++) {
            // 列都可以用(len + 1) / 2表示
            for (int j = 0; j < (len + 1) / 2; j++) {
                // 对于矩阵中第 i 行的第 j 个元素，在旋转后，它出现在倒数第 i 列的第 j 个位置
                // 进行四次推导，又回到了原处
                // 所以可以用一个坐标进行四次覆盖，即可原地翻转得到翻转矩阵
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len - j - 1][i];
                matrix[len - j - 1][i] = matrix[len - i - 1][len - j - 1];
                matrix[len - i - 1][len - j - 1] = matrix[j][len - i - 1];
                matrix[j][len - i - 1] = temp;
            }
        }
    }
}
