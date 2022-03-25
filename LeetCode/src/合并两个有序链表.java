import java.util.List;

public class 合并两个有序链表 {
    public static void main(String[] args) {
        ListNode listNode = new Solution().mergeTwoLists(new ListNode(1, new ListNode(2)), new ListNode(1, new ListNode(2)));
        boolean flag = true;
        while (flag) {
            System.out.println(listNode.val);
            if (listNode.next != null) {
                listNode = listNode.next;
            } else flag = false;

        }
    }

    static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode result = new ListNode();
            ListNode ret = result;
            // 双指针
            boolean flag = true;

            while(list1 != null && list2 != null) {

                if (list1.val > list2.val) {
                    ret.next = list2;
                    list2 = list2.next;
                } else {
                    ret.next = list1;
                    list1 = list1.next;
                }
                ret = ret.next;
            }
            if (list1 != null) ret.next = list1;
            if (list2 != null) ret.next = list2;
            return result.next;

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
