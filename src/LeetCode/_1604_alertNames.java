package LeetCode;

import java.util.*;

/**
 * 警告一小时内使用相同员工卡大于等于三次的人
 *
 * @author jiumu
 * @date 2023/2/7
 */
public class _1604_alertNames {
    /**
     * 执行用时：63 ms, 在所有 Java 提交中击败了75.42%的用户
     * 内存消耗：61.6 MB, 在所有 Java 提交中击败了52.50%的用户
     */
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        int len = keyName.length;
        // 先将数据加入哈希表
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            String name = keyName[i];
            String time = keyTime[i];
            map.putIfAbsent(name, new ArrayList<>());
            // 特殊处理时间，将其转化为那天经历的分钟数
            int total = Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3));
            map.get(name).add(total);
        }
        List<String> res = new ArrayList<>();
        for (String name : map.keySet()) {
            List<Integer> list = map.get(name);
            Collections.sort(list);
            int size = list.size();
            // 直接以3位间隔，进行计算
            for (int i = 2; i < size; i++) {
                if (list.get(i) - list.get(i - 2) <= 60) {
                    res.add(name);
                    break;
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}
