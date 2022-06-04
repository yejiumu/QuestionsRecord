package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 独特的电子邮件地址
 */
public class _929_numUniqueEmails {
    /**
     * 执行用时：11 ms, 在所有 Java 提交中击败了68.69%的用户
     * 内存消耗：41.5 MB, 在所有 Java 提交中击败了67.93%的用户
     */
//    public int numUniqueEmails(String[] emails) {
//        Set<String> set = new HashSet<>();
//        for (String email : emails) {
//            StringBuilder str = new StringBuilder();
//            String[] arr = email.split("@");
//            for (char ch : arr[0].toCharArray()) {
//                if (ch == '+') {
//                    break;
//                } else if (ch != '.') {
//                    str.append(ch);
//                }
//            }
//            str.append("@").append(arr[1]);
//            set.add(str.toString());
//        }
//        return set.size();
//    }

    /**
     * 执行用时：8 ms, 在所有 Java 提交中击败了84.25%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了77.80%的用户
     */
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            // 找到分界线
            int i = email.indexOf('@');
            // 去掉本地名第一个加号之后的部分
            String local = email.substring(0, i).split("\\+")[0];
            // 去掉本地名中所有的句点
            local = local.replace(".", "");
            // 将处理好的两个部分进行拼接
            set.add(local + email.substring(i));
        }
        return set.size();
    }
}
