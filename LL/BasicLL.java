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
    public static int size=0;
    public void addFirst(int data) {
        // create new node
        size++;
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
        size++;
        Node newNode = new Node(data);
        if (Head == null) {
            Head=Tail=newNode;
            return;
        }
        Tail.next=newNode;
        Tail=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("no elemnt present in ll");
            return Integer.MAX_VALUE;
        }
        size--;
        if(size==1){
            int Value=Head.data;
            Head=Tail=null;
            return Value;
        }
        int Value=Head.data;
        Head=Head.next;
        return Value;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("no elemnt present in ll");
            return Integer.MAX_VALUE;
        }
        if(size==1){
            int Value=Head.data;
            Head=Tail=null;
            size=0;
            return Value;
        }
        Node temp=Head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        int Value=temp.next.data;
        temp.next=null;
        Tail=temp;
        size--;
        return Value;
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
        System.out.println("size is "+size);
    }

    public int IterativeSearch(int key) {
        // create new node
        Node temp=Head;
        int i=0;
        while (temp!=null) {
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int Helper(Node Head,int key){
        if(Head==null){
            return -1;
        }
        if(Head.data==key){
            return 0;
        }
        int index=Helper(Head.next, key);
        if(index==-1){
            return -1;
        }
        return index+1;
    }
    public int RecursiveSearch(int key) {
        // create new node
        return Helper(Head,key);
    }
    public void addMiddle(int index,int data) {
        if(index==0){
            addFirst(data);
            return;
        }
        size++;
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
    public void ReverseLL(){
        Node curr=Head;
        Node next;
        Node prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Head=prev;
    }
    public void removeNthFromEnd(Node head, int n) {
        int size=0;
        Node temp=head;
        size--;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;
            return;
        }
        int i=1;
        int indextofind=size-n;
        Node prev=head;
        while(i<indextofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static void main(String[] args) {
        BasicLL ll=new BasicLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(1, 6);
        ll.printLL();
        ll.removeFirst();
        ll.printLL();
        ll.removeLast();
        ll.printLL();
        // System.out.println(ll.IterativeSearch(3));;
        // System.out.println(ll.RecursiveSearch(3));
        // ll.ReverseLL();
        ll.removeNthFromEnd(Head,2);
        ll.printLL();

    }
}