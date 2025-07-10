package lc;

import java.util.Stack;

public class QueUsingStack {

    // removal efficient
    private Stack<Integer> main;
    private Stack<Integer> helper;

    public QueUsingStack() {
        main=new Stack<>();
        helper=new Stack<>();
    }
    
    public void push(int x) {

        // transfer all the items into helper stack add the new item into the main one and push alll elemenet sfrom helper to main
        while(!main.isEmpty()){
            helper.push(main.pop());
        }
        main.push(x);
        while(!helper.isEmpty()){
            main.push(helper.pop());
        }
    }
    
    public int pop() {
        return main.pop();
    }
    
    public int peek() {
        return main.peek();
    }
    
    public boolean empty() {
        return main.isEmpty();
    }

    // Insertion Efficient
    // public MyQueue() {
    //     main=new Stack<>();
    //     helper=new Stack<>();
    // }
    
    // public void push(int x) {
    //     main.push(x);
    // }
    
    // public int pop() {
    //     while(!main.isEmpty()){
    //         helper.push(main.pop());
    //     }
    //     int removed=helper.pop();
    //     while(!helper.isEmpty()){
    //         main.push(helper.pop());
    //     }
    //     return removed;
    // }
    
    // public int peek() {
    //     while(!main.isEmpty()){
    //         helper.push(main.pop());
    //     }
    //     int removed=helper.peek();
    //     while(!helper.isEmpty()){
    //         main.push(helper.pop());
    //     }
    //     return removed;
    // }
    
    // public boolean empty() {
    //     return main.isEmpty();
    // }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.peek();
    }
}
