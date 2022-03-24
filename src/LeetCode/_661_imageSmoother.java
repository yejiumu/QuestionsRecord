package LeetCode;

/**
 * 图片平滑器
 */
public class _661_imageSmoother {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了90.44%的用户
     * 内存消耗：42.2 MB, 在所有 Java 提交中击败了25.84%的用户
     * <p>
     * 直接大遍历🐮
     */
    public int[][] imageSmoother(int[][] img) {
        int m = img.length, n = img[0].length;
        int[][] res = new int[m][n];
        // 遍历数组
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 设置新的变量，表示3 * 3的范围
                int sum = 0, num = 0;
                for (int x = i - 1; x <= i + 1; x++) {
                    for (int y = j - 1; y <= j + 1; y++) {
                        // 设置判断条件，防止数组越界
                        if (x >= 0 && x < m && y >= 0 && y < n) {
                            ++num;
                            sum += img[x][y];
                        }
                    }
                }
                res[i][j] = sum / num;
            }
        }
        return res;
    }
}
