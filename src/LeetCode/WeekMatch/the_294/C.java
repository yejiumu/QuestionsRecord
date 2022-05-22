package LeetCode.WeekMatch.the_294;

import java.util.*;

public class C {
//    public static int minimumLines(int[][] stockPrices) {
//        Arrays.sort(stockPrices, (a, b) -> a[0] - b[0]);
//        Map<Double, List<Double>> map = new HashMap<>();
//        int len = stockPrices.length;
//        int ans = 0;
//        for (int i = 1; i < len; i++) {
//            int a = stockPrices[i][1] - stockPrices[i - 1][1];
//            int b = stockPrices[i][0] - stockPrices[i - 1][0];
//            int y = stockPrices[i][1];
//            int x = stockPrices[i][0];
//            double k = 1.0 * a / b;
//            double c = y - k * x;
//            if (!map.containsKey(k)) {
//                map.put(k, new ArrayList<>());
//                map.get(k).add(c);
//            }
//            if (!map.get(k).contains(c)) {
//                map.get(k).add(c);
//            }
//        }
//        for (List<Double> list : map.values()) {
//            ans += list.size();
//        }
//        return ans;
//    }

    /**
     * 执行用时：32 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：87.3 MB, 在所有 Java 提交中击败了100.00%的用户
     */
    public int minimumLines(int[][] stockPrices) {
        Arrays.sort(stockPrices, (o1, o2) -> o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[2]);
        int n = stockPrices.length, res = 1;
        if (n == 1) return 0;
        for (int i = 2; i < n; i++) {
            int x1 = stockPrices[i][0] - stockPrices[i - 1][0];
            int y1 = stockPrices[i][1] - stockPrices[i - 1][1];
            int x2 = stockPrices[i - 1][0] - stockPrices[i - 2][0];
            int y2 = stockPrices[i - 1][1] - stockPrices[i - 2][1];
            if (x1 * y2 != y1 * x2) {
                res++;
            }
        }
        return res;
    }
}
