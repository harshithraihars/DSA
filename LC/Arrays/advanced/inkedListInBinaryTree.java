package advanced;

import javax.swing.tree.TreeNode;

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
