package advanced;

import javax.swing.tree.TreeNode;

class LongestUnivaluePath {
    public static int maxlen = 0;

    public static int Helper(TreeNode node) {
        if (node == null || node.left == null && node.right == null)
            return 0;

        int leftlen = -1, rightlen = -1;
        if (node.left != null) {
            leftlen = Helper(node.left);
        }
        if (node.right != null) {
            rightlen = Helper(node.right);
        }

        if (leftlen != -1 && rightlen != -1) {
            if (node.val == node.left.val && node.val == node.right.val) {
                maxlen = Math.max(maxlen, leftlen + rightlen + 2);
                return Math.max(leftlen, rightlen) + 1;
            }
        }

        if (leftlen != -1 && node.val == node.left.val) {
            maxlen = Math.max(maxlen, leftlen + 1);
            return leftlen + 1;
        }
        if (rightlen != -1 && node.val == node.right.val) {
            maxlen = Math.max(maxlen, rightlen + 1);
            return rightlen + 1;
        }
        return 0;

    }

    public int longestUnivaluePath(TreeNode root) {
        maxlen = 0;
        Helper(root);
        return maxlen;
    }

    public static void main(String[] args) {
        
    }
}