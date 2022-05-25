package LeetCode;

public class _1400_canConstruct {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42 MB, 在所有 Java 提交中击败了36.00%的用户
     */
    public boolean canConstruct(String s, int k) {
        // 有可能全是单字母，所以字符串长度为答案区间右边界
        int right = s.length();
        // 统计字母个数
        int[] ch = new int[26];
        for (char chs : s.toCharArray()) {
            ++ch[chs - 'a'];
        }
        // 左边界为出现奇数次字母的个数
        int left = 0;
        for (int i = 0; i < 26; i++) {
            if (ch[i] % 2 == 1) {
                left++;
            }
        }
        // 注意没有奇数次的情况
        left = Math.max(left, 1);
        return k <= right && k >= left;
    }
}
