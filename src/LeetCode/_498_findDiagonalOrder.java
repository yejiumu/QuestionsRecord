package LeetCode;

/**
 * 对角线遍历
 */
public class _498_findDiagonalOrder {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了81.44%的用户
     * 内存消耗：43.2 MB, 在所有 Java 提交中击败了32.43%的用户
     */
    public int[] findDiagonalOrder(int[][] mat) {
        // 判空
        if (mat == null || mat.length == 0) {
            return new int[0];
        }
        int row = mat.length, col = mat[0].length, len = row * col;
        int r = 0, c = 0;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = mat[r][c];
            // r + c 即为遍历的层数，偶数向上遍历，奇数向下遍历
            if ((r + c) % 2 == 0) {
                // 判断边界
                if (c == col - 1) {
                    // 往下移动一格准备向下遍历
                    r++;
                } else if (r == 0) {
                    // 往右移动一格准备向下遍历
                    c++;
                } else {
                    // 往上移动
                    r--;
                    c++;
                }
            } else {
                // 判断边界
                if (r == row - 1) {
                    // 往右移动一格准备向上遍历
                    c++;
                } else if (c == 0) {
                    // 往下移动一格准备向上遍历
                    r++;
                } else {
                    // 往下移动
                    r++;
                    c--;
                }
            }
        }
        return res;
    }
}
