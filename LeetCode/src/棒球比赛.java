import java.util.Stack;

public class 棒球比赛 {
    public static void main(String[] args) {
        System.out.println(new Solution().calPoints(new String[]{"5", "2", "C", "D", "+"}));

    }
    static class Solution {
        public int calPoints(String[] ops) {
            int ret = 0;

            Stack<Integer> integers = new Stack<>();

            for (String op : ops) {
                if (op.equals("D")) {
                    integers.push(integers.peek() * 2);
                    continue;
                }
                if (op.equals("C")){
                    integers.pop();
                    continue;
                }
                if (op.equals("+")){
                    int a = integers.pop();
                    int b = a + integers.peek();
                    integers.push(a);
                    integers.push(b);
                    continue;
                }
                integers.push(Integer.parseInt(op));
            }
            while(!integers.isEmpty()) ret += integers.pop();
            return ret;
        }
    }
}
