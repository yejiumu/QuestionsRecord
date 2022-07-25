package LeetCode.WeekMatch.the_303;

/**
 * @author xoke
 * @date 2022/7/24
 */
public class A {
    public char repeatedCharacter(String s) {
        int[] nums = new int[26];
        for (char ch : s.toCharArray()) {
            nums[ch - 'a']++;
            if (nums[ch - 'a'] == 2) {
                return ch;
            }
        }
        return 'a';
    }
}
