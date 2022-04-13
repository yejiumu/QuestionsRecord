package LeetCode;

/**
 * 山脉数组的峰顶索引
 */
public class _852_peakIndexInMountainArray {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了13.08%的用户
     */
    public int peakIndexInMountainArray(int[] arr) {
        int len = arr.length;
        int left = 0, right = len - 2, ans = len;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // 寻找峰顶
            if (arr[mid] > arr[mid + 1]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
