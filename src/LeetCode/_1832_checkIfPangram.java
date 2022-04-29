package LeetCode;

public class _1832_checkIfPangram {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了86.68%的用户
     * 内存消耗：39.6 MB, 在所有 Java 提交中击败了26.20%的用户
     */
    public boolean checkIfPangram(String sentence) {
        // 字母不过26个
        int[] ans = new int[26];
        // 遍历字符串
        for (char ch : sentence.toCharArray()) {
            // 统计字符对应位置的个数
            ans[ch - 'a']++;
        }
        // 判断字符个数是否符合条件
        for (int num : ans) {
            // 一旦遇到字符串中不存在的字符，返回false
            if (num == 0) {
                return false;
            }
        }
        // 符合条件，返回true
        return true;
    }
}
