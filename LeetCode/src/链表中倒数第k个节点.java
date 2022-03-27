public class 链表中倒数第k个节点 {
    public static void main(String[] args) {
        System.out.println(new Solution().getKthFromEnd(new ListNode(1), 3));
    }

    static class Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            // 先快走 k 步
            ListNode fast = head, slow = head;
            while(--k > 0)
                fast = fast.next;
            while (fast != null && fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }

            return slow;
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
