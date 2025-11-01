
// You are given an array of integers nums and the head of a linked list. Return the head of the modified linked list after removing all nodes from the linked list that have a value that exists in nums.
package Daily;

import java.util.HashSet;

public class DeleteNodesinArray {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums) set.add(num);

        ListNode prev=null;
        ListNode temp=head;
        head=null;
        while(temp!=null){
            if(!set.contains(temp.val)){
                if(head==null){
                    head=temp;
                    prev=head;
                }else{
                    prev.next=temp;
                    prev=temp;
                }
            }
            temp=temp.next;
        }
        prev.next=null;
        return head;
    }
    public static void main(String[] args) {
        
    }
}
