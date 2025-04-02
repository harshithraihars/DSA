import java.util.HashSet;

public class MoveXLAst {
    public static HashSet<Character> hs=new HashSet<>();
    public static String Move(String str,int i,StringBuilder newstr,int count){
        if(i==str.length()){
            while (count>0) {
                newstr.append('x');
                count--;
            }
            return newstr.toString();
        }
        if(str.charAt(i)!='x'){
            newstr.append(str.charAt(i));
            return Move(str, i+1, newstr, count);
        }else{
            return Move(str, i+1, newstr, count+1);
        }
    }

    public static String RemoveDuplicate(String str,int i,StringBuilder newstr){
        if(i==str.length()){
            return newstr.toString();
        }
        if(!hs.contains(str.charAt(i))){
            hs.add(str.charAt(i));
            newstr.append(str.charAt(i));
        }
        return RemoveDuplicate(str, i+1, newstr);
    }


    public static void main(String[] args) {
        StringBuilder str=new StringBuilder();
        // System.out.println(Move("hexxxll0", 0, str, 0));

        System.out.println(RemoveDuplicate("Hellooo", 0, str));
    }
}
