import java.util.ArrayList;
import java.util.List;

public class 环形链表II {
    public static void main(String[] args) {

    }

    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if(head == null) return null;
            ListNode fastPtr = head, slowPtr = head;
            boolean hasLoop = false;
            while (true) {
                if (fastPtr.next == null || fastPtr.next.next == null)
                    break;
                // 快慢指针
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;
                if (fastPtr == slowPtr) {
                    hasLoop = true;
                    break;
                }
            }

            if (hasLoop) {
                slowPtr = head;
                while (slowPtr != fastPtr) {
                    slowPtr = slowPtr.next;
                    fastPtr = fastPtr.next;
                }
                return slowPtr;

            } else return null;
        }
    }

//    static public class Solution {
//        public ListNode detectCycle(ListNode head) {
//            if (head == null) return null;
//            ListNode p = head;
//            List<ListNode> listNodes = new ArrayList<>();
//            while (p.next != null) {
//                listNodes.add(p);
//                p = p.next;
//                if (listNodes.contains(p)) return p;
//            }
//            return null;
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
