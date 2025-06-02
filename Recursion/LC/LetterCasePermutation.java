import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation{
      public static void Solve(String s,int currindex,List<String> output,StringBuilder str){
        if(currindex==s.length()){
            output.add(str.toString());
            return;
        }
        char ch=s.charAt(currindex);
        if(Character.isLetter(ch)){
            boolean cap=Character.isUpperCase(ch);
            char newletter;
            if(cap){
                newletter=Character.toLowerCase(ch);
            }else{
                newletter=Character.toUpperCase(ch);
            }
            str.append(newletter);
            Solve(s,currindex+1,output,str);
            str.deleteCharAt(str.length()-1);
        }

        str.append(ch);
        Solve(s,currindex+1,output,str);
        str.deleteCharAt(str.length()-1);
    }

    public static List<String> letterCasePermutation(String s) {
        List<String> output=new ArrayList<>();
        Solve(s, 0, output,new StringBuilder(""));
        return output;
    }
    public static void main(String[] args) {
        System.out.println(letterCasePermutation("3z4"));
    }
}