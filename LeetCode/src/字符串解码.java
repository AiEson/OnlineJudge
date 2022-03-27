import javax.sound.midi.Soundbank;
import java.util.Stack;

public class 字符串解码 {
    public static void main(String[] args) {
        System.out.println(new Solution().decodeString("3[a2[c]]"));
    }
    static class Solution {
        public String decodeString(String s) {

            // 使用 Stack 进行解决，这也是公式类问题的通用解法
            Stack<String> stringStack = new Stack<>();

            StringBuilder intTemp = new StringBuilder();
            StringBuilder otherTemp = new StringBuilder();

            // 先处理字符串
            for (char c : s.toCharArray()) {
//                System.out.print("Now Stack = ");
//                for (String s1 : stringStack) {
//                    System.out.print(s1 + " ");
//                }
//                System.out.println();
                if (Character.isDigit(c)) {
                    intTemp.append(c);
                    continue;
                } else if (intTemp.length() != 0) {
                    stringStack.push(intTemp.toString());
                    intTemp = new StringBuilder();
                }
                if (c == ']') {
                    // 找到 」
//                    System.out.println("Found \']\' !");
                    StringBuilder nr = new StringBuilder();
                    String now = stringStack.pop();
//                    System.out.println("now now = " + now);
                    while (!now.equals("[")) {
//                        System.out.println("Found \'[\' !");
                        nr.append(now);
                        now = stringStack.pop();
                    }
//                    System.out.println("Now nr = " + nr.toString());
                    String nrStr = nr.toString();
//                    System.out.println("Found the Message : " + nr.toString());
                    int num = Integer.parseInt(stringStack.pop());
//                    System.out.println("Int = " + num);
                    nr = new StringBuilder();
                    for (int i = 0; i < num; i++) {
                        nr.append(nrStr);
                    }
                    stringStack.push(nr.toString());
                    continue;
                }
                stringStack.push(Character.toString(c));

            }
            while (!stringStack.isEmpty())
                otherTemp.append(stringStack.pop());

            return otherTemp.reverse().toString();
        }
    }
}
