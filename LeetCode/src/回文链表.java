public class 回文链表 {
    public static void main(String[] args) {

    }

    static class Solution {
        public boolean isPalindrome(ListNode head) {
            StringBuilder sb = new StringBuilder();
            while (head != null) {
                sb.append(head.val);
                head = head.next;
            }
            String s1 = sb.toString();
            return s1.equals(sb.reverse().toString());
        }
    }

    static public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
