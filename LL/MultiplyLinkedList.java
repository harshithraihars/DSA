public class MultiplyLinkedList {
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
    static long multiplyTwoLists(Node first, Node second) {
        long num1=0,num2=0;
      Node temp=first;
      int pow=0;
      while(temp!=null){
        num1=num1*((long)Math.pow(10,pow))+(long)temp.data;
        pow++;
        temp=temp.next;
      }
      temp=second;
      pow=0;
      while(temp!=null){
        num2=num2*((long)Math.pow(10,pow))+(long)temp.data;
        pow++;
        temp=temp.next;
      }
      System.out.println(num1+" "+num2);
      return num1*num2;
    }
    public static void main(String[] args) {
        MultiplyLinkedList ll=new MultiplyLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        System.out.println(multiplyTwoLists(Head, Head));
    }
}
