package Theory;
public class CircularQue {
    protected int[] data;
    private static final int DEFAULTSIZE=10;
    protected int end=0;
    protected int front=0;
    private int size=0;
    public CircularQue(int size){
        this.data=new int[size];
    }

    public CircularQue(){
        this(DEFAULTSIZE);
    }

    protected boolean isFull(){
        return size==data.length;
    }

    private boolean isEmpty(){
        return size==0;
    }

    public boolean Insert(int item){
        if(isFull()) return false;
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()) throw new Exception("CircularQue is empty");

        int removed=data[front++];
        front=front%data.length;
        size--;
        return removed;
    }

    public void display(){
        if(isEmpty()) return;
        System.out.println(front+" "+end);
        int i=front;
        do{
            System.out.print(data[i++]+"\t");
            i%=data.length;
        }while(i!=end);

    }
    public int front() throws Exception{
        if(isEmpty()) throw new Exception("CircularQue is empty");
        return data[front];
    }
    public static void main(String[] args) throws Exception{
        CircularQue q=new CircularQue(5);
        System.out.println(q.Insert(10));
        System.out.println(q.Insert(20));
        System.out.println(q.Insert(30));
        System.out.println(q.Insert(40));
        System.out.println(q.Insert(50));
        q.display();
        // q.display();
        System.out.println(q.remove());
        q.Insert(100);
        q.display();
        // System.out.println(q.remove());
        // System.out.println(q.remove());
        
        // q.display();
    }
}
