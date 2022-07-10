package LeetCode;

public class _409_longestPalindrome {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.9 MB, 在所有 Java 提交中击败了24.10%的用户
     */
    public int longestPalindrome(String s) {
        // 直接创建足够大的数组，方便存储
        int[] nums = new int[128];
        // 计数
        for (char ch : s.toCharArray()) {
            nums[ch - 'A']++;
        }
        int ans = 0;
        for (int num : nums) {
            // 记最大偶数和
            ans += num / 2 * 2;
            // 只能包含一个奇数，而且一定是中间那个，所以加一
            if (num % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}
