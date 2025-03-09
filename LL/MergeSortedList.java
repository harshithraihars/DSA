public class MergeSortedList {
    public class ListNode {
        public static int val;
        public static ListNode next;
        public ListNode(int val){
            this.val=val;
            this.next=null;
        }
        public static ListNode head;
        public static ListNode tail;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null){
            return null;
        }
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode head1=list1;
        ListNode head2=list2;
        ListNode temp;
        ListNode head;
        if(head1.val<=head2.val){
            temp=head1;
            head=head1;
            head1=head1.next;
        }
        else{
            temp=head2;
            head=head2;
            head2=head2.next;
        }
        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){
                temp.next=head1;
                head1=head1.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;
        }
        while(head1!=null){
            temp.next=head1;
            temp=temp.next;
            head1=head1.next;
        }
        while(head2!=null){
            temp.next=head2;
            temp=temp.next;
            head2=head2.next;
        }
        return head;
    }


    // delete a node in linkedlist

    public void deleteNode(ListNode node) {
        ListNode temp=node;
        ListNode prev=temp;
        while (temp.next!=null) {
            prev=temp;
            temp.val=temp.next.val;
            temp=temp.next;
        }
        prev.next=null;
        
    }

    // remove linkedlist elements 

    
    // intersection of two linkedlist
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=0,l2=0;
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=null){
            l1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            l2++;
            temp2=temp2.next;
        }
        int diff=Math.abs(l1-l2);
        temp1=headA;
        temp2=headB;
        if(l1>l2){
            while(diff>0){
                temp1=temp1.next;
                diff--;
            }
        }else{
            while(diff>0){
                temp2=temp2.next;
                diff--;
            }
        }
        while(temp1!=null && temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
    }
}
