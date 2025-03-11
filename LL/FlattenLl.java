public class FlattenLl {
    static class Node {  // Made Node static
        int data;
        Node next, child;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.child = null;
        }
    }

    public static Node createList() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        head.child = new Node(4);
        head.child.child = new Node(5);

        head.next.child = new Node(6);
        head.next.child.child = new Node(7);

        head.next.next.child = new Node(8);

        return head;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void FlattenList(Node head){
        Node tail=head;
        Node temp=head;
        while (temp!=null) {
            tail=temp;
            temp=temp.next;
        }
        temp=head;
        while (temp!=null) {
            if(temp.child!=null){
                tail.next=temp.child;
                tail=temp.child;
            }
            temp=temp.next;
        }
        tail.next=null;
    }
    public static void FlattenList2(Node head){
        Node temp=head;
        Node next=head;
        while (temp!=null) {
            next=temp.next;
            while (temp.child!=null) {
                temp.next=temp.child;
                temp=temp.child;
            }
            temp.next=next;
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = createList();
        printList(head);
        FlattenList2(head);
        printList(head);
    }
}
