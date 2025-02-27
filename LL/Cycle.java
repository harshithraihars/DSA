import java.util.HashSet;

public class Cycle {
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
    public static boolean checkCycle(){
        Node slow=Head,fast=Head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) {
                return true;
            }
        }
        return false;
        
    }
    public static void RemoveCycle(){
        Node slow=Head,fast=Head;
        boolean isExits=false;
        // find cycle
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) {
                isExits=true;
                break;
            }
        }
        if(!isExits)  return;
        // find intersection point
        slow=Head;
        Node prev=null;
        while (slow!=fast) {
            prev=fast;
            fast=fast.next;
            slow=slow.next;
        }
        prev.next=null;
    }
    public static void main(String[] args) {
        BasicLL ll=new BasicLL();
        Head=new Node(1);
        Node temp=new Node(2);
        Head.next=temp;
        Head.next.next=new Node(3);
        Head.next.next.next=new Node(4);
        Head.next.next.next.next=temp;
        System.out.println(checkCycle());
        RemoveCycle();
        System.out.println(checkCycle());
    }
}