package LeetCode.CodeCarl.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 水果成篮
 *
 * @author xoke
 * @date 2022/10/20
 */
public class _904_totalFruit {
    /**
     * 执行用时：48 ms, 在所有 Java 提交中击败了39.91%的用户
     * 内存消耗：50.6 MB, 在所有 Java 提交中击败了38.63%的用户
     */
    public int totalFruit(int[] fruits) {
        int len = fruits.length;
        // 用map维护窗口中两个类型及其数量
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, res = 0;
        // 遍历数组
        for (int right = 0; right < len; right++) {
            // 将当前类型添加进map中，如果已经存在，数量加一
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            // 如果已经超过2种类型，循环删除前面重复的类型数量
            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                // 如果此时数量为0，直接从map中移除该类型
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                ++left;
            }
            // 每次取窗口的最大值
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
