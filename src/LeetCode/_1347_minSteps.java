package LeetCode;

public class _1347_minSteps {
    /**
     * 执行用时：7 ms, 在所有 Java 提交中击败了75.46%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了75.47%的用户
     */
    public int minSteps(String s, String t) {
        // 两次存储
        int[] nums = new int[26];
        for (char ch : s.toCharArray()) {
            nums[ch - 'a']++;
        }
        int[] num = new int[26];
        for (char ch : t.toCharArray()) {
            num[ch - 'a']++;
        }
        // 然后统计nums与num的差值
        int diff = 0;
        for (int i = 0; i < 26; i++) {
            if (nums[i] > num[i]) {
                diff += nums[i] - num[i];
            }
        }
        return diff;
    }
}
