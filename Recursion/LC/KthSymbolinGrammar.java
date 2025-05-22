public class KthSymbolinGrammar {
    public static int solve(String s,int n,int k,int curr){
        if(curr==n){
            return Character.getNumericValue(s.charAt(k-1));
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') str.append("01");
            else{
                str.append("10");
            }
        }   
        return solve(str.toString(), n, k, curr+1);
    }
    public static int kthGrammar(int n, int k) {
        return solve("0", n, k,1);
    }
    public static void main(String[] args) {
        System.out.println(kthGrammar(2, 1));
    }
}
