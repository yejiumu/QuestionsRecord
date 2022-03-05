package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 两个列表的最小索引总和
 */
public class _599_findRestaurant {
    /**
     * 执行用时：98 ms, 在所有 Java 提交中击败了12.48%的用户
     * 内存消耗：42.1 MB, 在所有 Java 提交中击败了10.67%的用户
     * <p>
     * 循环太多了😢
     */
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<Integer, List<String>> favor = new HashMap<>();
        int len1 = list1.length, len2 = list2.length;
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                //循环找相同
                if (list1[i].equals(list2[j])) {
                    //如果还没有，就创建一个新的以(i + j)为索引的list
                    if (!favor.containsKey(i + j)) {
                        favor.put(i + j, new ArrayList<>());
                    }
                    //如果已经存在，在list中添加当前元素
                    favor.get(i + j).add(list1[i]);
                }
            }
        }
        //寻找最小和
        int min = Integer.MAX_VALUE;
        for (int num : favor.keySet()) {
            min = Math.min(min, num);
        }
        //创建字符串数组，并将表中数组转换成此数组
        String[] res = new String[favor.get(min).size()];
        return favor.get(min).toArray(res);
    }
}
