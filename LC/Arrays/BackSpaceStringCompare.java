public class BackSpaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        int sreduce=0;
        int treduce=0;
        int i=s.length()-1;
        int j=t.length()-1;
        while(i>=0 && j>=0){
            while(i>=0 && s.charAt(i)=='#'){
                sreduce+=1;
                i--;
            }
            while(j>=0 && s.charAt(j)=='#'){
                treduce+=1;
                j--;
            }
            i-=sreduce;
            j-=treduce;
            sreduce=0;
            treduce=0;
            while(i>=0 && s.charAt(i)=='#'){
                sreduce+=1;
                i--;
            }
            while(j>=0 && s.charAt(j)=='#'){
                treduce+=1;
                j--;
            }
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i--;
            j--;
            sreduce=0;
            treduce=0;
        }if(i>=0 || j>=0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="ab##";
        String s2="c#d#";
        System.out.println(backspaceCompare(s1, s2));
    }
}
