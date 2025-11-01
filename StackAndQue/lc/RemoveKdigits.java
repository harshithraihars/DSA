import java.util.Stack;

public class RemoveKdigits{
    public static String removeKdigits(String num, int k) {
        Stack<Integer> stack=new Stack<>();
        int i=0;
        while(i<num.length()){
            int current=Character.getNumericValue(num.charAt(i));
            while(k>0 && !stack.isEmpty() && stack.peek()>current){
                    stack.pop();
                    k--;
            }
            stack.push(current);
            i++;
        }
        while(k>0){
            stack.pop();
            k--;
        }
        StringBuilder str=new StringBuilder("");
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
        String res=str.reverse().toString();
        i=0;
        while(i<res.length() && res.charAt(i)=='0') i++;
        String output=res.substring(i,res.length());
        if(output.isEmpty()) return "0";
        return output;
    }
    public static void main(String args[]){
        System.out.println(removeKdigits("10", 1));
    }
}