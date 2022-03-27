import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class 二叉树的中序遍历 {
    public static void main(String[] args) {

    }

    static class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            Deque<TreeNode> deque = new ArrayDeque<>();
            // 从左开始压栈
            while(!deque.isEmpty() || root != null) {
                while (root != null) {
                    deque.push(root);
                    root = root.left;
                }
                root = deque.pop();
                list.add(root.val);
                root = root.right;
            }
            return list;
        }
    }

//        static class Solution {
//            public List<Integer> inorderTraversal(TreeNode root) {
//                List<Integer> list = new ArrayList<>();
//                dfs(root, list);
//                return list;
//            }
//            private void dfs(TreeNode root, List<Integer> list) {
//                if (root == null) return;
//                boolean hasLeft = root.left != null, hasRight = root.right != null;
//                if (hasLeft) dfs(root.left, list);
//                list.add(root.val);
//                if (hasRight) dfs(root.right, list);
//            }
//        }

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
