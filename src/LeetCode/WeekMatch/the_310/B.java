package LeetCode.WeekMatch.the_310;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xoke
 * @date 2022/9/11
 */
public class B {
    public int partitionString(String s) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                continue;
            } else {
                ++count;
                set.clear();
            }
            set.add(ch);
        }
        return set.size() != 0 ? count + 1 : count;
    }
}
