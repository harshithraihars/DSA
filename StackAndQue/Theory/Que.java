package Theory;
public class Que {
    protected int[] data;
    private static final int DEFAULTSIZE=10;
    int end=0;

    public Que(int size){
        this.data=new int[size];
    }

    public Que(){
        this(DEFAULTSIZE);
    }

    protected boolean isFull(){
        return end==data.length;
    }

    private boolean isEmpty(){
        return end==0;
    }

    public boolean Insert(int item){
        if(isFull()) return false;
        data[end++]=item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()) throw new Exception("Que is empty");

        int removed=data[0];
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }

    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i]+"\t");
        }
            System.out.println();

    }
    public int front() throws Exception{
        if(isEmpty()) throw new Exception("Que is empty");
        return data[0];
    }
    public static void main(String[] args) throws Exception{
        Que q=new Que();
        q.Insert(10);
        q.Insert(20);
        q.Insert(30);
        q.display();
        q.remove();
        q.display();
    }
}
