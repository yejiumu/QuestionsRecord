package LeetCode;

import java.util.*;

/**
 * 仅仅反转字母
 */
public class _917_reverseOnlyLetters {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了43.97%的用户
     * 内存消耗：39.5 MB, 在所有 Java 提交中击败了11.78%的用户
     * <p>
     * 想法有点蠢，简单的双指针题用StringBuffer
     */
//    public String reverseOnlyLetters(String s) {
//        StringBuffer str = new StringBuffer();
//        int[][] map = new int[s.length()][2];
//        char ch;
//        for (int i = 0, j = 0; i < s.length(); i++) {
//            Arrays.fill(map[i], 10);
//            ch = s.charAt(i);
//            if (Character.isLetter(ch)) {
//                str.append(ch);
//            } else {
//                map[j][0] = i;
//                map[j++][1] = ch;
//            }
//        }
//        str.reverse();
//        for (int i = 0; i < map.length; i++) {
//            if (map[i][1] == 10) {
//                break;
//            }
//            str.insert(map[i][0], (char) map[i][1]);
//
//        }
//        return str.toString();
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.8 MB, 在所有 Java 提交中击败了23.85%的用户
     */
    public String reverseOnlyLetters(String s) {
        //将字符串转换成数组，可以直接进行索引调用
        char[] arr = s.toCharArray();
        int len = arr.length;
        for (int left = 0, right = len - 1; left < right; ) {
            //从左往右遍历，不是字母就跳过，遇到字母停下
            while (left < right && !Character.isLetter(arr[left])) {
                left++;
            }
            //从右往左遍历，不是字母就跳过，遇到字母停下
            while (left < right && !Character.isLetter(arr[right])) {
                right--;
            }
            //left指针和right指针交换位置
            if (left < right) {
                char ch = arr[left];
                arr[left++] = arr[right];
                arr[right--] = ch;
            }
        }
        //当left >= right时，已完成数组遍历与交换，输出数组的字符串形式
        return String.valueOf(arr);
    }
}
