import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class 二叉树的前序遍历 {
    public static void main(String[] args) {

    }
    static class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            Deque<TreeNode> deque = new ArrayDeque<>();
            // 根左右
            while (root != null || !deque.isEmpty()) {
                while (root != null) {
                    list.add(root.val);
                    deque.push(root);
                    root = root.left;
                }
                root = deque.pop().right;
            }
            return list;
        }
    }



    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
