public class MergeSortedList {
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
}
