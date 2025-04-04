public class SubStringProblem {
    public static int countSubString(String str,int i,int j,int n){
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        int res=countSubString(str, i+1, j, n-1)+
        countSubString(str, i, j-1, n-1)-
        countSubString(str, i+1, j-1, n-2);
        if(str.charAt(i)==str.charAt(j)){
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        String str="abca";
        System.out.println(countSubString(str, 0, str.length()-1, str.length()));
    }
}
