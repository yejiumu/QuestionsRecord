package LeetCode;

/**
 * 可以形成最大正方形的矩形数目
 */
public class _1725_countGoodRectangles {
    /*
     * 执行用时：3 ms, 在所有 Java 提交中击败了21.26%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了48.38%的用户
     */
//    public int countGoodRectangles(int[][] rectangles) {
//        int len = rectangles.length;
//        int[] resArr = new int[len];
//        for (int i = 0; i < len; i++) {
//            resArr[i] = Math.min(rectangles[i][0], rectangles[i][1]);
//        }
//        Arrays.sort(resArr);
//        int res = 0;
//        for (int i = len - 1; i >= 0; i--) {
//            if (resArr[len - 1] == resArr[i]) {
//                res++;
//            }
//        }
//        return res;
//    }

    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了73.33%的用户
     */
    public int countGoodRectangles(int[][] rectangles) {
        int max = 0, ans = 0;
        for (int[] r : rectangles) {
            int cur = Math.min(r[0], r[1]);
            if (cur == max) {
                ans++;
            } else if (cur > max) {
                max = cur;
                ans = 1;
            }
        }
        return ans;
    }
}
