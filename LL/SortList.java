public class SortList {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static Node head = null;
    public static Node tail = null;

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }

    public void Sort(){
        if(head==null || head.next==null){
            return;
        }
        Node temp=head.next;
        while (temp!=null) {
            Node curr=temp;
            Node next=curr.next;
            Node prev=curr.prev;
            while (temp.prev!=null && curr.data<temp.prev.data) {
                temp=temp.prev;
            }
            if(temp.prev==null){
                head=curr;
                curr.next=temp;
                temp.prev=curr;
                curr.prev=null;
            }else if(temp==curr){
                prev=temp;
            }else{
                Node currprev=temp.prev;
                curr.next=temp;
                temp.prev=curr;
                curr.prev=currprev;
                currprev.next=curr;
            }
            prev.next=next;
            if(next!=null) next.prev=prev;
            temp=next;
        }
    }

   


    public void Biotonic(){
        Node slow=head;
        Node fast=head;
    }

    public void printLl(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"\t");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SortList ll=new SortList();
        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(4);
        ll.addLast(1);
        ll.printLl();
        ll.Sort();
        ll.printLl();
    }
}
