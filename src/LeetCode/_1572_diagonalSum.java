package LeetCode;

/**
 * 矩阵对角线元素的和
 */
public class _1572_diagonalSum {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了43.02%的用户
     * <p>
     * 最后一个返回语句确实感觉差不多，但是官方的确实是更好
     */
    public int diagonalSum(int[][] mat) {
        int res = 0, len = mat.length, mid = len / 2;
        for (int i = 0; i < len; i++) {
            res += mat[i][i] + mat[i][len - i - 1];
        }
//        return len % 2 == 0 ? res : res - mat[mid][mid];
        return res - mat[mid][mid] * (len & 1);
    }
}
