//package LeetCode.WeekMatch.the_302;
//
//import java.util.*;
//
//public class B {
//    public static void main(String[] args) {
//        maximumSum(new int[]{18, 43, 36, 13, 7});
//    }
//
//    public static int maximumSum(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, 0);
//        }
//        Arrays.sort(map, new Comparator<Object>() {
//            public int compare(Object a, Object b) {
//                int numA = 0, numB = 0;
//                for (char ch : a.toString().toCharArray()) {
//                    numA += ch - '0';
//                }
//                for (char ch : b.toString().toCharArray()) {
//                    numB += ch - '0';
//                }
//                int lenA = a.toString().length();
//                int lenB = b.toString().length();
//                map.put((Integer) a, lenA);
//                map.put((Integer) b, lenB);
//                if (numA == numB) {
//                    return (int) a - (int) b;
//                } else {
//                    return numA - numB;
//                }
//            }
//        });
//        int ans = -1;
//        int temp = 0;
//        int index = 0;
//        for (int num : map.keySet()) {
//            if (map.get(num) == temp) {
//                ans = Math.max(ans, index + map.get(num));
//            } else {
//                temp = map.get(num);
//                index = num;
//            }
//        }
//        return ans;
//    }
//}
