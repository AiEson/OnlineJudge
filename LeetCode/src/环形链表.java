import java.util.ArrayList;
import java.util.List;

public class 环形链表 {
    public static void main(String[] args) {

    }
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if(head == null) return false;
            ListNode fastPtr = head, slowPtr = head;
            while (true) {
                if (fastPtr.next == null || fastPtr.next.next == null) {
                    return false;
                }
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;
                if (fastPtr == slowPtr) return true;
            }

        }
    }

//    static public class Solution {
//        public boolean hasCycle(ListNode head) {
//            if (head == null) return false;
//            ListNode p = head;
//            List<ListNode> listNodes = new ArrayList<>();
//            while(p.next != null) {
//                listNodes.add(p);
//                p = p.next;
//                if (listNodes.contains(p)) return true;
//            } return false;
//        }
//    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
