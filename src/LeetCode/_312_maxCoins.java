package LeetCode;

/**
 * 戳气球
 *
 * @author xoke
 * @date 2022/12/21
 */
public class _312_maxCoins {
    /**
     * 执行用时：34 ms, 在所有 Java 提交中击败了88.07%的用户
     * 内存消耗：40.9 MB, 在所有 Java 提交中击败了95.10%的用户
     */
    public static int maxCoins(int[] nums) {
        int len = nums.length;
        int[] v = new int[len + 2];
        int[][] dp = new int[len + 2][len + 2];
        for (int i = 1; i <= len; i++) {
            v[i] = nums[i - 1];
        }
        v[0] = v[len + 1] = 1;
        // 从后往前，因为需要前区间和后区间
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i + 2; j <= len + 1; j++) {
                for (int k = i + 1; k < j; k++) {
                    int sum = v[i] * v[k] * v[j];
                    sum += dp[i][k] + dp[k][j];
                    dp[i][j] = Math.max(dp[i][j], sum);
//                    printL(dp);
//                    System.out.println("-------------------");
                }
            }
        }
        return dp[0][len + 1];
    }

//    public static void main(String[] args) {
//        maxCoins(new int[]{3, 1, 5, 8});
//    }
//
//    public static void printL(int[][] arr) {
//        for (int[] ints : arr) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(ints[j] + "\t");
//            }
//            System.out.println();
//        }
//    }
}
