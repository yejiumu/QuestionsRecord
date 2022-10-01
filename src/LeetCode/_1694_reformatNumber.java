package LeetCode;

/**
 * 重新格式化电话号码
 *
 * @author xoke
 * @date 2022/10/1
 */
public class _1694_reformatNumber {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了97.83%的用户
     * 内存消耗：39.5 MB, 在所有 Java 提交中击败了81.59%的用户
     */
    public String reformatNumber(String number) {
        // 直接模拟即可
        String s = number.replace(" ", "").replace("-", "");
        int len = s.length();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < len; i += 3) {
            if (str.length() != 0) {
                str.append("-");
            }
            if (i + 5 > len) {
                if (i + 3 >= len) {
                    str.append(s.substring(i));
                } else {
                    str.append(s, i, i + 2).append("-").append(s.substring(i + 2));
                }
                break;
            }
            str.append(s, i, i + 3);
        }
        return str.toString();
    }
}
