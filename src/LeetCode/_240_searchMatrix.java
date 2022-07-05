package LeetCode;

public class _240_searchMatrix {
    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：47.5 MB, 在所有 Java 提交中击败了15.21%的用户
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // 本来我的想法就是这样，可是想了很久没有实现
        int m = matrix.length, n = matrix[0].length;
        // 把起点放到右上角，原先我是(0,0)最小点，不太行
        int row = 0, col = n - 1;
        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            }
            if (matrix[row][col] > target) {
                --col;
            } else {
                ++row;
            }
        }
        return false;
    }
}
