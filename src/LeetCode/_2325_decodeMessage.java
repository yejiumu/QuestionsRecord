package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 解密消息
 *
 * @author jiumu
 * @date 2023/2/1
 */
public class _2325_decodeMessage {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了66.42%的用户
     * 内存消耗：41.8 MB, 在所有 Java 提交中击败了16.42%的用户
     */
    public String decodeMessage(String key, String message) {
        char cur = 'a';
        // 直接创建哈希表映射即可
        Map<Character, Character> map = new HashMap<>();
        for (char ch : key.toCharArray()) {
            if (ch != ' ' && !map.containsKey(ch)) {
                map.put(ch, cur);
                cur++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : message.toCharArray()) {
            if (ch != ' ') {
                sb.append(map.get(ch));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
