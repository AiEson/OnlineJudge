import java.util.ArrayDeque;
import java.util.Deque;

public class 反转链表 {
    public static void main(String[] args) {
        printListNode(new Solution().reverseList(new ListNode(1, new ListNode(2, new ListNode(3)))));

    }
    public static void printListNode(ListNode listNode) {
        boolean flag = true;
        while (flag) {
            System.out.print(listNode.val + " ");
            if (listNode.next != null) {
                listNode = listNode.next;
            } else flag = false;
        }
    }

    static class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null) return null;
            Deque<Integer> deque = new ArrayDeque<>();
            while (head != null) {
                deque.add(head.val);
                head = head.next;
            }
            ListNode ret = new ListNode(0);
            ListNode p = ret;
            while (deque.size() != 0) {
                p.next = new ListNode(deque.removeLast());
                p = p.next;
            }
            return ret.next;
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
