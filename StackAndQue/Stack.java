public class Stack{
    protected int[] data;
    private static final int DEFAULTSIZE=10;
    int ptr=-1;
    public Stack(int size){
        this.data=new int[size];
    }

    public Stack(){
        this(DEFAULTSIZE);
    }

    protected boolean isFull(){
        return ptr==data.length-1;
    }

    private boolean isEmpty(){
        return ptr==-1;
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full");
             return false;
        }
        data[++ptr]=item;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()) throw new Exception("cannot pop from empty stack");
        return data[ptr--];
    }

    public int peek() throws Exception{
        if(isEmpty()) throw new Exception("cannot pek from empty stack");
        return data[ptr];
    }
    public static void main(String[] args) {
        try {
            Stack st=new Stack(5);
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}