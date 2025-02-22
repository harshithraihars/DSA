public class BasicLL {
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

    public void addFirst(int data) {
        // create new node
        Node newNode = new Node(data);
        if (Head == null) {
            Head=Tail=newNode;
            return;
        }

        // link to the next nde
        newNode.next = Head;
        // assign new Value to the Node
        Head = newNode;
    }
    public void addLast(int data) {
        // create new node
        Node newNode = new Node(data);
        if (Head == null) {
            Head=Tail=newNode;
            return;
        }
        Tail.next=newNode;
        Tail=newNode;
    }
    public void printLL() {
        // create new node
        Node temp=Head;
        if(temp==null){
            System.out.println("linked list is empty");return;
        }
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void addMiddle(int index,int data) {
        if(index==0){
            addFirst(data);
            return;
        }
        Node temp=Head;
        Node newNode=new Node(data);
        int i=0;
        while (i<index-1) {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void main(String[] args) {
        BasicLL ll=new BasicLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(1, 6);
        ll.printLL();
    }
}