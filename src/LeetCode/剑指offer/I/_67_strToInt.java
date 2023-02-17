package LeetCode.剑指offer.I;

/**
 * 把字符串转换成整数
 *
 * @author jiumu
 * @date 2023/2/17
 */
public class _67_strToInt {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了63.69%的用户
     */
    public int strToInt(String str) {
        // 去重
        str = str.trim();
        int res = 0, boundary = Integer.MAX_VALUE / 10;
        int index = 1, isTrue = 1, len = str.length();
        // 判空
        if (len == 0) {
            return 0;
        }
        // 判断符号
        if (str.charAt(0) == '-') {
            isTrue = -1;
        } else if (str.charAt(0) != '+') {
            index = 0;
        }
        // 进行累加
        for (; index < len; index++) {
            // 判断是否为数字
            if (!Character.isDigit(str.charAt(index))) {
                break;
            }
            // 判断是否超出范围
            if (res > boundary || res == boundary && str.charAt(index) > '7') {
                return isTrue == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + str.charAt(index) - '0';
        }
        return isTrue * res;
    }
}
