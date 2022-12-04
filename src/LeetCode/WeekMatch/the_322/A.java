package LeetCode.WeekMatch.the_322;

/**
 * @author xoke
 * @date 2022/12/4
 */
public class A {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        int len = words.length;
        if (words[0].charAt(0) != words[len - 1].charAt(words[len - 1].length() - 1)) {
            return false;
        }
        for (int i = 1; i < len; i++) {
            if (words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)) {
                return false;
            }
        }
        return true;
    }
}
