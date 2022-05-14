package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * 我的日程安排表 I
 */
public class _729_MyCalendar {
    /**
     * 执行用时：78 ms, 在所有 Java 提交中击败了34.40%的用户
     * 内存消耗：41.8 MB, 在所有 Java 提交中击败了91.66%的用户
     * <p>
     * 最普通的方法，直接遍历
     */
//    class MyCalendar {
//        List<int[]> calendar;
//
//        public MyCalendar() {
//            calendar = new ArrayList<>();
//        }
//
//        public boolean book(int start, int end) {
//            for (int[] tmp : calendar) {
//                if (tmp[0] < end && tmp[1] > start) {
//                    return false;
//                }
//            }
//            calendar.add(new int[]{start, end});
//            return true;
//        }
//    }

    /**
     * 执行用时：27 ms, 在所有 Java 提交中击败了45.70%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了75.85%的用户
     * <p>
     * 没看懂
     */
    class MyCalendar {
        TreeMap<Integer, Integer> calendar;

        public MyCalendar() {
            calendar = new TreeMap<>();
        }

        public boolean book(int start, int end) {
            Integer prev = calendar.floorKey(start),
                    next = calendar.ceilingKey(start);
            if ((prev == null || calendar.get(prev) <= start) &&
                    (next == null || end <= next)) {
                calendar.put(start, end);
                return true;
            }
            return false;
        }
    }
}
