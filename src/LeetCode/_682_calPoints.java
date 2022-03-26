package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 棒球比赛
 */
public class _682_calPoints {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了88.66%的用户
     * 内存消耗：39.2 MB, 在所有 Java 提交中击败了52.61%的用户
     */
    public static int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<>();
        int res = 0;
        // 遍历字符串数组
        for (String str : ops) {
            // 取出列表中的最后一位
            int index = list.size() - 1;
            if (str.equals("+")) {
                // 如果是加，将最后一位和倒数第二位相加
                list.add(list.get(index) + list.get(index - 1));
            } else if (str.equals("C")) {
                // 如果是删除，直接将最后一位删除
                list.remove(index);
            } else if (str.equals("D")) {
                // 如果是双倍，直接将最后一位乘2即可
                list.add(list.get(index) * 2);
            } else {
                // 如果都不是，直接将该元素加入列表中
                list.add(Integer.parseInt(str));
            }
        }
        // 遍历列表，将其中的数累加求和即可
        for (int num : list) {
            res += num;
        }
        return res;
    }
}
