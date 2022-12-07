package LeetCode;

/**
 * 通过最少操作次数使数组的和相等
 *
 * @author xoke
 * @date 2022/12/7
 */
public class _1775_minOperations {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：55.2 MB, 在所有 Java 提交中击败了18.18%的用户
     */
    public int minOperations(int[] nums1, int[] nums2) {
        if (6 * nums1.length < nums2.length || 6 * nums2.length < nums1.length) {
            return -1;
        }
        int diff = 0;
        for (int num : nums2) {
            diff += num;
        }
        for (int num : nums1) {
            diff -= num;
        }
        if (diff < 0) {
            diff = -diff;
            int[] t = nums1;
            nums1 = nums2;
            nums2 = t;
        }
        int[] count = new int[6];
        for (int x : nums1) {
            ++count[6 - x];
        }
        for (int x : nums2) {
            ++count[x - 1];
        }
        for (int i = 5, ans = 0; ; --i) {
            if (i * count[i] >= diff) {
                return ans + (diff + i - 1) / i;
            }
            ans += count[i];
            diff -= i * count[i];
        }
    }
}
