import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class 对称二叉树 {
    public static void main(String[] args) {

    }
    static class Solution {
        public boolean isSymmetric(TreeNode root) {
            Queue<TreeNode> queue = new ArrayDeque<>();
            TreeNode r = root.right, l = root.left;
            if (root != null || (r == null && l == null)) return true;

            while ()
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
