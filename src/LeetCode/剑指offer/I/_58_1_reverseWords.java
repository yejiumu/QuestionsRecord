package LeetCode.剑指offer.I;

/**
 * 翻转单词顺序
 *
 * @author xoke
 * @date 2022/9/28
 */
public class _58_1_reverseWords {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了73.92%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了70.87%的用户
     */
    public String reverseWords(String s) {
        s = s.trim();
        int right = s.length() - 1, left = right;
        StringBuilder ans = new StringBuilder();
        while (left >= 0) {
            // 因为已经删除首尾空格，所以这里是找内部的首个空格
            while (left >= 0 && s.charAt(left) != ' ') {
                left--;
            }
            // 直接添加进字符串中
            ans.append(s, left + 1, right + 1).append(' ');
            // 将字符串中的连续空格跳过
            while (left >= 0 && s.charAt(left) == ' ') {
                left--;
            }
            // 缩小区间
            right = left;
        }
        // 再进行一次删除首尾空格
        return ans.toString().trim();
    }
}
