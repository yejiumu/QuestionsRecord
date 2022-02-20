package LeetCode;

/**
 * 合并两个有序数组
 */
@SuppressWarnings("all")
public class _88_merge {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了74.73%的用户
     *
     * 时间复杂度：O((m+n)log(m+n))
     * 空间复杂度：O(log(m+n))
     */
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        for (int i = 0; i < n; i++) {
//            nums1[m + i] = nums2[i];
//        }
//        Arrays.sort(nums1);
//    }

    /**
     * "逆向双指针"
     * <p>
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.3 MB, 在所有 Java 提交中击败了84.96%的用户
     * <p>
     * 时间复杂度：O(m+n)
     * 空间复杂度：O(1)
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1;
        int tail = m + n - 1;
        int cur;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                cur = nums2[p2--];
            } else if (p2 == -1) {
                cur = nums1[p1--];
            } else if (nums1[p1] > nums2[p2]) {
                cur = nums1[p1--];
            } else {
                cur = nums2[p2--];
            }
            nums1[tail--] = cur;
        }
    }
}
