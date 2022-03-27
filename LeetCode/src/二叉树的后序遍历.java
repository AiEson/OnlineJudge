import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class 二叉树的后序遍历 {

    public static void main(String[] args) {

    }

    static class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            Deque<TreeNode> deque = new ArrayDeque<>();
            // 左右根
            TreeNode preAccess = null;
            while (!deque.isEmpty() || root != null) {
                while (root != null) {
                    deque.push(root);
                    root = root.left;
                }
                root = deque.pop();
                if (root.right == null || preAccess == root.right) {
                    // 如果上一次访问过右子树，或者没有右，则说明已经遍历完成又子树
                    list.add(root.val);
                    preAccess = root;
                    root = null;
                } else {
                    deque.push(root);
                    root = root.right;
                }

            }

            return list;
        }
    }

//    class Solution {
//        public List<Integer> postorderTraversal(TreeNode root) {
//            List<Integer> list = new ArrayList<>();
//            if (root == null) return list;
//            dfs(root,list);
//            return list;
//        }
//        private void dfs(TreeNode root, List<Integer> list) {
//            boolean hasL = root.left != null, hasR = root.right != null;
//            if (hasL) dfs(root.left, list);
//            if (hasR) dfs(root.right, list);
//            list.add(root.val);
//        }
//    }

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
