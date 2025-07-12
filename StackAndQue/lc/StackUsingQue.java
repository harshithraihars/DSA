package lc;

import java.util.LinkedList;
import java.util.Queue;

import Theory.Que;

public class StackUsingQue {
    public static void main(String[] args) {
        
        Queue q=new LinkedList<>();
        q.si
        
    }
}
class MyStack {
    Queue<Integer> main;
    Queue<Integer> helper;
    public MyStack() {
        main=new LinkedList<>();
        helper=new LinkedList<>();
    }
    
    public void push(int x) {
        main.add(x);
    }
    
    public int pop() {
        while(main.size()!=1){
            helper.add(main.remove());
        }
        int removed=main.remove();
        while(!helper.isEmpty()){
            main.add(helper.remove());
        }
        return removed;
    }
    
    public int top() {
        while(main.size()!=1){
            helper.add(main.remove());
        }
        int topElement=main.remove();
        helper.add(topElement);
        while(!helper.isEmpty()){
            main.add(helper.remove());
        }
        return topElement;
    }
    
    public boolean empty() {
        return main.isEmpty();
    }
}
