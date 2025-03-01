import java.util.LinkedList;

public class LLCollection {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(0);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
