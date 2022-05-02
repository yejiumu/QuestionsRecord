package LeetCode.WeekMatch.the_291;

/**
 * 移除指定数字得到的最大结果
 */
public class A {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了100.00%的用户
     */
    public String removeDigit(String number, char digit) {
        int len = number.length();
        String max = "";
        String temp;
        // 遍历字符串，寻找digit位置，进行删除
        for (int i = 0; i < len; i++) {
            if (number.charAt(i) == digit) {
                temp = number.substring(0, i) + number.substring(i + 1);
                // 用字符串的比较函数，进行比较替换
                if (temp.compareTo(max) > 0) {
                    max = temp;
                }
            }
        }
        // 返回最大字符串即可
        return max;
    }
}
