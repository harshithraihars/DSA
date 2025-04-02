public class printSubStrings {
    public static void printSubString(String str,int i,String newstr){
        if(i==str.length()){
            System.out.println(newstr);
            return;
        }
        printSubString(str, i+1, newstr+str.charAt(i));
        printSubString(str, i+1, newstr);
    }

    public static void StartandEnd(String str,int i,String newstr){
        if(i==str.length()){
            if(newstr.length()>0 && newstr.charAt(0)==newstr.charAt(newstr.length()-1)){
                System.out.println(newstr);
            }
            return;
        }
        StartandEnd(str, i+1, newstr+str.charAt(i));
        StartandEnd(str, i+1, newstr);
    }
    public static void main(String[] args) {
        // printSubString("abc", 0,"");
        StartandEnd("abcabc", 0, "");
    }
}
