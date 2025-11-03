package Daily;

public class ReverseWords {
    public String reverseWords(String s) {
        StringBuilder str=new StringBuilder("");
        int start=s.length()-1;
        int end=start;
        while(start>=0){
            while(start>=0 && s.charAt(start)==' '){
                start--;
                end--;
            }
            if(start<0) break;
            while(start>=0 && s.charAt(start)!=' '){
                start--;
            }
            str.append(' ').append(s.substring(start+1,end+1));
            end=start;
        }

        str.deleteCharAt(0);
        return str.toString();
    }
}
