import java.util.ArrayList;

public class Heap {

    public static void main(String[] args) {
        System.out.println("hello");
        InnerHeap<Integer> heap=new InnerHeap();
        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);
        try {
            System.out.println("removed item "+heap.remove());
            System.out.println("removed item "+heap.remove());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class InnerHeap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public InnerHeap() {
        list = new ArrayList<>();
    }

    public void swap(int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    // at any index i/2 gives parent index(for 1 indexed)
    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return index * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    private void upheap(int index) {
        if (index == 0)
            return;
        int p = parent(index);
        // untill the parent is smaller than the current element do
        if (list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
            upheap(p);
        }
    }

    public void downheap(int index) {
        int left = left(index);
        int right = right(index);
        int min = index;
        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }
        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }
        if (min != index) {
            swap(min, index);
            downheap(min);
        }
    }

    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Removing from an empty arraylist");
        }

        // remove the item at 0th index and add the item at the last index at the
        // starting index(0)
        T temp = list.get(0);
        T last = list.get(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }
        return temp;
    }

    public void insert(T value) {
        this.list.add(value);
        System.out.println(list);
        upheap(list.size() - 1);
    }

    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> data=new ArrayList<>();

        while (!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }
}