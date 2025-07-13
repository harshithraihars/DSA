package lc;

import java.util.Stack;

public class Basketball {
    public static int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String str:operations){
            if(str=="C") stack.pop();
            else if(str=="D") stack.push(2*stack.peek());
            else if(str=="+"){ 
                int first=stack.pop();
                int second=stack.peek();
                int current=first+second;
                stack.push(first);
                stack.push(current);
            }else{
                stack.push(Integer.parseInt(str));
            }
        }
        int sum=0;
        while(!stack.isEmpty()) sum+=stack.pop();
        return sum;
    }
    public static void main(String[] args) {
        String[] op={"5","2","C","D","+"};
        System.out.println(calPoints(op));
    }
}
