package LeetCode.WeekMatch.the_292;

public class A {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.5 MB, 在所有 Java 提交中击败了100.00%的用户
     */
    public String largestGoodInteger(String num) {
        int max = Integer.MIN_VALUE;
        char[] chars = num.toCharArray();
        int len = num.length();
        for (int i = 0; i <= len - 3; i++) {
            if (chars[i] == chars[i + 1] && chars[i + 1] == chars[i + 2]) {
                max = Math.max(max, (chars[i] - '0') * 100 + (chars[i] - '0') * 10
                        + (chars[i] - '0'));
                i += 2;
                if (chars[i] == '9') {
                    return Integer.toString(max);
                }
            }
        }
        if (max == 0) {
            return "000";
        }
        return max == Integer.MIN_VALUE ? "" : Integer.toString(max);
    }
}
