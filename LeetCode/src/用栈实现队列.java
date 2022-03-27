import java.util.Stack;

public class 用栈实现队列 {
    public static void main(String[] args) {

    }
    static class MyQueue {

        private static Stack<Integer> inSta;
        private static Stack<Integer> outSta;

        public MyQueue() {
            inSta = new Stack<>();
            outSta = new Stack<>();
        }

        public void push(int x) {
            inSta.push(x);
        }

        public int pop() {
            if (outSta.isEmpty()) in2out();
            return outSta.pop();
        }

        private void in2out() {
            while (!inSta.isEmpty())
                outSta.push(inSta.pop());
        }

        public int peek() {
            if (outSta.isEmpty()) in2out();
            return outSta.peek();
        }

        public boolean empty() {
            return inSta.isEmpty() && outSta.isEmpty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
