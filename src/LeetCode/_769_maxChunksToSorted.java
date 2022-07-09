package LeetCode;

public class _769_maxChunksToSorted {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.5 MB, 在所有 Java 提交中击败了89.46%的用户
     */
    public int maxChunksToSorted(int[] arr) {
        int ans = 0, max = 0;
        for (int i = 0; i < arr.length; ++i) {
            max = Math.max(max, arr[i]);
            // 如果在对应位置，直接分为一组
            // 不然等到最大值到相应位置才能分为一组
            if (max == i) {
                ans++;
            }
        }
        return ans;
    }
}
