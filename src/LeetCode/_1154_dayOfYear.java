package LeetCode;

/**
 * 一年中的第几天
 */
public class _1154_dayOfYear {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));
        int[] count = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            count[1]++;
        }
        int res = 0;
        for (int i = 0; i < month - 1; i++) {
            res += count[i];
        }
        return res + day;
    }
}
