package LeetCode;

/**
 * 仅执行一次字符串交换能否使两个字符串相等
 */
public class _1790_areAlmostEqual {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.3 MB, 在所有 Java 提交中击败了44.63%的用户
     */
    public boolean areAlmostEqual(String s1, String s2) {
        //如果两个字符串相等，直接返回true
        if (s1.equals(s2)) {
            return true;
        }
        //count记录两字符串不同的数量，left、right记录位置
        //因为最多只能交换一次，所以只设了两个位置
        int count = 0, left = -1, right = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                //记录位置
                if (left == -1) {
                    left = i;
                }
                if (right == -1 && left != i) {
                    right = i;
                }
            }
        }
        //只有count等于2时，并且两字符串的left、right位置交叉相等时，符合条件
        return count == 2 && s2.charAt(left) == s1.charAt(right) && s2.charAt(right) == s1.charAt(left);
    }
}
