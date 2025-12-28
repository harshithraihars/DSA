package advanced;
// Intuition

// The problem asks whether a linked list appears as a downward path in a binary tree.
// My first thought was:

// A path can start from any node in the tree.

// Once the first value matches, I need to check continuously downward (left or right).

// If at any point values don’t match, that path fails.

// So the idea is:

// Try to start matching the linked list from every tree node.

// Once started, keep checking the next linked list node with left or right child.

// Approach
// Use isSubPath() to traverse every node in the binary tree.

// When a node value matches head.val, call getPath() to verify the path.

// getPath() recursively matches the linked list with left or right child nodes.

// If getPath() returns true, the linked list exists as a path.

// Otherwise, continue traversal using isSubPath() on left and right subtrees.
// import javax.swing.tree.TreeNode;

public class inkedListInBinaryTree {
    public static boolean getPath(ListNode temp,TreeNode node){
        if(temp==null) return true;
        if(temp!=null && node==null) return false;
        if(node.val!=temp.val) return false;
        return getPath(temp.next,node.left) || getPath(temp.next,node.right);
    }
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root==null) return false;
        if(head.val==root.val){
            if(getPath(head,root)) return true;
        }

        return isSubPath(head,root.left) || isSubPath(head,root.right);
    }
    public static void main(String[] args) {
        
    }
}
