package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 字符串中不同整数的数目
 *
 * @author xoke
 * @date 2022/12/6
 */
public class _1805_numDifferentIntegers {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.6 MB, 在所有 Java 提交中击败了78.34%的用户
     */
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        int len = word.length(), left = 0, right = 0;
        while (true) {
            // 找数字
            while (left < len && !Character.isDigit(word.charAt(left))) {
                left++;
            }
            // 退出条件
            if (left == len) {
                break;
            }
            // 数字范围
            right = left;
            while (right < len && Character.isDigit(word.charAt(right))) {
                right++;
            }
            // 去除前导0
            while (right - left > 1 && word.charAt(left) == '0') {
                left++;
            }
            // 加入set中进行去重
            set.add(word.substring(left, right));
            // 寻找下一个数字
            left = right;
        }
        return set.size();
    }
}
