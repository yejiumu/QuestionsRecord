package LeetCode;

/**
 * 删列造序
 */
public class _944_minDeletionSize {
    /**
     * 执行用时：7 ms, 在所有 Java 提交中击败了87.14%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了37.14%的用户
     */
    public int minDeletionSize(String[] strs) {
        // 直接遍历
        int row = strs.length;
        int col = strs[0].length();
        int ans = 0;
        // 注意横纵坐标的位置
        for (int j = 0; j < col; ++j) {
            for (int i = 1; i < row; ++i) {
                // 一旦下面的小于上面的字母，ans加一，并退出当前循环
                if (strs[i - 1].charAt(j) > strs[i].charAt(j)) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
