import javax.swing.*;

public class 删除排序链表中的重复元素 {
    public static void main(String[] args) {
        ListNode listNode = new Solution().deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2))));
        printListNode(listNode);
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
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) return head;
            int befNum = head.val;
            ListNode p = head;
            while(p.next != null) {
               // 如果相等，则跳过本节点
                if (p.val == p.next.val) p.next = p.next.next;
                else p =p.next;
            }
            return head;
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

