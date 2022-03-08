package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 字符串中的第一个唯一字符
 */
public class _387_firstUniqChar {
    /**
     * 执行用时：31 ms, 在所有 Java 提交中击败了16.22%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了30.50%的用户
     *
     * hash内部还有一系列操作，比单纯的数组操作复杂一些，所以所需时间更高
     */
//    public int firstUniqChar(String s) {
//        Map<Character, Integer> res = new HashMap<>();
//        int len = s.length();
//        for (int i = 0; i < len; i++) {
//            char ch = s.charAt(i);
//            res.put(ch, res.getOrDefault(ch, 0) + 1);
//        }
//        for (int i = 0; i < len; i++) {
//            if (res.get(s.charAt(i)) == 1) {
//                return i;
//            }
//        }
//        return -1;
//    }

    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了75.77%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了41.04%的用户
     */
    public int firstUniqChar(String s) {
        //创建储存26个字母的数组
        int[][] arr = new int[26][2];
        for (int i = 0; i < s.length(); i++) {
            //将特定的字母放置在对应的位置
            //0为该字母出现的个数
            //1为该字母最后出现的位置
            int temp = s.charAt(i) - 'a';
            arr[temp][0]++;
            arr[temp][1] = i;
        }
        int min = Integer.MAX_VALUE;
        for (int[] num : arr) {
            //遍历数组，判断是否有出现个数为1的字母
            if (num[0] == 1) {
                //如果有，将出现的位置最小值更新
                min = Math.min(min, num[1]);
            }
        }
        //判断min的值，如果为初始值，说明没有个数为1的字母，直接返回-1即可
        //如果不是初始值，返回该值即可
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
