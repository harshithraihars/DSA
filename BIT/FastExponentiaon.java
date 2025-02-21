public class FastExponentiaon {
    public static int checkExponent(int a,int n){
        int ans=1;
        while (n>0) {
            if((n&1)!=0){
                ans*=a;
            }
            a*=a;
            n>>=1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(checkExponent(3, 5));
    }
}
