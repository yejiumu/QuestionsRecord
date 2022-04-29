package LeetCode;

/**
 * 最后一个单词的长度
 */
public class _58_lengthOfLastWord {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.8 MB, 在所有 Java 提交中击败了14.67%的用户
     * <p>
     * API选手就位
     */
//    public int lengthOfLastWord(String s) {
//        String[] str = s.split(" ");
//        return str[str.length - 1].length();
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.4 MB, 在所有 Java 提交中击败了75.28%的用户
     */
    public int lengthOfLastWord(String s) {
        // 从后往前遍历寻找第一个单词
        int index = s.length() - 1;
        // 去除最后面的可能存在的空格
        while (s.charAt(index) == ' ') {
            index--;
        }
        // 此时开始遍历最后一个单词，计算长度
        int ans = 0;
        // 不能越界且遇到空格就直接退出
        while (index >= 0 && s.charAt(index) != ' ') {
            index--;
            ans++;
        }
        // 返回结果
        return ans;
    }
}
