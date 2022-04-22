package LeetCode;

/**
 * 下标对中的最大距离
 */
public class _1855_maxDistance {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了80.77%的用户
     * 内存消耗：54 MB, 在所有 Java 提交中击败了72.91%的用户
     */
    public int maxDistance(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int ans = 0;
        // 双指针，i为nums1中位置，j为nums2中位置
        int i = 0;
        for (int j = 0; j < len2; j++) {
            // 找到nums1中大于等于nums2的位置
            while (i < len1 && nums1[i] > nums2[j]) {
                ++i;
            }
            // 防止越界
            if (i < len1) {
                // 比较大小
                ans = Math.max(ans, j - i);
            }
        }
        return ans;
    }
}
