package LeetCode.CodeCarl.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 复原 IP 地址
 *
 * @author xoke
 * @date 2022/11/21
 */
public class _93_restoreIpAddresses {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了37.89%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了17.44%的用户
     * <p>
     * 还可以优化
     */
    List<String> list = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12) {
            return list;
        }
        backing(s, 0, 0);
        return list;
    }

    public void backing(String s, int index, int pointCount) {
        if (pointCount == 3) {
            if (isValid(s, index, s.length() - 1)) {
                list.add(s);
            }
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isValid(s, index, i)) {
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);
                backing(s, i + 2, pointCount + 1);
                s = s.substring(0, i + 1) + s.substring(i + 2);
            } else {
                break;
            }
        }
    }

    public boolean isValid(String s, int left, int right) {
        if (left > right) {
            return false;
        }
        if (s.charAt(left) == '0' && left != right) {
            return false;
        }
        int num = 0;
        for (int i = left; i <= right; i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') { // 遇到⾮数字字符不合法
                return false;
            }
            num = num * 10 + (s.charAt(i) - '0');
            if (num > 255) { // 如果⼤于255了不合法
                return false;
            }
        }
        return true;
    }
}
