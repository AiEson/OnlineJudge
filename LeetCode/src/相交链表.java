import java.util.HashSet;
import java.util.Set;

public class 相交链表 {
    public static void main(String[] args) {

    }
    static public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) return null;
            Set<ListNode> set = new HashSet<>();
            set.add(headA);
            while(headA != null) {
                set.add(headA);
                headA = headA.next;
            }
            while(headB != null) {
                if (set.contains(headB)) return headB;
                headB = headB.next;
            }
            if (set.contains(headB)) return headB;
            return null;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
