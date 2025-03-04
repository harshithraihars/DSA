public class ReverseDll {
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
    
    public void printLL(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
    }
    public void reverseDll(){
        if(head==null ||head.next==null){
            return;
        }
        Node next;
        Node curr=head;
        while (curr.next!=null) {
            next=curr.next;
            curr.next=curr.prev;
            curr.prev=next;
            curr=next;
        }
        curr.next=curr.prev;
        curr.prev=null;
        head=curr;
    }
    public static void main(String[] args) {
        ReverseDll ll=new ReverseDll();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.printLL();
        ll.reverseDll();
        System.out.println();
        ll.printLL();
    }
}
