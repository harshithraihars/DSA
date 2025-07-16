package lc;

import java.util.Stack;

public class AsteroidCollission {
    public static void CheckCollission(Stack<Integer> stack,int current){
            while(!stack.isEmpty() && (stack.peek()>=0 && current<0)){
                int peekElement=stack.pop();
                if(Math.abs(peekElement)==Math.abs(current)) return;
                int abspeek=Math.abs(peekElement);
                int abscurrent=Math.abs(current);
                if(abspeek>abscurrent) current=peekElement;
            }
            stack.push(current);
    }
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int asteroid:asteroids){
            CheckCollission(stack,asteroid);
        }
        Integer[] res=stack.toArray(new Integer[0]);
        int[] output=new int[res.length];
        for(int i=0;i<res.length;i++){
            output[i]=res[i];
        }
        return output;

    }
    public static void main(String[] args) {
        
    }
}