public class DeleteLarger {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node Head;
    public static Node Tail;

    public void addLast(int data) {

        // create new node
        Node newNode = new Node(data);
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        Tail.next = newNode;
        Tail = newNode;
    }

    public void printLL() {
        // create new node
        Node temp = Head;
        if (temp == null) {
            System.out.println("linked  is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void sort(){
        if(Head.next==null){
            return;
        }
    }
    public void DeleteNextLarger() {
        Node temp = Head;
        Node prev = Head;
        if (temp == null || temp.next == null) {
            return;
        }
        while (temp.next != null) {
            if (temp.data < temp.next.data) {
                Head = temp.next;
                prev = temp.next;
                temp = temp.next;
            } else {
                break;
            }
        }
        temp=temp.next;
        while (temp!=null) {
            while (temp.next!=null && temp.data<temp.next.data) {
                temp=temp.next;
            }
            prev.next=temp;
            prev=temp;
            temp=temp.next;
        }
        prev.next = null;
    }

    public Node rotateRight(Node head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        Node temp=head;
        Node prev=head;
        int size=0;
        while(temp!=null){
            size+=1;
            temp=temp.next;
        }
        int rotations=0;
        if(k>size){
            rotations=k%size;
        }else{
            rotations=k;
        }
        temp=head;
        System.out.println(rotations);
        for(int n=1;n<=size-rotations;n++){
            prev=temp;
            temp=temp.next;
        }
        if(temp==head ||temp==null) return head;
        prev.next=null;
        Node start=temp;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        Head=start;
        return head;
    }
    public static void main(String[] args) {
        DeleteLarger ll = new DeleteLarger();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printLL();
        System.out.println();
        ll.rotateRight(Head, 8);
        ll.printLL();
    }
}
