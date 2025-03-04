public class DoubleLL {
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

    public void addFrst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

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
    public void removeFirst(){
        if(head==null){
            return;
        }
        if(head.next==null){
            System.out.println(head.data);
            head=tail=null;
            return;
        }
        System.out.println(head.data);
        head=head.next;
        head.prev=null;
    }

    public void removeLast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            System.out.println(head.data);
            head=tail=null;
            return;
        }
       Node temp=head;
       Node prev=null;
       while (temp.next!=null) {
        prev=temp;
        temp=temp.next;
       }
       prev.next=null;
    }
    public void printLL(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        DoubleLL ll = new DoubleLL();
        ll.addFrst(3);
        ll.addFrst(2);
        ll.addFrst(1);
        ll.addLast(4);
        ll.removeLast();
        ll.printLL();

    }
}
