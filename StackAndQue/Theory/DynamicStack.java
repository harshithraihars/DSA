package Theory;
public class DynamicStack extends Stack {
    public DynamicStack() {
        super();
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()) {
            int[] temp = new int[this.data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
    public static void main(String[] args) {
        // size is dynamic
        DynamicStack st=new DynamicStack();
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);

    }
}
