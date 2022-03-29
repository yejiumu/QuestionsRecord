package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 宝石与石头
 */
public class _771_numJewelsInStones {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了69.51%的用户
     * 内存消耗：39.5 MB, 在所有 Java 提交中击败了58.65%的用户
     */
//    public int numJewelsInStones(String jewels, String stones) {
//        Map<Character, Integer> map = new HashMap<>();
//        int res = 0;
//        char[] stone = stones.toCharArray();
//        char[] jewel = jewels.toCharArray();
//        for (char ch : stone) {
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//        for (char ch : jewel) {
//            res += map.getOrDefault(ch, 0);
//        }
//        return res;
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.5 MB, 在所有 Java 提交中击败了59.03%的用户
     */
    public int numJewelsInStones(String jewels, String stones) {
        // 判空
        if (stones == null || stones.isEmpty() || jewels == null || jewels.isEmpty()) {
            return 0;
        }
        // 65~122，所以直接创建58个空间(并且使用byte类型，优化)，方便
        byte[] arr = new byte[58];
        int count = 0;
        // 遍历jewels，得到珍宝的种类
        for (char ch : jewels.toCharArray()) {
            arr[ch - 65] = 1;
        }
        // 遍历stones，统计拥有的珍宝数量
        for (char ch : stones.toCharArray()) {
            if (arr[ch - 65] == 1) {
                count++;
            }
        }
        return count;
    }
}
