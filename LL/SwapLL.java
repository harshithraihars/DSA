import java.util.HashMap;
import java.util.HashSet;

public class SwapLL {
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

    public void RemoveNafterM(int M, int N) {
        int m = M;
        int n = N;
        Node temp = Head;
        Node prev = Head;
        while (temp != null) {
            while (m > 0 && temp != null) {
                prev = temp;
                temp = temp.next;
                m--;
            }
            while (n > 0 && temp != null) {
                temp = temp.next;
                n--;
            }
            prev.next = temp;
            m = M;
            n = N;
        }
    }

    public void swap(int k) {

        if (Head == null || Head.next == null)
            return;

        Node first = Head, last = Head, prevFirst = null, prevLast = null;

        // Move first to k-th node from the start
        for (int i = 1; i < k; i++) {
            prevFirst = first;
            first = first.next;
        }

        // Move last to k-th node from the end
        Node fast = first;
        while (fast.next != null) {
            prevLast = last;
            fast = fast.next;
            last = last.next;
        }

        // If first and last are the same node, no need to swap
        if (first == last)
            return;

        // Case 1: Swapping the Head node (k=1)
        if (prevFirst == null) { // first is the Head
            Head = last;
        } else {
            prevFirst.next = last;
        }

        // Case 2: Swapping the last node
        if (prevLast == null) { // last is the Head
            Head = first;
        } else {
            prevLast.next = first;
        }

        // If the nodes are adjacent
        if (first.next == last) {
            first.next = last.next;
            last.next = first;
        } else if (last.next == first) {
            last.next = first.next;
            first.next = last;
        } else { // Non-adjacent swap
            Node tempNext = first.next;
            first.next = last.next;
            last.next = tempNext;
        }


    }

    public void EvenOdd(){
        if(Head==null || Head.next==null){
            return;
        }
        Node temp=Head;
        Node odd=null;
        Node evenfirst=null;
        Node even=null;
        Node next;
        while(temp!=null){
            next=temp.next;
            if(temp.data%2==0){
                if(evenfirst==null){
                    even=evenfirst=temp;
                    temp=next;
                    continue;
                }
                even.next=temp;
                even=temp;
            }else{
                if(odd==null){
                    Head=temp;
                    odd=temp;
                    temp=next;
                    continue;
                }
                odd.next=temp;
                odd=temp;
            }
            temp=next;
        } 
        if(even==null || odd==null){
            return;
        }
        odd.next=evenfirst;
        even.next=null;   
    }

    // linked list of 0,1,2s

    public  void sortList(){
        Node temp=Head;
        HashMap<Integer,Integer> hm=new HashMap<>();
        while (temp!=null) {
            if(hm.containsKey(temp.data)){
                hm.put(temp.data,hm.get(temp.data)+1);
            }else{
                hm.put(temp.data,1);

            }
            temp=temp.next;
        }
        int num=0;
        temp=Head;
        while (temp!=null) {
            int count=hm.get(num);
            while (count>0) {
                temp.data=num;
                count--;
                temp=temp.next;
            }
            num+=1;
        }
    }
    public static void  removeDuplicates() {
        HashSet<Integer> hs=new HashSet<>();
      Node prev=null;
      Node temp=Head;
      while(temp!=null){
        if(hs.contains(temp.data)){
          prev.next=temp.next;
        }
        else{
          hs.add(temp.data);
          prev=temp;
        }
        temp=temp.next;
      }
    }

    
    public static void main(String[] args) {
        SwapLL ll = new SwapLL();
        ll.addLast(1);
        ll.addLast(1);
        ll.addLast(0);
        ll.addLast(0);
        ll.addLast(2);
        System.out.println();
        ll.printLL();
        // ll.removeDuplicates();
        ll.sortList();
        System.out.println();
        ll.printLL();
    }
}
