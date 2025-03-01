public class MergeSortLL {
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

    public void printLL(Node head) {
        // create new node
        Node temp = head;
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

    public static Node MergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node midNode = findMid(head);
        Node RightHead = midNode.next;
        midNode.next = null;
        Node left=MergeSort(head);
        Node Right=MergeSort(RightHead);
        return merge(left,Right);
    }

    public static void main(String[] args) {
        MergeSortLL ll = new MergeSortLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printLL(Head);
        System.out.println();
        Node head=MergeSort(Head);
        ll.printLL(head);
    }
}
