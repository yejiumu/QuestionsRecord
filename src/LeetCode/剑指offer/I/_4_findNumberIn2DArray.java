package LeetCode.剑指offer.I;

/**
 * 二维数组中的查找
 *
 * @author jiumu
 * @date 2023/2/18
 */
public class _4_findNumberIn2DArray {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：47.2 MB, 在所有 Java 提交中击败了75.93%的用户
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] > target) {
                i--;
            } else if (matrix[i][j] < target) {
                j++;
            } else {
                return true;
            }
        }
        return false;
    }
}
