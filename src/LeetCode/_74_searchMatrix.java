package LeetCode;

/**
 * 搜索二维矩阵
 */
public class _74_searchMatrix {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了24.80%的用户
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        // 因为是矩阵每行都是从左到右递增，且下一行第一个大于该行最后一个
        // 所以可以看做是一个一维数组进行二分查找
        int left = 0, right = m * n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // 利用矩阵的特性，取得相应位置的值
            int temp = matrix[mid / n][mid % n];
            if (temp == target) {
                // 一旦找到，返回true
                return true;
            } else if (temp > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        // 没有找到，返回false
        return false;
    }
}
