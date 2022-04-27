package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字转整数
 */
public class _13_romanToInt {
    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了62.54%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了56.26%的用户
     */
    public int romanToInt(String s) {
        // 哈希表
        Map<Character, Integer> map = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        // 转换为字符数组，便于读取数值操作
        char[] chars = s.toCharArray();
        int len = chars.length;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            int cur = map.get(chars[i]);
            // 因为要考虑罗马数字中的特殊情况
            // 所以要判断当前数值是否小于后一位数值
            if (i < len - 1 && cur < map.get(chars[i + 1])) {
                // 小于，加上后一位数值并且减去当前数值
                ans += map.get(chars[i + 1]) - cur;
                // 再后移一位
                i++;
            } else {
                // 大于，加上当前数值
                ans += cur;
            }
        }
        return ans;
    }
}
