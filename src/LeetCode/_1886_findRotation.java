package LeetCode;

import java.util.Arrays;

public class _1886_findRotation {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.5 MB, 在所有 Java 提交中击败了70.67%的用户
     */
    public boolean findRotation(int[][] mat, int[][] target) {
        // 矩阵的长和宽
        int len = mat.length;
        // 因为四处都进行翻转，所以只用四分之一的区域即可
        // 行都可以用len / 2表示
        for (int k = 0; k < 4; k++) {
            for (int i = 0; i < len / 2; i++) {
                // 列都可以用(len + 1) / 2表示
                for (int j = 0; j < (len + 1) / 2; j++) {
                    // 对于矩阵中第 i 行的第 j 个元素，在旋转后，它出现在倒数第 i 列的第 j 个位置
                    // 进行四次推导，又回到了原处
                    // 所以可以用一个坐标进行四次覆盖，即可原地翻转得到翻转矩阵
                    int temp = mat[i][j];
                    mat[i][j] = mat[len - j - 1][i];
                    mat[len - j - 1][i] = mat[len - i - 1][len - j - 1];
                    mat[len - i - 1][len - j - 1] = mat[j][len - i - 1];
                    mat[j][len - i - 1] = temp;
                }
            }
            // 遍历矩阵进行相等比较比Arrays.deepEquals()更快
            boolean flag = true;
            f1:
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    if (mat[i][j] != target[i][j]) {
                        flag = false;
                        break f1;
                    }
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }
}
