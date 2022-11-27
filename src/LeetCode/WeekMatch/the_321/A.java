package LeetCode.WeekMatch.the_321;

/**
 * @author xoke
 * @date 2022/11/27
 */
public class A {
    public int pivotInteger(int n) {
        if (n == 1) {
            return 1;
        }
        for (int i = 1; i < n; i++) {
            int sumX = (1 + i) * i / 2;
            int sumN = (i + n) * (n - i + 1) / 2;
            if (sumX == sumN) {
                return i;
            }
        }
        return -1;
    }
}
