package LeetCode;

/**
 * 一周中的第几天
 */
public class _1185_dayOfTheWeek {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：35.7 MB, 在所有 Java 提交中击败了41.95%的用户
     */
    public String dayOfTheWeek(int day, int month, int year) {
        String[] result = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 365 * (year - 1971) + (year - 1969) / 4;
        for (int i = 0; i < month - 1; i++) {
            days += monthDays[i];
        }
        if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && month >= 3) {
            days++;
        }
        days += day;
        return result[(days + 4) % 7];
    }
    /*
     * 执行用时：12 ms, 在所有 Java 提交中击败了11.02%的用户
     * 内存消耗：38.3 MB, 在所有 Java 提交中击败了8.48%的用户
     */
//    public String dayOfTheWeek(int day, int month, int year) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(year, month, day);
//        String[] result = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//        return result[calendar.get(Calendar.DAY_OF_WEEK)];
//    }
}
