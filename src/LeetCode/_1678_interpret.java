package LeetCode;

/**
 * 设计 Goal 解析器
 */
@SuppressWarnings("all")
public class _1678_interpret {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了55.24%的用户
     * 内存消耗：39.1 MB, 在所有 Java 提交中击败了48.13%的用户
     * <p>
     * 每次调用replace都要遍历字符串，时间耗费较多
     */
//    public String interpret(String command) {
//        command = command.replace("()", "o").replace("(al)","al");
//        return command;
//    }
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.1 MB, 在所有 Java 提交中击败了85.29%的用户
     */
    public String interpret(String command) {
        int len = command.length();
        StringBuilder res = new StringBuilder();
        // 这里不用字符数组，直接charAt()也可以
        char[] arr = command.toCharArray();
        for (int i = 0; i < len; i++) {
            if (arr[i] == 'G') {
                res.append("G");
            }else if (arr[i] == '(') {
                if (arr[i + 1] == ')') {
                    i++;
                    res.append("o");
                }else {
                    i+=3;
                    res.append("al");
                }
            }
        }
        return res.toString();
    }
}
