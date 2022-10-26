package LeetCode.CodeCarl.list;

/**
 * 赎金信
 *
 * @author xoke
 * @date 2022/10/26
 */
public class _383_canConstruct {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了99.92%的用户
     * 内存消耗：42.1 MB, 在所有 Java 提交中击败了16.57%的用户
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] total = new int[26];
        for (char ch : magazine.toCharArray()) {
            total[ch - 'a']++;
        }
        for (char ch : ransomNote.toCharArray()) {
            total[ch - 'a']--;
            if (total[ch - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
