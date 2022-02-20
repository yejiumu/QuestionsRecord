package LeetCode;

/**
 * 完美数
 */
public class _507_checkPerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if (num == 1){
            return false;
        }
        int result = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                result += (i + num / i);
            }
        }
        return result == 2 * num;
    }
}
