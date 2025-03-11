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

    public static void main(String[] args) {
        DeleteLarger ll = new DeleteLarger();
        ll.addLast(10);
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(1);
        ll.printLL();
        ll.DeleteNextLarger();
        System.out.println();
        ll.printLL();
    }
}
