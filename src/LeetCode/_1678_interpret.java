package LeetCode;

/**
 * 设计 Goal 解析器
 */
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
     * 内存消耗：39.1 MB, 在所有 Java 提交中击败了48.13%的用户
     */
    public String interpret(String command) {
        //空直接返回
        if (command == null) {
            return "";
        }
        int index = 0;
        //String三兄弟最快的
        StringBuilder sb = new StringBuilder();
        //遍历command字符串
        while (index < command.length()) {
            //如果是"G"，向sb中添加"G"，并将index后移一位
            if (command.charAt(index) == 'G') {
                sb.append('G');
                index++;
                //如果后两位是"()"，则向sb中添加"o"，并将index后移两位
            } else if (command.charAt(index) == '(' && command.charAt(index + 1) == ')') {
                sb.append('o');
                index = index + 2;
                //如果第一位是"("，第二位不是")"，那肯定是"(al)"，则向sb中添加"al"，同时index后移四位
            } else if (command.charAt(index) == '(' && command.charAt(index + 1) == 'a') {
                sb.append("al");
                index = index + 4;
            }
        }
        //直接返回sb的字符串
        return sb.toString();
    }
}
