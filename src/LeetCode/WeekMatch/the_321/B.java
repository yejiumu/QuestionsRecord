package LeetCode.WeekMatch.the_321;

/**
 * @author xoke
 * @date 2022/11/27
 */
public class B {
    public int appendCharacters(String s, String t) {
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (index < t.length() && s.charAt(i) == t.charAt(index)) {
                index++;
            }
        }
        return t.length() - index;
    }
}
