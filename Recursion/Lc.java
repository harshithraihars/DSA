import java.util.HashMap;
import java.util.HashSet;

import javax.swing.tree.TreeNode;

public class Lc {
    // public ListNode swapRecur(ListNode head,ListNode prev,ListNode curr,ListNode Next){
    //     ListNode temp=Next.next;
    //     Next.next=curr;
    //     curr.next=temp;
    //     if(prev!=null) prev.next=Next;
    //     if(curr==head) head=Next;
    //     if(temp==null || temp.next==null){
    //         return head;
    //     }
    //     return swapRecur(head,curr,temp,temp.next);
    // }

    // public static ListNode Recur(ListNode prev,ListNode curr){
    //     if(curr==null) return prev;
    //     ListNode Next=curr.next;
    //     curr.next=prev;
    //     return Recur(curr,Next);
    // }

    // public TreeNode searchBST(TreeNode root, int val) {
    //     if(root==null) return null;
    //     if(root.val==val) return root;
    //     if(val<root.val){
    //         return searchBST(root.left,val);
    //     }
    //     else{
    //         return searchBST(root.right,val);
    //     }
    // }

    public static HashMap<Integer, Integer> hs = new HashMap<>() {{
        put(1, 1);
        put(2, 2);
    }};
    public static int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int p1;
        int p2;
        if (hs.containsKey(n-1)) {
            p1=hs.get(n-1);
        }
        else{
            p1=climbStairs(n-1);
            hs.put(n-1,p1);
        }
        p2=hs.get(n-2);
        return p1+p2;
        
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }
}
