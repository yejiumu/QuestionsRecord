package LeetCode;

/**
 * 统计有序矩阵中的负数
 */
public class _1351_countNegatives {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了60.60%的用户
     */
    public int countNegatives(int[][] grid) {
        int n = grid[0].length, ans = 0;
        for (int[] ints : grid) {
            // 在每个数值内进行二分查找(因为是有序的)
            int left = 0, right = n, pos = -1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (ints[mid] >= 0) {
                    left = mid + 1;
                } else {
                    pos = mid;
                    right = mid;
                }
            }
            // 如果pos是-1，说明没有负数
            // 否则，加上数值长度减去pos就是负数的个数，因为是从小到大
            if (pos != -1) {
                ans += n - pos;
            }
        }
        return ans;
    }
}
