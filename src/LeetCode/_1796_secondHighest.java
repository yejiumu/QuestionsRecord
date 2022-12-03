package LeetCode;

/**
 * 字符串中第二大的数字
 *
 * @author xoke
 * @date 2022/12/3
 */
class _1796_secondHighest {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.6 MB, 在所有 Java 提交中击败了33.58%的用户
     */
    public int secondHighest(String s) {
        // 遍历一遍即可
        int first = -1, second = -1;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int num = ch - '0';
                if (num > first) {
                    second = first;
                    first = num;
                }
                if (num < first && num > second) {
                    second = num;
                }
            }
        }
        return second;
    }
}