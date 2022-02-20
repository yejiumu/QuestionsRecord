package LeetCode;

import java.util.Arrays;

/**
 * 相对名次
 */
public class _506_findRelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        String[] decs = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        String[] ans = new String[score.length];
        int[][] arr = new int[score.length][2];
        for (int i = 0; i < score.length; i++) {
            arr[i][0] = score[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> (b[0] - a[0]));
        for (int i = 0; i < score.length; i++) {
            if (i < 3) {
                ans[arr[i][1]] = decs[i];
            } else {
                ans[arr[i][1]] = Integer.toString(i + 1);
            }
        }
        return ans;
    }
}
