public class DeleteMafterNNode {
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
            System.out.println("linked  is empty");return;
        }
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public void RemoveNafterM(int M,int N){
        int m=M;
        int n=N;
        Node temp=Head;
        Node prev=Head;
        while(temp!=null){
            while (m>0 && temp!=null) {
                prev=temp;
                temp=temp.next;
                m--;
            }
            while (n>0 && temp!=null) {
                temp=temp.next;
                n--;
            }
            prev.next=temp;
            m=M;
            n=N;
        }
    }
    public static void main(String[] args) {
        DeleteMafterNNode ll=new DeleteMafterNNode();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.addLast(10);
        ll.printLL();
        ll.RemoveNafterM(3, 2);
        System.out.println();
        ll.printLL();
    }
}
