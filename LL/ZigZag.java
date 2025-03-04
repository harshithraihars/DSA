public class ZigZag {
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
    public static int size = 0;

    public void addFirst(int data) {
        // create new node
        size++;
        Node newNode = new Node(data);
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }

        // link to the next nde
        newNode.next = Head;
        // assign new Value to the Node
        Head = newNode;
    }

    public void addLast(int data) {

        // create new node
        size++;
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

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node l, Node r) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (l != null && r != null) {
            if (l.data <= r.data) {
                temp.next = l;
                l = l.next;
                temp = temp.next;
            } else {
                temp.next = r;
                r = r.next;
                temp = temp.next;
            }
        }
        while (l != null) {
            temp.next = l;
            l = l.next;
            temp = temp.next;
        }
        while (r != null) {
            temp.next = r;
            r = r.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public  void zigzag(){
        Node slow=Head;
        Node fast=Head.next;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node lefthead=Head;
        Node righthead=prev;
        Node nextL;
        Node nextR;
        while (lefthead!=null && righthead!=null) {
            nextL=lefthead.next;
            lefthead.next=righthead;
            nextR=righthead.next;
            righthead.next=nextL;
            lefthead=nextL;
            righthead=nextR;
        }
    }

    public static void main(String[] args) {
        ZigZag ll = new ZigZag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.printLL();
        ll.zigzag();
        System.out.println();
        ll.printLL();
    }
}
