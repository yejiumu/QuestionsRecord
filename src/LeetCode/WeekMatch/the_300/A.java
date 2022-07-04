package LeetCode.WeekMatch.the_300;

import java.util.HashMap;
import java.util.Map;

public class A {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        int i = 0;
        for (char ch : key.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (!map.containsKey(ch)) {
                    map.put(ch, (char) ('a' + i++));
                }
            }
        }
        char[] arr = message.toCharArray();
        int len = arr.length;
        for (int j = 0; j < len; j++) {
            if (Character.isLetter(arr[j])) {
                arr[j] = map.get(arr[j]);
            }
        }
        return new String(arr);
    }
}
