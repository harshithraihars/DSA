public class KthBitinNthBinaryString {
    public static String reverseInvert(String s){
        StringBuilder str=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='0'){
                str.append("1");
            }else{
                str.append("0");
            }
        }
        return str.toString();
    }
    public static char solve(String s,int curr,int n,int k){
        if(curr==n){
            return s.charAt(k-1);
        }
        s=s+"1"+reverseInvert(s);
        return solve(s, curr+1, n, k);
    }
    public static char findKthBit(int n, int k) {
        return solve("0",1, n, k);
    }
    public static void main(String[] args) {
        System.out.println(findKthBit(3,1));
    }
}
