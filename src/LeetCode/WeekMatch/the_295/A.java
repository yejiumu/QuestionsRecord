package LeetCode.WeekMatch.the_295;

/**
 * 重排字符形成目标字符串
 */
public class A {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.5 MB, 在所有 Java 提交中击败了100.00%的用户
     */
    public int rearrangeCharacters(String s, String target) {
        int[] nums = new int[26];
        for (char ch : s.toCharArray()) {
            nums[ch - 'a']++;
        }
        int[] mold = new int[26];
        for (char ch : target.toCharArray()) {
            mold[ch - 'a']++;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (mold[i] > 0) {
                min = Math.min(min, nums[i] / mold[i]);
            }
        }
        return min;
    }
}
