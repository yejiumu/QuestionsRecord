package LeetCode;

/**
 * 字符串中的第一个唯一字符
 */
public class _387_firstUniqChar {
    public int firstUniqChar(String s) {
        int[][] arr = new int[26][2];
        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - 'a';
            arr[temp][0]++;
            arr[temp][1] = i;
        }
        int min = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            if (ints[0] == 1) {
                min = Math.min(min, ints[1]);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
