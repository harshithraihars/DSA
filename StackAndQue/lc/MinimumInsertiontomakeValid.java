package lc;

import java.util.Stack;

public class MinimumInsertiontomakeValid {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
        int min=0;
        for(Character ch:s.toCharArray()){
            if(ch==')'){
                if(!stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }else{
                stack.push(ch);
            }
        }
        return stack.size();
    }
}
