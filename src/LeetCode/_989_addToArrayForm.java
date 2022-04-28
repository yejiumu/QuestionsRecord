package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 数组形式的整数加法
 */
public class _989_addToArrayForm {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了79.54%的用户
     * 内存消耗：42.7 MB, 在所有 Java 提交中击败了65.56%的用户
     */
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int len = num.length;
        // 数组从后往前(就是生活中的从个位数到高位数)开始相加
        // i，数组下标，没什么疑问的
        // k，因为是逢十进一，每次运算都要进行除以10的操作
        for (int i = len - 1; i >= 0 || k > 0; i--, k /= 10) {
            // 这里是防止数组越界，因为有可能k的位数会大于num的长度
            // 此时k > 0成立，循环判断条件为true，i减小会小于零，导致数组越界
            if (i >= 0) {
                k += num[i];
            }
            // 将取余结果加入列表中
            list.add(k % 10);
        }
        // 反转列表即为所需结果
        Collections.reverse(list);
        return list;
    }
}
